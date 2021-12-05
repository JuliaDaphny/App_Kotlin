package com.example.aplicativo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class lista : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        var btncadastro= findViewById<Button>(R.id.btn_cadastrar)
        btncadastro.setOnClickListener{
            chamarcadastro()
        }
    }
    fun chamarcadastro(){
        var intent= Intent(this, cadastro::class.java)
        startActivity(intent)
    }
}