package com.example.programacion_movil


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class num_raynols : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.num_raynols)
        val btn : Button =findViewById(R.id.button2)
        btn.setOnClickListener{
            val intent: Intent = Intent(this, pagina2:: class.java)
            startActivity(intent)
        }


    }
}