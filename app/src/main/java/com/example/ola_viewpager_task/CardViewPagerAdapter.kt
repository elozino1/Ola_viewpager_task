package com.example.ola_viewpager_task

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class CardViewPagerAdapter(var numbers: List<String>)
    : RecyclerView.Adapter<CardViewPagerAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val number: TextView = view.findViewById(R.id.number)
        val card: CardView = view.findViewById(R.id.card)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val eachNumber = numbers[position]
        holder.number.text =  eachNumber
        holder.card.setCardBackgroundColor(Color.rgb(Random.nextInt(0, 256), (Random.nextInt(0, 256)), (Random.nextInt(0, 256))))
    }

    override fun getItemCount(): Int {
        return numbers.size
    }
}