package com.example.myadvisor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdviceAdapter(private val items: List<Advice>) :
    RecyclerView.Adapter<AdviceAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val title: TextView = view.findViewById(R.id.itemTitle)
        private val text: TextView = view.findViewById(R.id.itemText)
        private val image: ImageView = view.findViewById(R.id.itemImage)

        fun setup(item: Advice) {
            title.text = item.name
            text.text = item.details
            image.setImageResource(item.imageId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_advice, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        holder.setup(items[pos])
    }

    override fun getItemCount() = items.size
}
