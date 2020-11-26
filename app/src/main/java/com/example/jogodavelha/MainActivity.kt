package com.example.jogodavelha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClick(view: View) {
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
        gameplay(cellID, btSelections)
    }

    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var playerActual = 1
    fun gameplay(cellID: Int, btSelections: Button) {
        if (playerActual == 1) {
            player1.add(cellID)
            btSelections.text = "X"
            playerActual = 2
        } else {
            player2.add(cellID)
            btSelections.text = "O"
            playerActual = 1
        }
        gameWinner()
        btSelections.isEnabled = false
    }

    fun gameWinner() {
        var gamelist = arrayListOf(
            listOf(1, 2, 3),
            listOf(4, 5, 6),
            listOf(7, 8, 9),
            listOf(1, 4, 7),
            listOf(2, 5, 8),
            listOf(3, 6, 9),
            listOf(1, 5, 9),
            listOf(3, 5, 7)
        )
        for (listOf in gamelist) {
            if (player1.containsAll(listOf)) {
                Toast.makeText(this, "Player1 is winner", Toast.LENGTH_LONG).show()
            } else if (player2.containsAll(listOf)) {
                Toast.makeText(this, "Player2 is winner", Toast.LENGTH_LONG).show()
            }
        }
    }
}