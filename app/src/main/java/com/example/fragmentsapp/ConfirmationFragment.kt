package com.example.fragmentsapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class ConfirmationFragment : Fragment(R.layout.fragment_confirmation) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.nameTextView).text =
            ConfirmationFragmentArgs.fromBundle(requireArguments()).name
    }
}