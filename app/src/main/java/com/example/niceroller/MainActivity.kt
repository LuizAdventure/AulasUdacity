package com.example.niceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.lang.Math.random
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView mostra o layout a ser referenciado
        setContentView(R.layout.activity_main)
        // roolButton nome dado a variavel
        // Button tipo da variavel
        // findViewById acha o id referenciado
        val rollButton: Button = findViewById(R.id.roll_button)

        // setOnclickListener define o click a ser ouvido
        rollButton.setOnClickListener {
            // exibe uma mensagem, na qual foi definida
            Toast.makeText(this,"Você clicou no botão", Toast.LENGTH_SHORT).show()
            // chamando a função
            rollDice()
        }
    }
    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_6
            else -> R.drawable.dice_6
        }

        val diceImage: ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableResource)


    }
}