package com.mar.project.mydesignpallete7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listFastFood = listOf(
            Food("Special Meal", "Fast food", R.drawable.ic_food, "$5.00", "Lorem Ipsum is simply dummy text of the printing and typesetting industry."),
            Food("Butter Chicken", "Fast food", R.drawable.ic_food, "$3.00", "Lorem Ipsum is simply dummy text of the printing and typesetting industry."),
            Food("Pizza", "Fast food", R.drawable.ic_food, "$4.00", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.")
        )
        val listChineseFood = listOf(
            Food("Special Meal", "Chinese food", R.drawable.ic_food, "$5.00", "Lorem Ipsum is simply dummy text of the printing and typesetting industry."),
            Food("Butter Chicken", "Chinese food", R.drawable.ic_food, "$3.00", "Lorem Ipsum is simply dummy text of the printing and typesetting industry."),
            Food("Pizza", "Chinese food", R.drawable.ic_food, "$4.00", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.")
        )
        val listIndianFood = listOf(
            Food("Special Meal", "Indian food", R.drawable.ic_food, "$5.00", "Lorem Ipsum is simply dummy text of the printing and typesetting industry."),
            Food("Butter Chicken", "Indian food", R.drawable.ic_food, "$3.00", "Lorem Ipsum is simply dummy text of the printing and typesetting industry."),
            Food("Pizza", "Indian food", R.drawable.ic_food, "$4.00", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.")
        )

        val btnFastFood: Button = findViewById(R.id.btn_fast_food)
        val btnChinese: Button = findViewById(R.id.btn_chinese)
        val btnIndian: Button = findViewById(R.id.btn_indian)
        val rv: RecyclerView = findViewById(R.id.recyclerView)

        rv.apply {
            layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.HORIZONTAL, false)
            adapter = Adapter(listChineseFood)
            setHasFixedSize(true)
        }

        btnFastFood.setOnClickListener {
            chosenButton(btnFastFood)
            notChosenButton(btnChinese)
            notChosenButton(btnIndian)

            rv.apply {
                layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.HORIZONTAL, false)
                adapter = Adapter(listFastFood)
                setHasFixedSize(true)
            }
        }

        btnChinese.setOnClickListener {
            chosenButton(btnChinese)
            notChosenButton(btnFastFood)
            notChosenButton(btnIndian)

            rv.apply {
                layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.HORIZONTAL, false)
                adapter = Adapter(listChineseFood)
                setHasFixedSize(true)
            }
        }

        btnIndian.setOnClickListener {
            chosenButton(btnIndian)
            notChosenButton(btnFastFood)
            notChosenButton(btnChinese)

            rv.apply {
                layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.HORIZONTAL, false)
                adapter = Adapter(listIndianFood)
                setHasFixedSize(true)
            }
        }

    }

    private fun chosenButton(button: Button){
        button.setBackgroundResource(R.drawable.bg_third)
        button.setTextColor(resources.getColor(R.color.white))
    }

    private fun notChosenButton(button: Button){
        button.setBackgroundResource(R.drawable.bg_second)
        button.setTextColor(resources.getColor(R.color.black))
    }
}