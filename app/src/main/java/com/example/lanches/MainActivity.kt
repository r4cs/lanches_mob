package com.example.lanches

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val coxinhas = findViewById<EditText>(R.id.qtdeCoxText)
        val bebidas = findViewById<EditText>(R.id.qtdeBebText)

        val calculaBtn = findViewById<Button>(R.id.button)
        calculaBtn.setOnClickListener {
            calculateAndShowResult()
        }

        fun calculateAndShowResult() {
            val qtdeCoxinhas = coxinhas.text.toString().toInt()
            val qtdeBebidas = bebidas.text.toString().toInt()

            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra(Tela2Activity.....)
        }
    }
}