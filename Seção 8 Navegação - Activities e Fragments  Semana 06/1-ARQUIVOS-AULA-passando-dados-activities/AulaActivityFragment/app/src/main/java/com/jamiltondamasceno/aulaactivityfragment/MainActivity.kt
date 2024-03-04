package com.jamiltondamasceno.aulaactivityfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var buttonAbrir: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ciclo_vida", "onCreate")
        setContentView(R.layout.activity_main)

        buttonAbrir = findViewById( R.id.button_abrir )
        buttonAbrir.setOnClickListener {
            //finish()
            val intent = Intent(
                this,
                DetalhesActivity::class.java
            )
            //Passar parâmetros para nova tela
            intent.putExtra("filme", "The Witcher")
            intent.putExtra("classificacao", 5)
            intent.putExtra("avaliacoes", 9.2)

            //Inciar uma nova tela
            startActivity( intent )

        }

    }

    override fun onStart() {
        super.onStart()
        //Carregar dados
        Log.i("ciclo_vida", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo_vida", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo_vida", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo_vida", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("ciclo_vida", "onRestart")
    }

    override fun onDestroy() {
        Log.i("ciclo_vida", "onDestroy")
        super.onDestroy()
    }

}