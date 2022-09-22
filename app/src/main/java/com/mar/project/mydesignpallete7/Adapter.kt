package com.mar.project.mydesignpallete7

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter (private val food: List<Food>): RecyclerView.Adapter<FoodHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodHolder {
        return FoodHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
    }

    override fun onBindViewHolder(holder: FoodHolder, position: Int) {
        holder.bindHero(food[position])
    }

    override fun getItemCount(): Int = food.size

}

class FoodHolder(view: View): RecyclerView.ViewHolder(view) {
    private val tvFoodName = view.findViewById<TextView>(R.id.tv_foodName)
    private val tvFoodType = view.findViewById<TextView>(R.id.tv_foodType)
    private val tvFoodImage = view.findViewById<ImageView>(R.id.iv_food)
    private val tvFoodPrice = view.findViewById<TextView>(R.id.tv_price)
    private val tvFoodDetail = view.findViewById<TextView>(R.id.tv_foodDetail)

    fun bindHero(food: Food){
        tvFoodName.text = food.name
        tvFoodType.text = food.type
        tvFoodImage.setImageResource(food.image)
        tvFoodPrice.text = food.price
        tvFoodDetail.text = food.detail
    }
}
