package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.annotation.IntegerRes
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BuGetAge.setOnClickListener {
            buttonGetAgeClick()




        }
    }
    fun buttonGetAgeClick(){
        // add your code here after clicking buuton
        val userdob=Integer.parseInt(edDOB.text.toString())
        val currentyear= Calendar.getInstance().get(Calendar.YEAR)
        val userageinyear= currentyear-userdob
        tvShowAge.text="Your age is $userageinyear Years"
        Log.d("Logsme", "Your age is $userageinyear Years")
    }

    fun buAgeclick(view: View) {}

}


