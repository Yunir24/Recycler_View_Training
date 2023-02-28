package com.example.recyclerviewtraining

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recyclerviewtraining.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = PlantAdapter()
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
        init()

    }

    private fun init() {
        binding.apply {
            recyclerView.layoutManager = GridLayoutManager(this@MainActivity, 2)

            recyclerView.adapter = adapter
            for (coun in imageList.indices){
                adapter.addPlant(Plant(imageList[coun], "Пупсики $coun"))
            }

            button.setOnClickListener {
//                if (count >= imageList.size)
//                    count = 0
//                val plant = Plant(imageList[count], "Пупсики $count")
//                adapter.addPlant(plant)
//                count++
                val inten = Intent(this@MainActivity,MainActivity2::class.java)
                startActivity(inten)
            }
            button3.setOnClickListener {
                var inten = Intent(this@MainActivity,MainActivity3LinearLayout::class.java)
                startActivity(inten)
            }
        }

    }
}