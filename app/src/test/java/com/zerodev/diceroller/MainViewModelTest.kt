package com.zerodev.diceroller

import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class MainViewModelTest {
    private lateinit var mainViewModel: MainViewModel

    @Before
    fun before() {
        mainViewModel = MainViewModel()
    }

    @Test
    fun generate_number_one() {
        mainViewModel.rollDiceOne()
        val rollResult = mainViewModel.numberOne
        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 1..6)
    }

    @Test
    fun generate_number_two() {
        mainViewModel.rollDiceTwo()
        val rollResult = mainViewModel.numberTwo
        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 1..6)
    }
}