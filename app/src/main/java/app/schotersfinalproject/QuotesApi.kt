package app.schotersfinalproject

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface QuotesApi {
    @GET("/quotes")
    fun getQuotes() : Call<MutableList<PostModel>>
}