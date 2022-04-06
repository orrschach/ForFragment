package com.example.forfragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NewsFragment (val title:String) : Fragment() {

    val TAG = "@@NewsFragment----$title"

    val news = arrayListOf<News>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG,"onCreateView")
        return inflater.inflate(R.layout.fragment_news,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        val recycler = view.findViewById<RecyclerView>(R.id.recycler3)
        recycler.layoutManager = LinearLayoutManager(context)
        recycler.adapter = NewsAdapter(news)
        Log.d(TAG,"onViewCreated")
    }

    private fun initData() {
        news.add(News().apply {
            name = "Emperor"
            description =
                "Hello!"
            avatar =R.drawable.ic_touxiang_foreground
            time ="11:30"
        })
        news.add(News().apply {
            name = "Herus"
            description =
                "raaaagggggggggh"
            avatar =R.drawable.ic_touxiang_foreground
            time ="9:30"
        })


    }}