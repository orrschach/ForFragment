package com.example.forfragment

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AddressAdapter(val persons: ArrayList<Person>): RecyclerView.Adapter<AddressAdapter.AddressbookViewHolder>() {

    val TAG="@@inadapter----"

    class AddressbookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.name_add)
        val desc = itemView.findViewById<TextView>(R.id.description_add)
        val ava = itemView.findViewById<ImageView>(R.id.avatar_add)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AddressbookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_address,parent,false)
        val holder = AddressbookViewHolder(view)

        return holder
    }

    override fun onBindViewHolder(holder: AddressbookViewHolder, position: Int) {
        val person = persons[position]

        holder.name.text = person.name
        holder.desc.text = person.description
        holder.ava.setImageResource(person.avatar)

    }

    override fun getItemCount(): Int {
        return persons.size
    }
}