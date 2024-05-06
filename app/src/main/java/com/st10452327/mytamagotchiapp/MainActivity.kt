package com.st10452327.mytamagotchiapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //declare
    private lateinit var textView: TextView
    private lateinit var imageView: ImageView
    private lateinit var GetStarted: Button

    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialise
        textView =findViewById(R.id.intro)
        imageView =findViewById(R.id.imageView)
        GetStarted =findViewById(R.id.button)

        GetStarted.setOnClickListener{
          var intent = Intent(this,Main3Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}