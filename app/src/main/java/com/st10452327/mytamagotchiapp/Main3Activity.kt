package com.st10452327.mytamagotchiapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar

class Main3Activity : AppCompatActivity() {
    //declare
    private lateinit var imageView: ImageView
    private lateinit var Feed : Button
    private lateinit var Clean: Button
    private lateinit var Play : Button
    private lateinit var Feedbar:ProgressBar
    private lateinit var Cleanbar:ProgressBar
    private lateinit var Playbar:ProgressBar

    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        //initialise
        imageView =findViewById(R.id.imageView)
        Feed =findViewById(R.id.Feedbutton)
        Clean =findViewById(R.id.Cleanbutton)
        Play =findViewById(R.id.Playbutton)
        Feedbar =findViewById(R.id.Feedbar)
        Cleanbar =findViewById(R.id.Cleanbar)
        Playbar =findViewById(R.id.Playbar)

             //increase the progressbar by 50

             Feed.setOnClickListener{
                 imageView.setImageResource(R.drawable.img_5)
                 Feedbar.incrementProgressBy(50)
             }

             Clean.setOnClickListener{
                 imageView.setImageResource(R.drawable.img_4)
                 Cleanbar.incrementProgressBy(50)
             }

             Play.setOnClickListener{
                 imageView.setImageResource(R.drawable.img_3)
                 Playbar.incrementProgressBy(50)
             }
    }
}