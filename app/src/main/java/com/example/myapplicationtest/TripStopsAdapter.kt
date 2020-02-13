package com.example.myapplicationtest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TripStopsAdapter(val context: Context, val data: List<String>) : RecyclerView.Adapter<TripStopsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val cell = LayoutInflater.from(context).inflate(R.layout.item_trip_stop, parent, false)
        return ViewHolder(cell)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = data[position]
        holder.stopAddress.text = model
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val stopAddress: TextView = itemView.findViewById(R.id.tv_stop_address)
    }
}
