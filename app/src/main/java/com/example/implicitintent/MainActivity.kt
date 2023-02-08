package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webbtn = findViewById<CardView>(R.id.btnwebview)
        val camerabtn = findViewById<CardView>(R.id.btncamera)

        webbtn.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.youtube.com/")
            startActivity(intent)
        }

        camerabtn.setOnClickListener {
          val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}