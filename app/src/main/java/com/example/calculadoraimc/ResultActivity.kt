package com.example.calculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val textView : TextView = findViewById(R.id.textView_result)
        val textViewClass : TextView = findViewById(R.id.textView_classificacao)
        val result = intent.getFloatExtra("EXTRA_RESULT",0.1f)

        textView.text = result.toString()

        val classificacao = if (result < 18.5f) {
              "ABAIXO DO PESO"
        }else if(result in 18.5f..24.9f) {
              "NORMAL"
        }else if(result in 25f..29.9f) {
              "SOBREPESO"
        }else if (result  in 30f..39.9f){
              "OBESIDADE"
        } else {"OBESIDADE GRAVE"}

        textViewClass.text = getString(R.string.classificacao,classificacao)



    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }


    }
