package com.jamiltondamasceno.aulaactivityfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetalhesActivity : AppCompatActivity() {

    lateinit var buttonFechar: Button
    lateinit var textFilme: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        buttonFechar = findViewById(R.id.button_fechar)
        textFilme = findViewById(R.id.textFilme)

        val bundle = intent.extras//todos os parâmetros
        if ( bundle != null ){
            val filme = bundle.getString("filme")
            val classificacao = bundle.getInt("classificacao")
            val avaliacoes = bundle.getDouble("avaliacoes")

            val resultado = "filme: $filme - class. $classificacao aval. $avaliacoes"

            textFilme.text = resultado
        }

        buttonFechar.setOnClickListener {
            finish()//Finalizar
        }

    }
}