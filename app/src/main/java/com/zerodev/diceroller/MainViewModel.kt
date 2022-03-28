package com.zerodev.diceroller

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var numberOne = 0
    var numberTwo = 0

    private val diceOne = Dice(6)
    private val diceTwo = Dice(6)

    fun rollDiceOne() {
        numberOne = diceOne.roll()
    }

    fun rollDiceTwo() {
        numberTwo = diceTwo.roll()
    }
}