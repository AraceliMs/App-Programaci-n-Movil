package com.example.programacion_movil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class felix_segunda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.felix_segunda)
        val btnPracticar= findViewById<Button>(R.id.btnPracticar)
        btnPracticar.setOnClickListener {
            val ejercicios = Intent(this, AnalisisDimensionalEjercicios::class.java)
            startActivity(ejercicios)
        }
    }
}