package sv.edu.udb.practico1dsm

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalculadoraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        val BtnCalcularOperacion: Button = findViewById(R.id.BtnCalcularOperacion)
        val TxtOperando1: EditText = findViewById(R.id.TxtOperando1)
        val TxtOperando2: EditText = findViewById(R.id.TxtOperando2)
        val TxtOperacion: EditText = findViewById(R.id.TxtOperacion)
        val TxtResultadoCalculadora: TextView = findViewById(R.id.TxtResultadoCalculadora)

        BtnCalcularOperacion.setOnClickListener {
            val operando1 = TxtOperando1.text.toString().toDoubleOrNull() ?: 0.0
            val operando2 = TxtOperando2.text.toString().toDoubleOrNull() ?: 0.0
            val operacion = TxtOperacion.text.toString()

            val resultado = when (operacion) {
                "+" -> operando1 + operando2
                "-" -> operando1 - operando2
                "*" -> operando1 * operando2 // Multiplicación
                "/" -> if (operando2 != 0.0) operando1 / operando2 else "Error: División por cero"
                "^" -> Math.pow(operando1, operando2)
                "√" -> Math.sqrt(operando1)
                else -> "Operación no válida"
            }

            TxtResultadoCalculadora.text = "Resultado: $resultado"
        }
    }
}