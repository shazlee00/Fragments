package com.example.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment


class FragmentB : Fragment(R.layout.fragment_b) {

    private var incomingMessge:String? =""

    companion object{
        fun initlize(Msg:String?):FragmentB{
            val fragment = FragmentB()
            fragment.incomingMessge = Msg
            return  fragment
        }
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        lateinit var upperTextView: TextView
        var fragmentBMessage: TextView=  view.findViewById(R.id.incoming_message)
        var fragmentBEditText: EditText =view.findViewById(R.id.editTextTextPersonName)
        var frragmentBSendButton: Button =view.findViewById(R.id.button)
        fragmentBMessage.text = incomingMessge
        frragmentBSendButton.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
              ?.replace(R.id.fragment_container_view,FragmentA.initlize(fragmentBEditText.text.toString()))
              ?.commit()
        }
    }
}

