package com.example.forfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.fragment.app.FragmentManager


class MainActivity : AppCompatActivity() {

    lateinit var manager: FragmentManager


    companion object {
        val TAG_LIFE = "微信"
        val TAG_WORK = "通讯录"
        val TAG_DISCOVERY = "发现"
        val TAG_ME = "我"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        manager = supportFragmentManager
    }


    fun showLife() {
        showFragment(TAG_LIFE)
    }

    fun showWork() {
        showFragment(TAG_WORK)
    }

    fun showDiscovery() {
        showFragment(TAG_DISCOVERY)
    }

    fun showMe() {
        showFragment(TAG_ME)
    }

    private fun showFragment(tag: String) {
        val hint = findViewById<TextView>(R.id.hint)
        hint.isVisible = false

        val frag =manager.findFragmentByTag(tag)?:
        when (tag){
           TAG_LIFE-> RightFragment("微信")
           TAG_WORK->AddressbookFragment("通讯录")
           TAG_DISCOVERY-> RightFragment("发现")
           else-> RightFragment("我")
        }
        val trans = manager.beginTransaction()

        manager.fragments.forEach {
            if(it != frag && it !is LeftFragment){
                trans.hide(it)
            }
        }

        if(frag.isAdded){
            trans.show(frag)
        }else{
            trans.add(R.id.right, frag,tag)
        }

        trans.commit()

    }


}