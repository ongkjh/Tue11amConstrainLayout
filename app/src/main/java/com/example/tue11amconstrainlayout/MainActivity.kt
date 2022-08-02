package com.example.tue11amconstrainlayout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import com.example.tue11amconstrainlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,
            R.layout.activity_main)
        setlistener()
    }

    private fun setlistener(){
//        val box1 = findViewById<TextView>(R.id.box1)
//        val box2: TextView = findViewById(R.id.boxTwo)
//        val box3: TextView = findViewById(R.id.boxThree)
//        val box4: TextView = findViewById(R.id.boxFour)
//        val box5: TextView = findViewById(R.id.boxFive)
//        val rootView: View = findViewById(R.id.rootView)
//
//        val redBtn: Button = findViewById(R.id.redBtn)
//        val yellowBtn: Button = findViewById(R.id.yellowBtn)
//        val greenBtn: Button = findViewById(R.id.greenbtn)

        val clickables: List<View> =
            listOf(binding.box1,binding.boxTwo,binding.boxThree,
                binding.boxFour,binding.boxFive,binding.redBtn,
            binding.greenbtn,binding.yellowBtn)

        for (item in clickables){
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View){
        when(view.id){
            R.id.box1 -> view.setBackgroundColor(Color.RED)
            R.id.boxTwo -> view.setBackgroundColor(Color.BLUE)
            R.id.boxThree -> view.setBackgroundColor(Color.MAGENTA)
            R.id.boxFour -> view.setBackgroundColor(Color.CYAN)
            R.id.boxFive -> view.setBackgroundColor(Color.GREEN)

            R.id.redBtn -> binding.box1.setBackgroundResource(R.color.my_red)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}