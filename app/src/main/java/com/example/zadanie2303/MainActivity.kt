package com.example.zadanie2303

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mezczyzna = findViewById<RadioButton>(R.id.mezczyzna)
        val kobieta = findViewById<RadioButton>(R.id.kobieta)
        val wiek = findViewById<EditText>(R.id.wiek)
        val sport = findViewById<CheckBox>(R.id.checkBox)
        val muzyka = findViewById<CheckBox>(R.id.checkBox2)
        val turystyka = findViewById<CheckBox>(R.id.checkBox3)
        val gry = findViewById<CheckBox>(R.id.checkBox4)

        findViewById<Button>(R.id.button).setOnClickListener {
            mezczyzna.isEnabled = false;
            kobieta.isEnabled = false;
            turystyka.isEnabled = false;
            sport.isEnabled = false;
            muzyka.isEnabled = false;
            gry.isEnabled = false;
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            mezczyzna.isEnabled = true;
            kobieta.isEnabled = true;
            turystyka.isEnabled = true;
            sport.isEnabled = true;
            muzyka.isEnabled = true;
            gry.isEnabled = true;
        }

    }

}