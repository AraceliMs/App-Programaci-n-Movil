package com.example.programacion_movil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ReynoldsEjercicios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reynolds_ejercicios)
        val ejercicios: Array<Ejercicio> = arrayOf(
            Ejercicio("Calcule la velocidad mínima de flujo en pies/s y en m/s de agua al 160 °F que fluye en un conducto de 2pulg de diámetro, para la cual el flujo es turbulento.\n" +
                    "Datos\n" +
                    "Diámetro = 4 pulg =0.332\n" +
                    "pieQ = 0.20 pie³\n" +
                    " /sSg(\n" +
                    "glicerina\n" +
                    ")= 1.26Tº = 100 °FTipo de flujo = ? A= 0.087pie²\n" +
                    "V= 2.29pie/sDensidad= 2.44 slogs/pie³\n" +
                    "Viscosidad dina a 100 ºF = 7.5x10³lb.s/pie³", "V=0.105pie/s"),
            Ejercicio("Una tubería de 4 pulg de diámetro conduce 0.20 pie³/S de glicerina (sg = 1.26) a 100°F. ¿El flujo es laminar o turbulento? \n" +
                "V min= ? en pie/s y m/s \n" +
                    "T= 160 ºF\n" +
                    "Diámetro= 2 pulg = 0.16 pie\n" +
                    "Flujo = turbulento\n" +
                    "va 160ºF = 4.38 x 10^-6 pie²\n" +
                    "NR = 4000 es turbulento", "laminar"),
            Ejercicio("Calcule el máximo flujo volumétrico de combustoleo a 4ºC, en la que el flujopermanecerá como laminar en tubería de 100 mm de diámetro. Para el combustoleoutilice sg = 0.895 y viscosidad dinámica = 4.0 X 10 Pa.s.\n" +
                    "Datos\n" +
                    "Q max=?\n" +
                    "T = 4ºCNR = 2000 es laminar\n" +
                    "Diámetro=100mm= 0.1m\n" +
                    "Sg = 0.895\n" +
                    "Viscosidad dinámica = 4.0 X 10^-2\" Pa.s.\n" + "" +
                    "Densidad combustoleo = 895kg/m³\n" +
                    " A=7.854x10^-3 m²", "Q=7.0136x10^-3m3/s"),
            Ejercicio("Un conducto de 4pulg de diámetro lleva 0.20 pies3/s de glicerina (sg=1.26) a 100° F. ¿Es el flujo laminar o turbulento?", "laminar"),
            Ejercicio("Calcule la velocidad mínima de flujo en pies/s y en m/s de agua al 160 °F que fluye en un conducto de 2pulg de diámetro, para la cual el flujo es turbulento.\n" +
                    "Datos\n" +
                    "Vmin=?  (Pie/s y m/s)\n" +
                    "Fluido Agua a 160°F\n" +
                    "γ = 4,38x10-6 pie2/s \n" +
                    "D= 21 inch x 1  pie/12 inch  = 0,167 pie", "V=0.032m/s"),
        )
        val aleatorio = (0..5).shuffled().last()
        val txtEjercicio: TextView = findViewById(R.id.txtEjercicioR)
        val txtRespuesta: EditText = findViewById(R.id.inputRespuestaR)
        val txtResultado: TextView = findViewById(R.id.txtResultadoR)
        val ejercicio = ejercicios.get(aleatorio)
        txtEjercicio.setText(ejercicio.ejercicio)

        val btnComprobar: Button = findViewById(R.id.btnComprobarR)
        btnComprobar.setOnClickListener {
            txtResultado.setText(if(txtRespuesta.text.toString() == ejercicio.resultado) "¡Respuesta Correcta!" else "Respuesta Incorrecta :(" )
        }

        val regresar : Button =findViewById(R.id.btnRegresarR)
        regresar.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
    }
}