package com.example.calculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btncalcular: Button = findViewById(R.id.btncalcular)
        val editAltura : EditText = findViewById(R.id.editAltura)
        val editPeso : EditText = findViewById(R.id.editPeso)

        btncalcular.setOnClickListener {

            val alturaStr = editAltura.text.toString()
            val pesoStr = editPeso.text.toString()
            if (alturaStr.isNotEmpty() && pesoStr.isNotEmpty()) {

                val altura: Float = alturaStr.toFloat()
                val peso: Float = pesoStr.toFloat()

                val alturaUser: Float = altura * altura
                val pesoUser: Float = peso
                val result = peso / altura


                val intents = Intent(this, ResultActivity::class.java)
                    .apply {
                        putExtra("EXTRA_RESULT", result)}
                startActivity(intents) }
            else{
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()}


        }







    }

    }