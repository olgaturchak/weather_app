package com.example.weatherapplication.data

import com.example.weatherapplication.data.forecastModels.Forecast
import com.example.weatherapplication.data.models.CurrentWeather
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("weather?")
    suspend fun getCurrentWeather(
        @Query("q") city: String,
        @Query("units") unit: String,
        @Query("appid") apiKey: String,

    ):Response<CurrentWeather>

    @GET("forecast?")
    suspend fun getForecast(
        @Query ("q") city: String,
        @Query("units") units : String,
        @Query("appid") apiKey : String,
    ) :Response<Forecast>

}