package com.example.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class FragmentLower : Fragment(R.layout.fragment_lower) {

    private lateinit var listener: LowerFragmentListener
    private lateinit var lowerTextView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonSend: Button = view.findViewById(R.id.lower_send)
        lowerTextView = view.findViewById(R.id.lower_textview)
        val lowerEditText: EditText = view.findViewById(R.id.lower_text)

        buttonSend.setOnClickListener{

            val inputText=lowerEditText.text

            listener.onInputLowerSent(inputText)

        }



    }
    override fun onAttach(context: Context) {
        super.onAttach(context)

        listener = context as LowerFragmentListener
    }

    fun updateLowerTextView(input: CharSequence)
    {
        lowerTextView.text=input
    }


    interface LowerFragmentListener {
        fun onInputLowerSent(input: CharSequence)
    }

}