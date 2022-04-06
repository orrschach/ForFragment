package com.example.forfragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class AddressbookFragment(val title:String) : Fragment() {

        val TAG = "@@RightFragment----$title"

    val person = arrayListOf<Person>()

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            Log.d(TAG,"onCreateView")
            return inflater.inflate(R.layout.fragment_addressbook,container,false)
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            initData()
            val recycler = view.findViewById<RecyclerView>(R.id.recycler2)
            recycler.layoutManager = LinearLayoutManager(context)
            recycler.adapter = AddressAdapter(person)
            Log.d(TAG,"onViewCreated")
        }

    private fun initData() {
        person.add(Person().apply {
        name = "Emperor"
        description =
            "The one"
        avatar =R.drawable.ic_touxiang_foreground
    })
        person.add(Person().apply {
            name = "Herus"
            description =
                "War Master"
            avatar =R.drawable.ic_touxiang_foreground
        })


    }

    override fun onHiddenChanged(hidden: Boolean) {
            super.onHiddenChanged(hidden)

            Log.d(TAG,"onHiddenChanged: hidden = $hidden")
        }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG,"onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"onCreate")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG,"onActivityCreated")
    }



    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG,"onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG,"onDetach")
    }

    }