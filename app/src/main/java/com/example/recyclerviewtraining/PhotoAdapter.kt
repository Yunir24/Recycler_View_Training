package com.example.recyclerviewtraining

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtraining.databinding.MyPhotoBinding

class PhotoAdapter: RecyclerView.Adapter<PhotoAdapter.PhotoHolder>() {
    val listOfPhoto = mutableListOf<Plant>()


    class PhotoHolder(item: View) : RecyclerView.ViewHolder(item){
        val bind = MyPhotoBinding.bind(item)
        fun bindPhoto(plant: Plant) = with(bind){
            imageView.setImageResource(plant.imageId)
            textView.text = plant.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.my_photo,parent,false)
        return PhotoHolder(view)
    }

    override fun onBindViewHolder(holder: PhotoHolder, position: Int) {
        holder.bindPhoto(listOfPhoto[position])
    }

    override fun getItemCount(): Int {
        return listOfPhoto.size
    }
    fun addPhoto(plant: Plant){
        listOfPhoto.add(plant)
        notifyDataSetChanged()
    }
}