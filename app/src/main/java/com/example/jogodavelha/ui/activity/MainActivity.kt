package com.example.jogodavelha.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.jogodavelha.R
import com.example.jogodavelha.viewModel.Model
import java.util.*

class MainActivity(private val model: Model) : AppCompatActivity() {
    private var player1 = ArrayList<Int>()
    private var player2 = ArrayList<Int>()
    private var playerActual = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClick(view: View) {
        val pair = pair(view)
        val btSelections = pair.first
        val cellID = pair.second
        gameplay(cellID, btSelections)
    }

    private fun pair(view: View): Pair<Button, Int> {
        val btSelections = view as Button
        var cellID = 0
        when (btSelections.id) {
            R.id.button1 -> cellID = 1
            R.id.button2 -> cellID = 2
            R.id.button3 -> cellID = 3
            R.id.button4 -> cellID = 4
            R.id.button5 -> cellID = 5
            R.id.button6 -> cellID = 6
            R.id.button7 -> cellID = 7
            R.id.button8 -> cellID = 8
            R.id.button9 -> cellID = 9
        }
        return Pair(btSelections, cellID)
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