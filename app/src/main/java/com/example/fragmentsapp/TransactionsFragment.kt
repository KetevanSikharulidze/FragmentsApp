package com.example.fragmentsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fragmentsapp.adapters.RvTransactionsAdapter
import com.example.fragmentsapp.databinding.FragmentTransactionsBinding
import com.example.fragmentsapp.models.Transaction

class TransactionsFragment : Fragment() {

    private lateinit var binding: FragmentTransactionsBinding
    private lateinit var adapter: RvTransactionsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTransactionsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() = with(binding){
        adapter = RvTransactionsAdapter(getData())
        rvTransaction.adapter = adapter
        rvTransaction.layoutManager = LinearLayoutManager(context)
    }

    private fun getData(): List<Transaction> {
        val listItem = ArrayList<Transaction>()
        listItem.add(Transaction("https://png.pngtree.com/element_our/png/20181108/transaction-line-icon-png_234015.jpg","George","09/11/2024 16:50","4,000 GEL"))
        listItem.add(Transaction("https://cdn-icons-png.flaticon.com/512/2761/2761001.png","George 2","09/11/2024 19:50","4,400 GEL"))
        listItem.add(Transaction("https://icons.veryicon.com/png/o/miscellaneous/background-icon-1/transaction-data.png","George 3","09/11/2024 20:50","4,500 GEL"))
        listItem.add(Transaction("https://icons.veryicon.com/png/o/miscellaneous/background-icon-1/transaction-data.png","George 4","09/11/2024 13:50","45,000 GEL"))
        listItem.add(Transaction("https://icons.veryicon.com/png/o/miscellaneous/background-icon-1/transaction-data.png","George 5","09/11/2024 10:50","49,000 GEL"))
        listItem.add(Transaction("https://png.pngtree.com/element_our/png/20181108/transaction-line-icon-png_234015.jpg","George","09/11/2024 16:50","4,000 GEL"))
        listItem.add(Transaction("https://cdn-icons-png.flaticon.com/512/2761/2761001.png","George 2","09/11/2024 19:50","4,400 GEL"))
        listItem.add(Transaction("https://icons.veryicon.com/png/o/miscellaneous/background-icon-1/transaction-data.png","George 3","09/11/2024 20:50","4,500 GEL"))
        listItem.add(Transaction("https://icons.veryicon.com/png/o/miscellaneous/background-icon-1/transaction-data.png","George 4","09/11/2024 13:50","45,000 GEL"))
        listItem.add(Transaction("https://icons.veryicon.com/png/o/miscellaneous/background-icon-1/transaction-data.png","George 5","09/11/2024 10:50","49,000 GEL"))
        listItem.add(Transaction("https://png.pngtree.com/element_our/png/20181108/transaction-line-icon-png_234015.jpg","George","09/11/2024 16:50","4,000 GEL"))
        listItem.add(Transaction("https://cdn-icons-png.flaticon.com/512/2761/2761001.png","George 2","09/11/2024 19:50","4,400 GEL"))
        listItem.add(Transaction("https://icons.veryicon.com/png/o/miscellaneous/background-icon-1/transaction-data.png","George 3","09/11/2024 20:50","4,500 GEL"))
        listItem.add(Transaction("https://icons.veryicon.com/png/o/miscellaneous/background-icon-1/transaction-data.png","George 4","09/11/2024 13:50","45,000 GEL"))
        listItem.add(Transaction("https://icons.veryicon.com/png/o/miscellaneous/background-icon-1/transaction-data.png","George 5","09/11/2024 10:50","49,000 GEL"))
        listItem.add(Transaction("https://png.pngtree.com/element_our/png/20181108/transaction-line-icon-png_234015.jpg","George","09/11/2024 16:50","4,000 GEL"))
        listItem.add(Transaction("https://cdn-icons-png.flaticon.com/512/2761/2761001.png","George 2","09/11/2024 19:50","4,400 GEL"))
        listItem.add(Transaction("https://icons.veryicon.com/png/o/miscellaneous/background-icon-1/transaction-data.png","George 3","09/11/2024 20:50","4,500 GEL"))
        listItem.add(Transaction("https://icons.veryicon.com/png/o/miscellaneous/background-icon-1/transaction-data.png","George 4","09/11/2024 13:50","45,000 GEL"))
        listItem.add(Transaction("https://icons.veryicon.com/png/o/miscellaneous/background-icon-1/transaction-data.png","George 5","09/11/2024 10:50","49,000 GEL"))
        listItem.add(Transaction("https://png.pngtree.com/element_our/png/20181108/transaction-line-icon-png_234015.jpg","George","09/11/2024 16:50","4,000 GEL"))
        listItem.add(Transaction("https://cdn-icons-png.flaticon.com/512/2761/2761001.png","George 2","09/11/2024 19:50","4,400 GEL"))
        listItem.add(Transaction("https://icons.veryicon.com/png/o/miscellaneous/background-icon-1/transaction-data.png","George 3","09/11/2024 20:50","4,500 GEL"))
        listItem.add(Transaction("https://icons.veryicon.com/png/o/miscellaneous/background-icon-1/transaction-data.png","George 4","09/11/2024 13:50","45,000 GEL"))
        listItem.add(Transaction("https://icons.veryicon.com/png/o/miscellaneous/background-icon-1/transaction-data.png","George 5","09/11/2024 10:50","49,000 GEL"))
        return listItem
    }

}