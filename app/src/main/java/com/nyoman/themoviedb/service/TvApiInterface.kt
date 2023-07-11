package com.nyoman.themoviedb.service

import com.nyoman.themoviedb.model.MovieResponse
import com.nyoman.themoviedb.model.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TvApiInterface {
    @GET("/3/tv/popular?api_key=593835a32b707f59312e5102a9519ad5")
    fun getTVList(): Call<TVResponse>
}