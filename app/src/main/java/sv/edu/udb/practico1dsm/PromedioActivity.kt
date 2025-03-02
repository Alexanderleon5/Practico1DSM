package sv.edu.udb.practico1dsm
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PromedioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_promedio)

        val btnCalcularPromedio: Button = findViewById(R.id.btnCalcularPromedio)
        val etNombre: EditText = findViewById(R.id.etNombre)
        val etNota1: EditText = findViewById(R.id.etNota1)
        val etNota2: EditText = findViewById(R.id.etNota2)
        val etNota3: EditText = findViewById(R.id.etNota3)
        val etNota4: EditText = findViewById(R.id.etNota4)
        val etNota5: EditText = findViewById(R.id.etNota5)
        val tvResultado: TextView = findViewById(R.id.tvResultado)

        btnCalcularPromedio.setOnClickListener {
            val nombre = etNombre.text.toString()
            val nota1 = etNota1.text.toString().toDoubleOrNull() ?: 0.0
            val nota2 = etNota2.text.toString().toDoubleOrNull() ?: 0.0
            val nota3 = etNota3.text.toString().toDoubleOrNull() ?: 0.0
            val nota4 = etNota4.text.toString().toDoubleOrNull() ?: 0.0
            val nota5 = etNota5.text.toString().toDoubleOrNull() ?: 0.0

            if (nota1 in 0.0..10.0 && nota2 in 0.0..10.0 && nota3 in 0.0..10.0 && nota4 in 0.0..10.0 && nota5 in 0.0..10.0) {
                val promedio = (nota1 * 0.15) + (nota2 * 0.15) + (nota3 * 0.20) + (nota4 * 0.25) + (nota5 * 0.25)
                tvResultado.text = "Nombre: $nombre\nPromedio: $promedio\n${if (promedio >= 6.0) "Aprobado" else "Reprobado"}"
            } else {
                tvResultado.text = "Las notas deben estar entre 0 y 10"
            }
        }
    }
}