package com.example.fragmentsapp.models

import java.time.temporal.TemporalAmount

data class Transaction(
    val recipientAvatar: String ?= null,
    val recipientName : String,
    val date: String,
    val amount: String
)