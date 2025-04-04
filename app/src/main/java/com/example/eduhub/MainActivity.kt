package com.example.eduhub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn = findViewById<Button>(R.id.button)
        val instbtn = findViewById<ImageView>(R.id.imageView4)
        val linkbtn = findViewById<ImageView>(R.id.imageView2)


        btn.setOnClickListener{
            val intent= Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        instbtn.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.instagram.com/anug.6768?igsh=bG00b3EwOWN6dnBv")
            startActivity(intent)
        }
        linkbtn.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.linkedin.com/in/anurag-mishra-725873282?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app")
            startActivity(intent)
        }
    }
}