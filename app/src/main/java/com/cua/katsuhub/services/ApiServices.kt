package com.cua.katsuhub.services

import com.cua.katsuhub.model.anime.AnimeRoot
import com.cua.katsuhub.model.animes.Response
import com.cua.katsuhub.model.response.CharacterResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiServices {
    @GET("characters")
    fun getData(@Query("filter[name]") character: String): Call<CharacterResponse>

    @GET("trending/anime")
    fun getTrending(): Call<Response>

    @GET("anime/{id}")
    fun getSpecific(@Path("id") id: Int):Call<AnimeRoot>
}