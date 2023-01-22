package com.example.programacion_movil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class AnalisisDimensionalEjercicios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_analisis_dimensional_ejercicios)
        val ejercicios: Array<Ejercicio> = arrayOf(
            Ejercicio("x=vt+(1/2)at²", "[L]=[L]"),
            Ejercicio("v²=v²+2ax", "[-LT]=[-LT]"),
            Ejercicio("k=1/2mv²", "[K]=[L²(-MT)²]"),
            Ejercicio("a=b*a", "[L²]"),
            Ejercicio("z=x+y", "[z]=M"),
        )
        val aleatorio = (0..5).shuffled().last()
        val txtEjercicio: TextView = findViewById(R.id.txtEjercicioV)
        val txtRespuesta: EditText = findViewById(R.id.inputRespuesta)
        val txtResultado: TextView = findViewById(R.id.txtResultado)
        val ejercicio = ejercicios.get(aleatorio)
        txtEjercicio.setText(ejercicio.ejercicio)

        val btnComprobar: Button = findViewById(R.id.btnComprobar)
        btnComprobar.setOnClickListener {
            txtResultado.setText(if(txtRespuesta.text.toString() == ejercicio.resultado) "¡Respuesta Correcta!" else "Respuesta Incorrecta :(" )
        }

        val regresar : Button =findViewById(R.id.btnRegresarMenuA)
        regresar.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
    }
}