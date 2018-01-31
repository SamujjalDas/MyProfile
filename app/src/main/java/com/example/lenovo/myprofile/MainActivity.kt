package com.example.lenovo.myprofile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var photo: ImageView? =null
    var eduButton: Button? =null
    var workButton: Button? =null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        photo= findViewById(R.id.profilePhoto)
        photo?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity,ProfilePhoto::class.java)
            startActivity(clickIntent)
        })
        eduButton= findViewById(R.id.buttonEducation)
        eduButton?.setOnClickListener({
            var clickIntent =Intent(this@MainActivity,ProfileEducation::class.java)
            startActivity(clickIntent)
        })
        workButton= findViewById(R.id.buttonWork)
        workButton?.setOnClickListener({
            var clickIntent =Intent(this@MainActivity,ProfileExperiance::class.java)
            startActivity(clickIntent)
        })
    }
}
