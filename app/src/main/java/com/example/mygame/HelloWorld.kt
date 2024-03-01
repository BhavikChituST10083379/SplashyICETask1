package com.example.mygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HelloWorld : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world)

        val tw = findViewById<TextView>(R.id.textViewHelloWorld)
        val English = findViewById<Button>(R.id.btnEnglish)

        English.setOnClickListener{
            tw.text = "Hello World"
        }

        val Japanese = findViewById<Button>(R.id.btnJapanese)

        Japanese.setOnClickListener{
            tw.text = "こんにちは世界"
        }

        val Spanish = findViewById<Button>(R.id.btnSpanish)

        Spanish.setOnClickListener{
            tw.text = "Hola Mundo"
        }

        val German = findViewById<Button>(R.id.btnGerman)

        German.setOnClickListener{
            tw.text = "Hallo Welt"
        }

        val Zulu = findViewById<Button>(R.id.btnZulu)

        Zulu.setOnClickListener{
            tw.text = "Sawubona Mhlaba"
        }

        val Afrikaans = findViewById<Button>(R.id.btnAfrikaans)

        Afrikaans.setOnClickListener{
            tw.text = "Halo Wereld"
        }

        }
    }
