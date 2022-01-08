package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private  val items: List<String>) :RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>()
{
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val largeTextView: TextView = itemView.findViewById(R.id.textViewLarge)
        val smallTextView: TextView = itemView.findViewById(R.id.textViewSmall)
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.largeTextView.text = items[position]
        holder.smallTextView.text = "на телефоне"
        holder.imageView.setImageResource(R.drawable.icon)
    }

    override fun getItemCount() = items.size
}