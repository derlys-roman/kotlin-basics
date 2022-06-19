package com.example.jogodavelha.viewModel

import android.content.Context
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.jogodavelha.R
import com.example.jogodavelha.model.Data

class Model {
    private var classdata = Data()
    private val data = classdata.getAll()
    private var playerActual = 1
    private var player1 = ArrayList<Int>()
    private var player2 = ArrayList<Int>()

    fun gameWinner(context: Context) {

        for (listOf in data) {
            if (player1.containsAll(listOf)) {
                Toast.makeText(context, "Player1 is winner", Toast.LENGTH_LONG).show()
            } else if (player2.containsAll(listOf)) {
                Toast.makeText(context, "Player2 is winner", Toast.LENGTH_LONG).show()
            }
        }
    }

    fun pair(view: View): Pair<Button, Int> {
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

    fun gameplay(cellID: Int, btSelections: Button) {
        if (playerActual == 1) {
            playerActual = 2
            player1.add(cellID)
            btSelections.text = "X"
        } else {
            player2.add(cellID)
            btSelections.text = "O"
            playerActual = 1
        }
    }
}