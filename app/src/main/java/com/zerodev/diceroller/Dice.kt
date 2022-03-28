package com.zerodev.diceroller

class Dice(private val numSide: Int) {
    fun roll(): Int {
        return (1..numSide).random()
    }
}