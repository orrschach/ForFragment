package com.example.forfragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter (val news: ArrayList<News>) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    inner class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.name_new)
        val desc = itemView.findViewById<TextView>(R.id.description_new)
        val ava = itemView.findViewById<ImageView>(R.id.avatar_new)
        val time = itemView.findViewById<TextView>(R.id.time_new)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news,parent,false)
        val holder = NewsViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val news = news[position]
        holder.name.text = news.name
        holder.desc.text = news.description
        holder.time.text = news.time
        holder.ava.setImageResource(news.avatar)
    }

    override fun getItemCount(): Int {
        return news.size
    }
}