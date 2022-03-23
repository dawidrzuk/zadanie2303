package com.example.zadanie2303

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.lang.StringBuilder

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
            val wyswietl = StringBuilder()
            if (mezczyzna.isChecked) {
                wyswietl.append("Twoja plec to mezczyzna")
            }
            else if (kobieta.isChecked) {
                wyswietl.append("Twoja plec to kobieta")
            }
            wyswietl.append("\nTwoje zainteresowania to")
            if (sport.isChecked) {
                wyswietl.append("sport")
            }
            if (muzyka.isChecked) {
                wyswietl.append("muzyka")
            }
            if (gry.isChecked) {
                wyswietl.append("gry")
            }
            if (turystyka.isChecked) {
                wyswietl.append("turystyka")
            }
            Toast.makeText(applicationContext, wyswietl.toString(), Toast.LENGTH_LONG).show()

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