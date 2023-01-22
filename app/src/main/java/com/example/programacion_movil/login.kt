package com.example.programacion_movil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class login : AppCompatActivity() {

    lateinit var handler: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        handler = DatabaseHelper(this)

        val entrar = findViewById<Button>(R.id.entrar_app)
        val btnTablaUsuarios = findViewById<Button>(R.id.btnTablaUsuarios)
        val celular = findViewById<EditText>(R.id.celular)
        val password = findViewById<EditText>(R.id.password)
        entrar.setOnClickListener {
            if(handler.login(celular.text.toString(), password.text.toString())) {
                val lanzar = Intent(this, MainActivity::class.java)
                startActivity(lanzar)
            } else {
                Toast.makeText(this, "Celular o password inválidos", Toast.LENGTH_SHORT).show()
            }
        }

        btnTablaUsuarios.setOnClickListener {
            val lanzar = Intent(this, UsersTable::class.java)
            startActivity(lanzar)
        }

        val registrar = findViewById<Button>(R.id.registrar)
        registrar.setOnClickListener {
            val lanzar = Intent(this, crear_usuario_datos_generales::class.java)
            startActivity(lanzar)

        }

        val recuperar = findViewById<Button>(R.id.recuperaar)
        recuperar.setOnClickListener {
            val lanzar = Intent(this, recuperacion_contra::class.java)
            startActivity(lanzar)

        }
    }
}