package com.example.di

data class BitcoinResponse(val data: Data?)

data class Data(
    val id:String,
    val symbol:String,
    val currencySymbol:String,
    val rateUsd:String
)
