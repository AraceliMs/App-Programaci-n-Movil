package com.example.programacion_movil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1=findViewById<Button>(R.id.button2)
        boton1.setOnClickListener {
            val lanzar = Intent(this, viscosidad::class.java)
            startActivity(lanzar)
        }

        val analisis = findViewById<Button>(R.id.analisis)
        analisis.setOnClickListener {
            val lanzar = Intent(this, felix_analisis_dimencional::class.java)
            startActivity(lanzar)

        }

        val raynol = findViewById<Button>(R.id.button3)
        raynol.setOnClickListener {
            val lanzar = Intent(this, num_raynols::class.java)
            startActivity(lanzar)

        }


    }



}