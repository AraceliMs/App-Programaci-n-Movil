package com.example.programacion_movil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class pagina2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina2)
        val btn1 : Button =findViewById(R.id.button3)
        btn1.setOnClickListener{
            val intent: Intent = Intent(this, pagina3:: class.java)
            startActivity(intent)
        }

    }
}