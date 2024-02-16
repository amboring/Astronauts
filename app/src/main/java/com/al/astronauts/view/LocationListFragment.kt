package com.al.astronauts.view

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.location.LocationManager.NETWORK_PROVIDER
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.IntentSenderRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.al.astronauts.R
import com.al.astronauts.databinding.FragmentLocationListBinding
import com.al.astronauts.di.ViewModelFactory
import com.al.astronauts.model.AstronautsState
import com.al.astronauts.model.ISSState
import com.al.astronauts.model.IssPosition
import com.al.astronauts.viewmodel.SpaceViewModel
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class LocationListFragment : Fragment(), LocationListener {

    private var _binding: FragmentLocationListBinding? = null
    private var locationManager: LocationManager?=null

    private val locationPermissionCode = 2
    private val LOCATION_PERMISSION_REQUEST_CODE = 1001

    private val binding get() = _binding!!

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val adapter = AstronautsAdapter()

    private val landingViewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[SpaceViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (requireActivity() as? MainActivity)?.appComponent?.inject(this)

        _binding = FragmentLocationListBinding.inflate(layoutInflater)
        binding.spaceViewModel = landingViewModel
        binding.lifecycleOwner = this
        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.S)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        observeData()
//        getLocation()
        val locationPermissionRequest = registerForActivityResult(
            ActivityResultContracts.RequestMultiplePermissions()
        ) { permissions ->
            when {
                permissions.getOrDefault(Manifest.permission.ACCESS_FINE_LOCATION, false) -> {
                    getLocation()
                }
                permissions.getOrDefault(Manifest.permission.ACCESS_COARSE_LOCATION, false) -> {
                    getLocation()
                } else -> {
                // No location access granted.
            }
            }
        }

        locationPermissionRequest.launch(arrayOf(
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION))

        lifecycleScope.launch(Dispatchers.IO){
            while(true) {
                makeServiceCall()
                delay(5000)
            }
        }

        binding.buttonViewMap.setOnClickListener {
            val userPosition = landingViewModel.userLocation.value
            val bundle = bundleOf(
                USER_POSITION to Gson().toJson(IssPosition(userPosition?.latitude.toString(),userPosition?.longitude.toString())),
                ISS_POSITION to Gson().toJson((landingViewModel.issState.value as? ISSState.HasISSLocation)?.location)
            )
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment,bundle)
        }
    }

    private fun requestLocationPermission() {
        // Request the ACCESS_FINE_LOCATION permission
        ActivityCompat.requestPermissions(requireActivity(), arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), LOCATION_PERMISSION_REQUEST_CODE)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            LOCATION_PERMISSION_REQUEST_CODE -> {
                // Check if the permission is granted
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // Permission is granted, proceed with location-related tasks
                    getLocation()
                } else {
                    // Permission is denied, handle accordingly (e.g., show a message)
                    Toast.makeText(requireContext(), "Location permission denied", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }




    private fun makeServiceCall() {
        landingViewModel.getAstronautsList()
        landingViewModel.getIssLocation()
    }
    private fun observeData() {
        landingViewModel.issState.observe(viewLifecycleOwner){
            when(it){
                is ISSState.Error-> Toast.makeText(context,"${it.msg}",Toast.LENGTH_SHORT).show()
                else -> Unit
            }
        }
        landingViewModel.astronautsState.observe(viewLifecycleOwner){
            when(it){
                is AstronautsState.HasAstronauts-> {
                    adapter.updateAstronauts(it.astronauts)
                    binding.astronautsList.layoutManager= LinearLayoutManager(context)
                    binding.astronautsList.adapter = adapter
                }
                is AstronautsState.Error-> Toast.makeText(context,"${it.msg}",Toast.LENGTH_SHORT).show()
                AstronautsState.Loading-> Unit
            }
        }
    }
    private fun getLocation() {
        locationManager = requireActivity().getSystemService(Context.LOCATION_SERVICE) as? LocationManager

        if (ContextCompat.checkSelfPermission(requireContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(requireActivity(), arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), locationPermissionCode)
        }
        if (ContextCompat.checkSelfPermission(requireContext(), Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            locationManager?.requestLocationUpdates(LocationManager.GPS_PROVIDER, 5000, 5f, this)
            locationManager?.requestLocationUpdates(NETWORK_PROVIDER, 5000, 5f, this)
        }
    }

    override fun onLocationChanged(p0: Location) {
        landingViewModel.userLocation.value = p0
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    companion object{
        const val USER_POSITION="USER LOCATION"
        const val ISS_POSITION ="ISS LOCATION"
    }
}