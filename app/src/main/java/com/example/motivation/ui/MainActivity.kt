package com.example.motivation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.motivation.R
import infra.MotivationConstants
import infra.SecurityPreferences

class MainActivity : AppCompatActivity() {
    private lateinit var mSecurityPreferences: SecurityPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mSecurityPreferences = SecurityPreferences(this)
        mSecurityPreferences.getString(MotivationConstants.KEY.PERSON_NAME)
    }
}