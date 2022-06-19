package com.example.jogodavelha.model

class Data {
    private val gamelist = arrayListOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9),
        listOf(1, 4, 7),
        listOf(2, 5, 8),
        listOf(3, 6, 9),
        listOf(1, 5, 9),
        listOf(3, 5, 7)
    )
    fun getAll(): ArrayList<List<Int>> {
        return gamelist
    }
}