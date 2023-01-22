package com.example.programacion_movil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class felix_analisis_dimencional : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.felix_analisis_dimencional)

    val avanza= findViewById<Button>(R.id.sigui)
    avanza.setOnClickListener {
        val lanzar = Intent(this, felix_segunda::class.java)
        startActivity(lanzar)
        }
    }

}