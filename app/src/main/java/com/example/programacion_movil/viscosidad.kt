package com.example.programacion_movil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class viscosidad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viscosidad)
        val btn1 : Button =findViewById(R.id.button5)
        btn1.setOnClickListener{
            val intent: Intent = Intent(this, ViscosidadEjercicios:: class.java)
            startActivity(intent)
        }

    }
}