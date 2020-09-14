package com.example.dicegame

class Dice(private val numSize: Int) {
    fun roll(): Int{
        return (1..numSize).random()
    }

}