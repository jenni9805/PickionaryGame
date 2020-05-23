package com.example.pickionarygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_settings.*
import java.util.*

class Settings : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val res = resources
        val dm = res.displayMetrics
        val conf = res.configuration

        if(conf.locale.language.equals("es")){
            switch1.isChecked = true
        }

        switch1.setOnClickListener() {
            if (switch1.isChecked) {
                conf.setLocale(Locale("es"))
            } else {
                conf.setLocale(Locale("en"))
            }
            res.updateConfiguration(conf, dm)
            this.recreate();
        }


    }
}
