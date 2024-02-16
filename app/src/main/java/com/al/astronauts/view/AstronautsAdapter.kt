package com.al.astronauts.view

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.al.astronauts.R
import com.al.astronauts.databinding.ItemAstronautBinding
import com.al.astronauts.model.People

class AstronautsAdapter : RecyclerView.Adapter<AstronautItemHolder>() {
    private var astronauts: MutableList<People> = mutableListOf()

    private var context: Context? = null

    fun updateAstronauts(data:List<People>){
        astronauts.clear()
        astronauts.addAll(data)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AstronautItemHolder {
        context = parent.context
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding = ItemAstronautBinding.inflate(layoutInflater, parent, false)
        return AstronautItemHolder(itemBinding, astronauts, context)
    }

    override fun getItemCount(): Int {
        return astronauts.size
    }

    override fun onBindViewHolder(holder: AstronautItemHolder, position: Int) {
       holder.bind(astronauts[position], position)
    }
}

class AstronautItemHolder(
    val binding: ItemAstronautBinding,
    val astronauts: List<People>,
    val context: Context?
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(astronaut: People, index: Int) {
        binding.currentLocation.text =
            context?.getString(R.string.astronaut_name_title, astronaut.name, astronaut.craft)
    }
}