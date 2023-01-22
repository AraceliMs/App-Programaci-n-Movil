package com.example.programacion_movil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class crear_usuario_datos_generales : AppCompatActivity() {

    lateinit var handler: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_usuario_datos_generales)

        handler = DatabaseHelper(this)

        val registrar = findViewById<Button>(R.id.registrar)
        val celular = findViewById<EditText>(R.id.celularNuevo)
        val nombre = findViewById<EditText>(R.id.nombre)
        val aMaterno = findViewById<EditText>(R.id.aMaterno)
        val aPaterno = findViewById<EditText>(R.id.aPaterno)
        val edad = findViewById<EditText>(R.id.edad)
        val password = findViewById<EditText>(R.id.passwordNuevo)
        val spinner: Spinner = findViewById(R.id.roleSpinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.roles,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

        registrar.setOnClickListener {
            val tipo = spinner.selectedItem.toString();
            val nombreValue = nombre.text.toString()
            val aPaternoValue = aPaterno.text.toString()
            val aMaternoValue = aMaterno.text.toString()
            val celularValue = celular.text.toString()
            val passwordValue = password.text.toString()
            val edadValue = if (edad.text.toString() == "") 0 else Integer.parseInt(edad.text.toString())
            if(tipo == "" || nombreValue == "" || aPaternoValue == "" || celularValue == "" || passwordValue == "" || edadValue == 0){
                Toast.makeText(this, "Por favor complete todos los datos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener;
            }

            handler.registerUser(nombreValue, aPaternoValue, aMaternoValue, celularValue, passwordValue, edadValue, tipo)
            Toast.makeText(this, "Usuario registrado con éxito", Toast.LENGTH_SHORT).show()
            val lanzar = Intent(this, login::class.java)
            startActivity(lanzar)
        }

    }
}