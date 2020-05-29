package com.example.pickionarygame

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.MediaController
import android.widget.VideoView
import kotlinx.android.synthetic.main.activity_instructions.*
import java.lang.Exception
import java.net.URL

class Instructions : AppCompatActivity() {

    var position=0
    var nController:MediaController?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instructions)
        if (nController==null){
            nController=MediaController(this)
        }
        try {
            video.setMediaController(nController)
            video.setVideoURI(Uri.parse("android.resource://"
                    +packageName
                    +"/"
                    +R.raw.instrucciones))
        }catch (e:Exception){
            Log.e("Error", e.message)
        }
        video.requestFocus()
        video.setOnCompletionListener {
            video.seekTo(position)
            if(position==0){
                video.start()
            }else{
                video.pause()
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        if(outState!=null){
            outState.putInt("position", video.currentPosition)
        }
        video.pause()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState!=null){
          position=savedInstanceState.getInt("position")
        }
        video.seekTo(position)
    }
}
