package sv.edu.udb.practico1dsm

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.DecimalFormat

class DescuentosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_descuentos)

        val btnCalcularSalario: Button = findViewById(R.id.BtnCalcularSalario)
        val etNombreEmpleado: EditText = findViewById(R.id.TxtNombreEmpleado)
        val etSalarioBase: EditText = findViewById(R.id.TxtSalarioBase)
        val tvResultadoSalario: TextView = findViewById(R.id.TxtResultadoSalario)

        btnCalcularSalario.setOnClickListener {
            val nombre = etNombreEmpleado.text.toString()
            val salarioBase = etSalarioBase.text.toString().toDoubleOrNull() ?: 0.0

            val afp = salarioBase * 0.0725
            val isss = salarioBase * 0.03
            val renta = calcularRenta(salarioBase)
            val salarioNeto = salarioBase - renta - afp - isss

            // Formatear los valores a dos decimales
            val formato = DecimalFormat("#.##")
            val afpFormateado = formato.format(afp)
            val isssFormateado = formato.format(isss)
            val rentaFormateada = formato.format(renta)
            val salarioNetoFormateado = formato.format(salarioNeto)

            // Mostrar los resultados formateados
            tvResultadoSalario.text = """
                Nombre: $nombre
                AFP: $afpFormateado
                ISSS: $isssFormateado
                Renta: $rentaFormateada
                Salario Neto: $salarioNetoFormateado
            """.trimIndent()
        }
    }

    private fun calcularRenta(salario: Double): Double {
        return when {
            salario <= 472.00 -> 0.0
            salario <= 895.24 -> (salario - 472.00) * 0.10 + 17.67
            salario <= 2038.10 -> (salario - 895.24) * 0.20 + 60.00
            else -> (salario - 2038.10) * 0.30 + 288.57
        }
    }
}