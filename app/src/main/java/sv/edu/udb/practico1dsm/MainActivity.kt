package com.example.tresejercicios

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Botón 1: Navegar a PromedioActivity
        BtnPromedio.setOnClickListener {
            val intent = Intent(this, PromedioActivity::class.java)
            startActivity(intent)
        }

        // Botón 2: Navegar a DescuentosActivity
        BtnSalario.setOnClickListener {
            val intent = Intent(this, DescuentosActivity::class.java)
            startActivity(intent)
        }

        // Botón 3: Navegar a CalculadoraActivity
        BtnCalculadora.setOnClickListener {
            val intent = Intent(this, CalculadoraActivity::class.java)
            startActivity(intent)
        }
    }
}