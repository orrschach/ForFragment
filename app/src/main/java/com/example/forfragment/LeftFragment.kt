package com.example.forfragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class LeftFragment : Fragment(), View.OnClickListener {

    val TAG = "@@LeftFragment"


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG,"onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG,"onCreateView")
        return inflater.inflate(R.layout.fragment_left,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG,"onActivityCreated")
             }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG,"onViewCreated")
        view.findViewById<Button>(R.id.btn_life).setOnClickListener(this)
        view.findViewById<Button>(R.id.btn_work).setOnClickListener(this)
        view.findViewById<Button>(R.id.btn_discovery).setOnClickListener(this)
        view.findViewById<Button>(R.id.btn_me).setOnClickListener(this)
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

    override fun onClick(v: View) {

        val act =  requireActivity() as MainActivity

        when(v.id){
            R.id.btn_life->{
                act.showLife()
            }
            R.id.btn_work->{
                act.showWork()
            }
            R.id.btn_discovery->{
                act.showDiscovery()
            }
            R.id.btn_me->{
                act.showMe()
            }
        }
    }
}