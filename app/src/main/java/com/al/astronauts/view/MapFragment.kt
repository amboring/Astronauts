package com.al.astronauts.view

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.al.astronauts.R
import com.al.astronauts.databinding.FragmentMapBinding
import com.al.astronauts.model.IssPosition
import com.al.astronauts.util.BitmapProcessor.Companion.getBitmapFromDrawable
import com.al.astronauts.view.LocationListFragment.Companion.ISS_POSITION
import com.al.astronauts.view.LocationListFragment.Companion.USER_POSITION
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.gson.Gson

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class MapFragment : Fragment(), OnMapReadyCallback {

    private var _binding: FragmentMapBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMapBinding.inflate(inflater, container, false)

        binding.mapView.onCreate(savedInstanceState)
        binding.mapView.getMapAsync(this)

        return binding.root

    }

    override fun onResume() {
        super.onResume()
        binding.mapView.onResume()
    }

    override fun onPause() {
        super.onPause()
        binding.mapView.onPause()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


    override fun onDestroy() {
        super.onDestroy()
        binding.mapView.onDestroy()
        _binding = null
    }

    override fun onLowMemory() {
        super.onLowMemory()
        binding.mapView.onLowMemory()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        binding.mapView.onSaveInstanceState(outState)
    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onMapReady(p0: GoogleMap) {
        val userLocation =
            Gson().fromJson(arguments?.getString(USER_POSITION), IssPosition::class.java)
        val ua = userLocation?.latitude
        val ul = userLocation?.longitude
        if (ua != "null" && !ua.isNullOrEmpty() && ul != "null" && !ul.isNullOrEmpty()) {
            val userPosition = LatLng(ua.toDouble(), ul.toDouble())
            p0.addMarker(
                MarkerOptions().position(userPosition).title("You").icon(
                    BitmapDescriptorFactory.fromBitmap(getBitmapFromDrawable(resources.getDrawable(R.drawable.user_location)))
                )
            )
            p0.moveCamera(CameraUpdateFactory.newLatLngZoom(userPosition, 12f))

        }
        val issLocation =
            Gson().fromJson(arguments?.getString(ISS_POSITION), IssPosition::class.java)
        val ia = issLocation?.latitude
        val il = issLocation?.longitude

        if (ia != "null" && !ia.isNullOrEmpty() && il != "null" && !il.isNullOrEmpty()) {
            val issPosition = LatLng(ia.toDouble(), il.toDouble())
            Log.i("alalal", "adding mark $issLocation")
            p0.addMarker(
                MarkerOptions().position(issPosition).title("ISS").icon(
                    BitmapDescriptorFactory.fromBitmap(getBitmapFromDrawable(resources.getDrawable(R.drawable.rocket)))
                )
            )
        }
    }
}