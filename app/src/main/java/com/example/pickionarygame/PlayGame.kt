package com.example.pickionarygame

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AlertDialog
import android.graphics.Color
import android.os.Bundle
import android.util.DisplayMetrics
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_play_game.*
import yuku.ambilwarna.AmbilWarnaDialog

class PlayGame : AppCompatActivity() {

    var nDefaultColor =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_game)

        nDefaultColor = ContextCompat.getColor(this, R.color.colorPrimary)
        btn_colorpicker.setOnClickListener(){
            openColorPicker()
        }

        val metrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(metrics)
        playView.init(metrics)

        btn_pencilMore.setOnClickListener(){
            playView.pencilMore()
        }

        btn_pencilLess.setOnClickListener(){
            playView.pencilLess()
        }

        btn_eraser.setOnClickListener(){
            playView.eraser()
        }

    }

    fun openColorPicker(){
        val colorPicker =
            AmbilWarnaDialog(this, nDefaultColor,object: AmbilWarnaDialog.OnAmbilWarnaListener{
                override fun onCancel(dialog: AmbilWarnaDialog){}
                override fun onOk(dialog: AmbilWarnaDialog, color: Int){
                    nDefaultColor = color

                    playView.changeColor(nDefaultColor)
                }
            })
        colorPicker.show()
    }


}
