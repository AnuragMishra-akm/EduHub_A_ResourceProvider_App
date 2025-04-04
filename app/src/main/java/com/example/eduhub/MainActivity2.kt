package com.example.eduhub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val apps = findViewById<CardView>(R.id.appcard)
        val webs = findViewById<CardView>(R.id.webcard)
        val iosc = findViewById<CardView>(R.id.ioscard)
        val blockcrd = findViewById<CardView>(R.id.blockcard)
        val aicrd = findViewById<CardView>(R.id.aicard)
        val dsacrd = findViewById<CardView>(R.id.dsacard)
        val contactbtn = findViewById<Button>(R.id.button2)

        apps.setOnClickListener{
            val intent= Intent(this,android::class.java)
            startActivity(intent)
        }

        webs.setOnClickListener{
            val intent= Intent(this,web::class.java)
            startActivity(intent)
        }

        iosc.setOnClickListener{
            val intent= Intent(this,ios::class.java)
            startActivity(intent)
        }

        blockcrd.setOnClickListener{
            val intent= Intent(this,blockchaindevelopment::class.java)
            startActivity(intent)
        }
        aicrd.setOnClickListener{
            val intent= Intent(this,AI::class.java)
            startActivity(intent)
        }
        dsacrd.setOnClickListener{
            val intent= Intent(this,dsa::class.java)
            startActivity(intent)
        }
        contactbtn.setOnClickListener{
            val intent= Intent(Intent.ACTION_DIAL)
            intent.data= Uri.parse("+919161463066")
            startActivity(intent)
        }

    }
}