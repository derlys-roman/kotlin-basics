package com.example.jogodavelha.viewModel

import android.content.Context
import android.widget.Toast
import com.example.jogodavelha.model.Data

class Model() {
    private var classdata = Data()
    private val data = classdata.getAll()
    fun gameWinner(player1:ArrayList<Int>, player2 : ArrayList<Int>, context: Context) {

        for (listOf in data) {
            if (player1.containsAll(listOf)) {
                Toast.makeText(context, "Player1 is winner", Toast.LENGTH_LONG).show()
            } else if (player2.containsAll(listOf)) {
                Toast.makeText(context, "Player2 is winner", Toast.LENGTH_LONG).show()
            }
        }
    }
}