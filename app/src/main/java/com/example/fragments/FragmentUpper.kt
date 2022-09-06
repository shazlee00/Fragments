package com.example.fragments

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment


class FragmentUpper : Fragment(R.layout.fragment_upper) {
    private lateinit var listener: UpperFragmentListener
    private lateinit var upperTextView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonSend: Button = view.findViewById(R.id.upper_send)
        upperTextView= view.findViewById(R.id.upper_textview)
        val upperEditText: EditText = view.findViewById(R.id.upper_text)

        buttonSend.setOnClickListener{

            val inputText=upperEditText.text

            upperTextView.text=inputText

            listener.onInputUpperSent(inputText)

        }



    }
    override fun onAttach(context: Context) {
        super.onAttach(context)

        listener = context as UpperFragmentListener
    }
    fun updateUpperTextView(input: CharSequence)
    {
        upperTextView.text="this focnktion is called"
        upperTextView.text=input
    }


    interface UpperFragmentListener {
        fun onInputUpperSent(input: CharSequence)
    }
}

