package com.example.lab6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide

class PicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pic_layout)
        //val picLink = intent.getStringExtra("picLink")
        //val img = findViewById<ImageView>(R.id.picView)
            //Glide.with(this).load(picLink).into(img)
        val image: ImageView = findViewById(R.id.picView)
        //val url: String? =
            //intent.getSerializableExtra("picLink") as String?
        val url: String? = intent.getStringExtra("picLink") as String?
        Toast.makeText(this,url,Toast.LENGTH_SHORT)
        Glide.with(this)
            .load(url)
            .into(image)


    }
}