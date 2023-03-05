package com.example.activitylifecycledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

//Activity life cycle demo
class MainActivity : AppCompatActivity() {

    //First Method which creates Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "onCreate Called!", Toast.LENGTH_SHORT).show()
    }

    //This callback starts the activity
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart Called!", Toast.LENGTH_SHORT).show()
    }

    //When activity is active foreground
    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume Called!", Toast.LENGTH_SHORT).show()
    }

    //When activity is paused. Mean when another activity comes up
    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause Called!", Toast.LENGTH_SHORT).show()
    }

    //to stop activity when we closes app
    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop Called!", Toast.LENGTH_SHORT).show()
    }

    //Finally to destroy the activity from activity stack
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy Called!", Toast.LENGTH_SHORT).show()
    }

}