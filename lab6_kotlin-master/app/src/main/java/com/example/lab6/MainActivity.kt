package com.example.lab6

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button = findViewById<Button>(R.id.btn_show_pic)
        button.setOnClickListener {
            val intent = Intent(this, PicActivity::class.java)
            intent.type = "text/plain"

            val picLink = "https://www.meme-arsenal.com/memes/2790627fafb43142b0d21edb1a5072e3.jpg"

            intent.putExtra("picLink", picLink)
            startActivity(Intent.createChooser(intent, "picLink"))
        }
    }

}