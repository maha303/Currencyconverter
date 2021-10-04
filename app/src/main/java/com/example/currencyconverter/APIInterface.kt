package com.example.currencyconverter
import com.example.currencyconverter.Datum
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface APIInterface {
    @Headers("Content-Type: application/json")
    @GET("eur.json")
    fun getCurrency(): Call<Datum>?
}