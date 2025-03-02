package sv.edu.udb.practico1dsm
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnPromedio: Button = findViewById(R.id.BtnPromedio)
        btnPromedio.setOnClickListener {
            val intent = Intent(this, PromedioActivity::class.java)
            startActivity(intent)
        }


        val btnSalario: Button = findViewById(R.id.BtnSalario)
        btnSalario.setOnClickListener {
            val intent = Intent(this, DescuentosActivity::class.java)
            startActivity(intent)
        }


        val btnCalculadora: Button = findViewById(R.id.BtnCalculadora)
        btnCalculadora.setOnClickListener {
            val intent = Intent(this, CalculadoraActivity::class.java)
            startActivity(intent)
        }
    }
}