package com.example.pierr.tictactoe


import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val n = intent.getStringExtra("name")

        nameWin.text = "O ("+n+")"

        var won = 0

        var playerChoose  = (1..2).shuffled().first()

        b1.setTextColor(Color.YELLOW)
        b2.setTextColor(Color.YELLOW)
        b3.setTextColor(Color.YELLOW)
        b4.setTextColor(Color.YELLOW)
        b5.setTextColor(Color.YELLOW)
        b6.setTextColor(Color.YELLOW)
        b7.setTextColor(Color.YELLOW)
        b8.setTextColor(Color.YELLOW)
        b9.setTextColor(Color.YELLOW)



        b1.setOnClickListener()
        {
            if (b1.text == "") {
                if (playerChoose == 1) {
                    playerChoose = 2
                    b1.text = "X"
                } else {
                    playerChoose = 1
                    b1.text = "O"
                }
                t1.isEnabled = playerChoose == 1
                t2.isEnabled = playerChoose == 2
                won = gameOver()
            }
        }

        b2.setOnClickListener()
        {
            if (b2.text == "") {
                if (playerChoose == 1) {
                    playerChoose = 2
                    b2.text = "X"
                } else {
                    playerChoose = 1
                    b2.text = "O"
                }
                t1.isEnabled = playerChoose == 1
                t2.isEnabled = playerChoose == 2
                won = gameOver()
                if (won!= 0) {
                    if (won == 2){
                        Toast.makeText(this@SecondActivity, "Win", Toast.LENGTH_LONG).show()
                    }
                    else if (won == 1) {
                        Toast.makeText(this@SecondActivity, "Lose", Toast.LENGTH_LONG).show()
                    }
                    else {
                        Toast.makeText(this@SecondActivity, "Draw", Toast.LENGTH_LONG).show()
                    }
                    val explicitIntent = Intent(this@SecondActivity, ThirdActivity::class.java)
                    explicitIntent.putExtra("player", won)
                    explicitIntent.putExtra("name", n)
                    startActivity(explicitIntent)
                }

            }
        }
        b3.setOnClickListener()
        {
            if (b3.text == "") {
                if (playerChoose == 1) {
                    playerChoose = 2
                    b3.text = "X"
                } else {
                    playerChoose = 1
                    b3.text = "O"
                }
                t1.isEnabled = playerChoose == 1
                t2.isEnabled = playerChoose == 2
                won = gameOver()
                if (won!= 0) {
                    if (won == 2){
                        Toast.makeText(this@SecondActivity, "Win", Toast.LENGTH_LONG).show()
                    }
                    else if (won == 1) {
                        Toast.makeText(this@SecondActivity, "Lose", Toast.LENGTH_LONG).show()
                    }
                    else {
                        Toast.makeText(this@SecondActivity, "Draw", Toast.LENGTH_LONG).show()
                    }
                    val explicitIntent = Intent(this@SecondActivity, ThirdActivity::class.java)
                    explicitIntent.putExtra("player", won)
                    explicitIntent.putExtra("name", n)
                    startActivity(explicitIntent)
                }
            }
        }
        b4.setOnClickListener()
        {
            if (b4.text == "") {
                if (playerChoose == 1) {
                    playerChoose = 2
                    b4.text = "X"
                } else {
                    playerChoose = 1
                    b4.text = "O"
                }
                t1.isEnabled = playerChoose == 1
                t2.isEnabled = playerChoose == 2
                won = gameOver()
                if (won!= 0) {
                    if (won == 2){
                        Toast.makeText(this@SecondActivity, "Win", Toast.LENGTH_LONG).show()
                    }
                    else if (won == 1) {
                        Toast.makeText(this@SecondActivity, "Lose", Toast.LENGTH_LONG).show()
                    }
                    else {
                        Toast.makeText(this@SecondActivity, "Draw", Toast.LENGTH_LONG).show()
                    }
                    val explicitIntent = Intent(this@SecondActivity, ThirdActivity::class.java)
                    explicitIntent.putExtra("player", won)
                    explicitIntent.putExtra("name", n)
                    startActivity(explicitIntent)
                }
            }
        }
        b5.setOnClickListener()
        {
            if (b5.text == "") {
                if (playerChoose == 1) {
                    playerChoose = 2
                    b5.text = "X"
                } else {
                    playerChoose = 1
                    b5.text = "O"
                }
                t1.isEnabled = playerChoose == 1
                t2.isEnabled = playerChoose == 2
                won = gameOver()
                if (won!= 0) {
                    if (won == 2){
                        Toast.makeText(this@SecondActivity, "Win", Toast.LENGTH_LONG).show()
                    }
                    else if (won == 1) {
                        Toast.makeText(this@SecondActivity, "Lose", Toast.LENGTH_LONG).show()
                    }
                    else {
                        Toast.makeText(this@SecondActivity, "Draw", Toast.LENGTH_LONG).show()
                    }
                    val explicitIntent = Intent(this@SecondActivity, ThirdActivity::class.java)
                    explicitIntent.putExtra("player", won)
                    explicitIntent.putExtra("name", n)
                    startActivity(explicitIntent)
                }
            }
        }
        b6.setOnClickListener()
        {
            if (b6.text == "") {
                if (playerChoose == 1) {
                    playerChoose = 2
                    b6.text = "X"
                } else {
                    playerChoose = 1
                    b6.text = "O"
                }
                t1.isEnabled = playerChoose == 1
                t2.isEnabled = playerChoose == 2
                won = gameOver()
                if (won!= 0) {
                    if (won == 2){
                        Toast.makeText(this@SecondActivity, "Win", Toast.LENGTH_LONG).show()
                    }
                    else if (won == 1) {
                        Toast.makeText(this@SecondActivity, "Lose", Toast.LENGTH_LONG).show()
                    }
                    else {
                        Toast.makeText(this@SecondActivity, "Draw", Toast.LENGTH_LONG).show()
                    }
                    val explicitIntent = Intent(this@SecondActivity, ThirdActivity::class.java)
                    explicitIntent.putExtra("player", won)
                    explicitIntent.putExtra("name", n)
                    startActivity(explicitIntent)
                }
            }
        }
        b7.setOnClickListener()
        {
            if (b7.text == "") {
                if (playerChoose == 1) {
                    playerChoose = 2
                    b7.text = "X"
                } else {
                    playerChoose = 1
                    b7.text = "O"
                }
                t1.isEnabled = playerChoose == 1
                t2.isEnabled = playerChoose == 2
                won = gameOver()
                if (won!= 0) {
                    if (won == 2){
                        Toast.makeText(this@SecondActivity, "Win", Toast.LENGTH_LONG).show()
                    }
                    else if (won == 1) {
                        Toast.makeText(this@SecondActivity, "Lose", Toast.LENGTH_LONG).show()
                    }
                    else {
                        Toast.makeText(this@SecondActivity, "Draw", Toast.LENGTH_LONG).show()
                    }
                    val explicitIntent = Intent(this@SecondActivity, ThirdActivity::class.java)
                    explicitIntent.putExtra("player", won)
                    explicitIntent.putExtra("name", n)
                    startActivity(explicitIntent)
                }
            }
        }
        b8.setOnClickListener()
        {
            if (b8.text == "") {
                if (playerChoose == 1) {
                    playerChoose = 2
                    b8.text = "X"
                } else {
                    playerChoose = 1
                    b8.text = "O"
                }
                t1.isEnabled = playerChoose == 1
                t2.isEnabled = playerChoose == 2
                won = gameOver()
                if (won!= 0) {
                    if (won == 2){
                        Toast.makeText(this@SecondActivity, "Win", Toast.LENGTH_LONG).show()
                    }
                    else if (won == 1) {
                        Toast.makeText(this@SecondActivity, "Lose", Toast.LENGTH_LONG).show()
                    }
                    else {
                        Toast.makeText(this@SecondActivity, "Draw", Toast.LENGTH_LONG).show()
                    }
                    val explicitIntent = Intent(this@SecondActivity, ThirdActivity::class.java)
                    explicitIntent.putExtra("player", won)
                    explicitIntent.putExtra("name", n)
                    startActivity(explicitIntent)
                }
            }
        }
        b9.setOnClickListener()
        {
            if (b9.text == "") {
                if (playerChoose == 1) {
                    playerChoose = 2
                    b9.text = "X"
                } else {
                    playerChoose = 1
                    b9.text = "O"
                }
                t1.isEnabled = playerChoose == 1
                t2.isEnabled = playerChoose == 2
                won = gameOver()
                if (won != 0) {
                    if (won == 2){
                        Toast.makeText(this@SecondActivity, "Win", Toast.LENGTH_LONG).show()
                    }
                    else if (won == 1) {
                        Toast.makeText(this@SecondActivity, "Lose", Toast.LENGTH_LONG).show()
                    }
                    else {
                        Toast.makeText(this@SecondActivity, "Draw", Toast.LENGTH_LONG).show()
                    }
                    val explicitIntent = Intent(this@SecondActivity, ThirdActivity::class.java)
                    explicitIntent.putExtra("player", won)
                    explicitIntent.putExtra("name", n)
                    startActivity(explicitIntent)
                }
            }
        }

    }

    private fun gameOver() : Int{
        if (b1.text!= "" && b1.text == b2.text && b2.text == b3.text){
            if  (b1.text == "X") {
                return 1
            }
            else {
                return 2
            }
        }
        if (b4.text != "" && b4.text == b5.text && b5.text == b6.text){
            if  (b4.text == "X") {
                return 1
            }
            else {
                return 2
            }
        }
        if (b7.text != "" && b7.text == b8.text && b8.text == b9.text){
            if  (b7.text == "X") {
                return 1
            }
            else {
                return 2
            }
        }
        if (b1.text != "" && b1.text == b4.text && b4.text == b7.text){
            if  (b1.text == "X") {
                return 1
            }
            else {
                return 2
            }
        }
        if (b2.text != "" && b2.text == b5.text && b5.text == b8.text){
            if  (b2.text == "X") {
                return 1
            }
            else {
                return 2
            }
        }
        if (b3.text != "" && b3.text == b6.text && b6.text == b9.text){
            if  (b3.text == "X") {
                return 1
            }
            else {
                return 2
            }
        }
        if (b1.text != "" && b1.text == b5.text && b5.text == b9.text){
            if  (b1.text == "X") {
                return 1
            }
            else {
                return 2
            }
        }
        if (b3.text != "" && b3.text == b5.text && b5.text == b7.text){
            if  (b3.text == "X") {
                return 1
            }
            else {
                return 2
            }
        }
        if (b1.text != "" && b2.text != "" && b3.text != "" && b4.text != "" && b5.text != "" && b6.text != "" && b7.text != "" && b8.text != "" && b9.text != "")
        {
            return  -1
        }
        return 0
    }
}
