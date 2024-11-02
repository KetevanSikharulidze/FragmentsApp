package com.example.fragmentsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.fragmentsapp.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var _binding: FragmentMainBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater,container,false)
//        init()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init(){
        binding.apply {
            viewTransactionsBtn.setOnClickListener {
//                toast
                Toast.makeText(context, "coming soon!", Toast.LENGTH_SHORT).show()
            }
            sendMoneyBtn.setOnClickListener {
                Navigation.findNavController(it)
                    .navigate(MainFragmentDirections
                        .actionMainFragmentToChooseRecipientFragment())
            }
            viewBalanceBtn.setOnClickListener {
                Toast.makeText(context, "coming soon!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}