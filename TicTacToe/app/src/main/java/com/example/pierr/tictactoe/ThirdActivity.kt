package com.example.pierr.tictactoe

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_third.*
import java.time.LocalDateTime

class ThirdActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val current = LocalDateTime.now()

        date.text = "Date: $current"
        var p = 0
        val player = intent.getIntExtra("player", p)
        val n = intent.getStringExtra("name")

        if (player == -1){
            w.setImageResource(R.drawable.abc_item_background_holo_dark)
        }
        if (player == 1){
            w.setImageResource(R.drawable.ic_thumb_down)
        }
        if (player == 2){
            w.setImageResource(R.drawable.ic_thumb_up)
        }

        nameWin.text = n
    }
}
