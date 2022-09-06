package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity(), FragmentUpper.UpperFragmentListener,FragmentLower.LowerFragmentListener {
    private lateinit var lowerFragment:FragmentLower
    private lateinit var upperFragment:FragmentUpper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lowerFragment = FragmentLower()
        upperFragment = FragmentUpper()


        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container_view, lowerFragment)
            .commit()


        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container_view2, upperFragment)
            .commit()





    }

    override fun onInputUpperSent( input: CharSequence) {


        lowerFragment.updateLowerTextView(input)

    }

    override fun onInputLowerSent( input: CharSequence) {

        upperFragment.updateUpperTextView(input)
    }
}