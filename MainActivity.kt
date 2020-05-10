package com.example.pickionarygame

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageSettings.setOnClickListener(){
            val intent=Intent(this,Settings::class.java)
            startActivity(intent)
        }
        imageUnlock.setOnClickListener(){
            val intent2=Intent(this,UnlockWords::class.java)
            startActivity(intent2)
        }
        imageInstructions.setOnClickListener(){
            val intent3=Intent(this,Instructions::class.java)
            startActivity(intent3)
        }
        imagePlay.setOnClickListener(){
            val intent4=Intent(this,PlayGame::class.java)
            startActivity(intent)

        }
        imageAbout.setOnClickListener(){
            val mDialogView=LayoutInflater.from(this).inflate(R.layout.activity_about,null)
            val mBuilder=AlertDialog.Builder(this)
                .setView(mDialogView)
                .setTitle("About")
            val mAlertDialog=mBuilder.show()
        }
        }
}
