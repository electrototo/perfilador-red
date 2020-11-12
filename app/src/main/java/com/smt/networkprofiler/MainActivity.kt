package com.smt.networkprofiler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.squareup.picasso.MemoryPolicy
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var picasso: Picasso

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        picasso = Picasso.get()
    }

    fun onSmallImage(view: View) {
        picasso
            .load("https://upload.wikimedia.org/wikipedia/commons/thumb/2/25/Quetzalcoatl_magliabechiano.jpg/220px-Quetzalcoatl_magliabechiano.jpg")
            .memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE)
            .into(imageView)
    }

    fun onBigImage(view: View) {
        picasso
            .load("https://cdn.britannica.com/88/136488-050-9C5F0B67/Quetzalcoatl-Temple-of-Mexico-Teotihuacan.jpg")
            .memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE)
            .into(imageView)
    }
}