package com.example.aplicativo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        var btnCadastrar= findViewById<Button>(R.id.btn_cadastrar)
        btnCadastrar.setOnClickListener{
            chamarcadastrar()
        }
    }
    fun chamarcadastrar(){
        finish()
    }
}