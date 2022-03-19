package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val numSides=6
            rollDice(numSides)
        }
    }

    private fun rollDice(val s: Int) {
        val dice = Dice(s) //create dice object of given size
        val diceRoll = dice.roll()

        val resultTextView: TextView = findViewById(R.id.textView) //update screen with roll
        resultTextView.text = diceRoll.toString()
    }
}
class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}