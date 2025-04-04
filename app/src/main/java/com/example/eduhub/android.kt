package com.example.eduhub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class android : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_android)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val java= findViewById<Button>(R.id.button5)
        val kotlin = findViewById<Button>(R.id.button4)
        val and= findViewById<Button>(R.id.button3)

       java.setOnClickListener{
           val intent= Intent(Intent.ACTION_VIEW)
           intent.data= Uri.parse("https://www.geeksforgeeks.org/free-java-course-for-beginners/")
           startActivity(intent)
       }

        kotlin.setOnClickListener{
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://youtu.be/F9UC9DY-vIU?si=MaeyjZp1VEyPj2Wl")
            startActivity(intent)
        }

        and.setOnClickListener{
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://youtu.be/mOYN9HlfTgo?si=hi1Eg5Q0mYiNht24")
            startActivity(intent)
        }

    }
}