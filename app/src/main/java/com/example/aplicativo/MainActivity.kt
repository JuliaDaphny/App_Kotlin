package com.example.aplicativo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnEntrar= findViewById<Button>(R.id.btn_entrar)
        btnEntrar.setOnClickListener{
            chamarlista()
        }
        var btnCadastro= findViewById<Button>(R.id.btn_cadastro)
        btnCadastro.setOnClickListener{
            chamarcadastro()
        }
    }
    fun chamarlista(){
        var intent= Intent(this, lista::class.java)
        startActivity(intent)
    }
    fun chamarcadastro(){
        var intent= Intent(this, cadastro::class.java)
        startActivity(intent)
    }
}
