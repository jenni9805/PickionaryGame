package com.example.pickionarygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_unlock_words.*

class UnlockWords : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unlock_words)

        val arrayWords = ArrayList<Words>()

        arrayWords.add(Words("Desbloqueada", "Balon", 1))
        arrayWords.add(Words("Desbloqueada", "Balon", 1))
        arrayWords.add(Words("Desbloqueada", "Balon", 1))
        arrayWords.add(Words("Desbloqueada", "Balon", 1))
        arrayWords.add(Words("Desbloqueada", "Balon", 1))
        arrayWords.add(Words("Desbloqueada", "Balon", 1))
        arrayWords.add(Words("Desbloqueada", "Balon", 1))
        arrayWords.add(Words("Desbloqueada", "Balon", 1))
        arrayWords.add(Words("Desbloqueada", "Balon", 1))
        arrayWords.add(Words("Desbloqueada", "Balon", 1))

        val recycler = recyclerWords

        recycler.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val recyclerAdapter = AdaptedWords(arrayWords)

        recycler.adapter = recyclerAdapter

    }
}
