package com.example.recyclerviewtraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.recyclerviewtraining.databinding.ActivityMainBinding

class MainActivity3LinearLayout : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = PhotoAdapter()
    private val imageList = listOf(
        R.drawable.img10,
        R.drawable.img11,
        R.drawable.img12,
        R.drawable.img13,
        R.drawable.img14,
        R.drawable.img15,
        R.drawable.img16,
        R.drawable.img17,
        R.drawable.img18,
        R.drawable.img19,
        R.drawable.img20,
        R.drawable.img21,
        R.drawable.img22,
        R.drawable.img24,
        R.drawable.img3,
        R.drawable.img4,
        R.drawable.img5,
        R.drawable.img6,
        R.drawable.img7,
        R.drawable.img8,
        R.drawable.img9,
        R.drawable.img2,
        R.drawable.img23
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        inital()
    }

    private fun inital(){
        binding.apply {
            recyclerView.layoutManager = LinearLayoutManager(this@MainActivity3LinearLayout, RecyclerView.HORIZONTAL,false)
            recyclerView.adapter = adapter

        for(i in imageList.indices){
            adapter.addPhoto(Plant(imageList[i], "Пупсики $i"))
        }}
    }
}