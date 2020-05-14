package com.sf.gtdng.network.datasource

import com.sf.gtdng.network.response.GithubUserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query


interface ApiEndPoint {
    @GET("search/users")
    fun getHistoryList(
        @Header("Authorization") authorization: String,
        @Query("q") q: String?
    ): Call<GithubUserResponse>
}