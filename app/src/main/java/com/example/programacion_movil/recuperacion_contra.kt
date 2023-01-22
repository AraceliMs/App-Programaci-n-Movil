package com.example.programacion_movil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class recuperacion_contra : AppCompatActivity() {

    lateinit var handler: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperacion_contra)

        handler = DatabaseHelper(this)

        val buscar = findViewById<Button>(R.id.buscar)
        val celular = findViewById<EditText>(R.id.celularCheck)
        val password = findViewById<TextView>(R.id.passwordFound)
        buscar.setOnClickListener {
            password.setText(handler.obtainPassword(celular.text.toString()))
        }
    }
}