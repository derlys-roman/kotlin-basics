package com.example.jogodavelha.ui.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.jogodavelha.R
import com.example.jogodavelha.viewModel.Model

class MainActivity : AppCompatActivity() {
    private val model = Model()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClick(view: View) {
        val pair = model.pair(view)
        val btSelections = pair.first
        val cellID = pair.second
        model.gameplay(cellID, btSelections)
        model.gameWinner( this)
        btSelections.isEnabled = false

    }

}