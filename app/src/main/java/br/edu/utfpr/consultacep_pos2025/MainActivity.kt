package br.edu.utfpr.consultacep_pos2025

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var etCEP: EditText
    private lateinit var tvResposta: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etCEP = findViewById(R.id.etCEP)
        tvResposta = findViewById(R.id.tvResposta)
    }

    fun btConsultarCEPOnClik(view: View) {
        Thread {

        }.start()
    }
}