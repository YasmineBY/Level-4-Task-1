package com.example.shoppinglist.shoppinglist

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter (private val shoppingList: List<Product>) : RecyclerView.Adapter<ProductAdapter.ViewHolder>()  {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

//        fun bind(reminder: Reminder) {
//            itemView.tvReminder.text = reminder.reminderText
//        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductAdapter.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ProductAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


}