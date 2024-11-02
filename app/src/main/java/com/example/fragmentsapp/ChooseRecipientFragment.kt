package com.example.fragmentsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.fragmentsapp.databinding.FragmentChooseRecipientBinding

class ChooseRecipientFragment : Fragment(R.layout.fragment_choose_recipient) {
    private lateinit var _binding: FragmentChooseRecipientBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChooseRecipientBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        binding.apply {
            nextBtn.setOnClickListener {
                val name = nameEditText.text.toString()

                Navigation.findNavController(it)
                    .navigate(ChooseRecipientFragmentDirections
                        .actionChooseRecipientFragmentToConfirmationFragment(name))
            }
            cancelBtn.setOnClickListener {
                Navigation.findNavController(it)
                    .navigate(ChooseRecipientFragmentDirections
                    .actionChooseRecipientFragmentToMainFragment())
            }
        }
    }
}