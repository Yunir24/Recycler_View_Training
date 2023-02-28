package com.example.recyclerviewtraining

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtraining.databinding.MyPhotoBinding


class PlantAdapter: RecyclerView.Adapter<PlantAdapter.PlantHolder>() {
    val plantList = mutableListOf<Plant>()



    class PlantHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = MyPhotoBinding.bind(item)
        fun bind(plant: Plant) = with(binding) {
            imageView.setImageResource(plant.imageId)
            textView.text = plant.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.my_photo, parent, false)
        return PlantHolder(view)
    }

    override fun onBindViewHolder(holder: PlantHolder, position: Int) {
        val plant = plantList[position]
        holder.bind(plant)


    }

    override fun getItemCount(): Int {
        return plantList.size
    }

    fun addPlant(plant: Plant){
        plantList.add(plant)
        notifyDataSetChanged()
    }

}