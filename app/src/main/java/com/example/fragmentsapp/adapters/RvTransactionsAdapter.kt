package com.example.fragmentsapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.fragmentsapp.databinding.ItemTransactionBinding
import com.example.fragmentsapp.models.Transaction

class RvTransactionsAdapter(private val listItem: List<Transaction>)
    : RecyclerView.Adapter<RvTransactionsAdapter.Holder>(){

    inner class Holder(private val binding: ItemTransactionBinding)
        : RecyclerView.ViewHolder(binding.root){
            fun bind(item: String) = with(binding){
                Glide.with(binding.root).load(listItem[position].recipientAvatar).into(ivTransaction)
                tvRecipient.text = listItem[position].recipientName
                tvDate.text = listItem[position].date
                tvAmount.text = listItem[position].amount
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder
        = Holder(ItemTransactionBinding
            .inflate(LayoutInflater.from(parent.context),parent,false))

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.apply {
            val item = listItem[position]
            bind(item.amount)
            bind(item.date)
            bind(item.recipientName)
            bind(item.recipientAvatar!!)
        }

    }

    override fun getItemCount() = listItem.size
}