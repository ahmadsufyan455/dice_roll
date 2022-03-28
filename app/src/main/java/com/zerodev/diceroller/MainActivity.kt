package com.zerodev.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.zerodev.diceroller.databinding.ActivityMainBinding

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        mainViewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[MainViewModel::class.java]

        // for set image resource
        rollDiceOne()
        rollDiceTwo()

        binding?.btnRoll?.setOnClickListener {
            // Roll dice
            mainViewModel.rollDiceOne()
            mainViewModel.rollDiceTwo()

            // for set image resource
            rollDiceOne()
            rollDiceTwo()
        }
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDiceOne() {
        // Roll dice and show the picture based on result number
        val drawableResource = when (mainViewModel.numberOne) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        binding?.imgDiceOne?.setImageResource(drawableResource)

    }

    private fun rollDiceTwo() {
        // Roll dice and show the picture based on result number
        val drawableResource = when (mainViewModel.numberTwo) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        binding?.imgDiceTwo?.setImageResource(drawableResource)

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}