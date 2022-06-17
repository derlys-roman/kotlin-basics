package com.example.jogodavelha.viewModel

import android.content.Context
import android.widget.Toast
import com.example.jogodavelha.model.Data
import java.util.ArrayList

class Model(private val data: Data) {
    fun gameWinner(player1:ArrayList<Int>, player2 : ArrayList<Int>, context: Context) {
        val gamelist = arrayListOf(
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
                Toast.makeText(context, "Player1 is winner", Toast.LENGTH_LONG).show()
            } else if (player2.containsAll(listOf)) {
                Toast.makeText(context, "Player2 is winner", Toast.LENGTH_LONG).show()
            }
        }
    }
}