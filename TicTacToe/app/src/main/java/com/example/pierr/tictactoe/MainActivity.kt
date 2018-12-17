package com.example.pierr.tictactoe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start.setOnClickListener{
            val explicitIntent = Intent(this@MainActivity, SecondActivity::class.java)
            explicitIntent.putExtra("name",nameWin.text.toString())
            startActivity(explicitIntent)
        }
    }
}
