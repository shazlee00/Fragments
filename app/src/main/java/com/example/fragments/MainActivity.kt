package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity(){
    private lateinit var fragmentA:FragmentA
    private lateinit var fragmentB:FragmentB
    val viewModel = activityViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentA= FragmentA()
        fragmentB = FragmentB()

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container_view,fragmentA).commit()






    }

}