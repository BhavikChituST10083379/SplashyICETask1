package com.example.mygame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonNext = findViewById<ImageButton>(R.id.imageButton2)

        buttonNext.setOnClickListener {

            val Intent = Intent(this,HelloWorld::class.java);
            startActivity(Intent);
            finish();
        }
    }
}