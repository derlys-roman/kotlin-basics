package com.example.jogodavelha.ui.activity

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.jogodavelha.R
import com.example.jogodavelha.viewModel.Model

class MainActivity : AppCompatActivity() {
    private val model = Model()
    private var player1 = ArrayList<Int>()
    private var player2 = ArrayList<Int>()
    private var playerActual = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClick(view: View) {
        val pair = model.pair(view)
        val btSelections = pair.first
        val cellID = pair.second
        gameplay(cellID, btSelections)
    }

    private fun gameplay(cellID: Int, btSelections: Button) {
        if (playerActual == 1) {
            player1.add(cellID)
            btSelections.text = "X"
            playerActual = 2
        } else {
            player2.add(cellID)
            btSelections.text = "O"
            playerActual = 1
        }
        model.gameWinner(player1,player2, this)
        btSelections.isEnabled = false
    }

}