package com.example.motivation.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.motivation.R
import infra.MotivationConstants
import infra.SecurityPreferences
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var mSecurityPreferences: SecurityPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        if(supportActionBar != null){
            supportActionBar!!.hide()
        }

        mSecurityPreferences = SecurityPreferences(this)

        btnSalvar.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val id = v.id
        if (id == R.id.btnSalvar){
            salvar()
        }
    }
    private fun salvar(){
        val nome = txtNome.text.toString()
        if(nome != ""){
            mSecurityPreferences.storeString(MotivationConstants.KEY.PERSON_NAME,nome)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }else{
            Toast.makeText(this,"Informe seu nome!",Toast.LENGTH_SHORT).show()
        }
    }
}