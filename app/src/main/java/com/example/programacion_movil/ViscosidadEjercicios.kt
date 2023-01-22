package com.example.programacion_movil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ViscosidadEjercicios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viscosidad_ejercicios)
        val ejercicios: Array<Ejercicio> = arrayOf(
            Ejercicio("Entre los extremos de un tubo de 0,006 m de diámetro y 1 m de longitud, se aplica una \n" +
                    "diferencia de presión relativa de 50.000 Pa. Si el caudal que fluye es de \n" +
                    "-6 3 Q = 3,5 10 m s × , halle la viscosidad del fluido circulante (considerando régimen \n" +
                    "laminar). Compruebe la veracidad de esta hipótesis. ", "μ=0.4547N*S/m²"),
            Ejercicio("Halle la potencia necesaria para mantener una velocidad angular constante de 10 rad/s \n" +
                    "en el viscosímetro cilíndrico. \n" +
                "Datos: \n" +
                    "H = 10 cm \n" +
                    "R1 = 3 cm \n" +
                    "h = 0,1 cm \n" +
                    "μ = 7·10-3 N·s/m2", "NT=0,0127[W]"),
            Ejercicio("Dos placas paralelas planas cuadradas con dimensiones de 60cm x 60cm. La película de aceite con espesor de 12,5 mm existe entre las dos placas, la placa superior que se mueve a 2,5 m/s requiere una fuerza de 9.81 N para mantener la velocidad y la placa inferior es estacionaria.  Determinar  la  viscosidad  dinámica  del  aceite  en  Poise  y  la  viscosidad cinemática del aceite en Stokes si la gravedad específica del aceite es 0,95.", "μ=0.136[Pa.s]"),
            Ejercicio("película de aceite de 3 [mm] de espesor con μ = 0,38 [Ns/m²] entre dos discos idénticos de 30 [cm] de diámetro. Cuando el eje de conducción gira a una velocidad de 1450 [rpm], se observa que el eje accionado gira a 1398 [rpm]. Suponiendo un perfil de velocidad lineal para la película, determine el par de torsión transmitido en [lbf.ft]", "T=0.405[lbf.ft]"),
            Ejercicio("Una capa delgada de glicerina fluye hacia abajo de una placa inclinada, ancha con la distribución de la velocidad mostrada en la figura. Para h = 0.3 [in] y α= 20°, determine la velocidad de la superficie, U. tenga en cuenta que, para el equilibrio, el componente de peso que actúa en paralelo a la superficie de la placa debe ser equilibrado por la fuerza de cizalladura desarrollada a lo largo de la superficie de la placa. En el análisis, suponga un ancho de unidad. Exprese su velocidad en [ft/s].", "U=0.285[ft/s]")
            //Ejercicio("Una hielera de espuma de poliestireno tiene una superficie total de  0,950m2  y paredes con un grosor medio de 2,50 cm. La caja contiene hielo, agua y bebidas enlatadas a  0°C.  El interior de la caja se mantiene frío gracias al hielo derretido. ¿Cuánto hielo se derrite en un día si la hielera se guarda en el maletero de un automóvil a  35,0°C ?", "m=3.44kg"),
            //Ejercicio("Una varilla de acero y una varilla de aluminio, cada una de ellas de 1,00 cm de diámetro y 25,0 cm de longitud, se sueldan extremo a extremo. Un extremo de la varilla de acero se coloca en un gran tanque de agua hirviendo a  100°C , mientras que el extremo más alejado de la varilla de aluminio se coloca en un gran tanque de agua a  20°C . Las varillas están aisladas para que no se escape el calor de su superficie. ¿Cuál es la temperatura en la unión y cuál es la velocidad de conducción del calor a través de esta varilla compuesta?", "T=41.3°C"),
            //Ejercicio("Una persona promedio produce calor a una de 120 W aproximadamente cuando está en reposo. ¿A qué velocidad debe evaporarse el agua del cuerpo para deshacerse de toda esta energía? (Para simplificar, suponemos que esta evaporación se produce cuando una persona está sentada a la sombra y las temperaturas circundantes son las mismas que la temperatura de la piel, lo que elimina la transferencia de calor por otros métodos).", "m/t=2.96g/min"),
        )
        val aleatorio = (0..5).shuffled().last()
        val txtEjercicio: TextView = findViewById(R.id.txtEjercicioV)
        val txtRespuesta: EditText = findViewById(R.id.inputRespuestaV)
        val txtResultado: TextView = findViewById(R.id.txtResultadoV)
        val ejercicio = ejercicios.get(aleatorio)
        txtEjercicio.setText(ejercicio.ejercicio)

        val btnComprobar: Button = findViewById(R.id.btnComprobarV)
        btnComprobar.setOnClickListener {
            txtResultado.setText(if(txtRespuesta.text.toString() == ejercicio.resultado) "¡Respuesta Correcta!" else "Respuesta Incorrecta :(" )
        }

        val regresar : Button =findViewById(R.id.btnRegresarMenuV)
        regresar.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
    }
}