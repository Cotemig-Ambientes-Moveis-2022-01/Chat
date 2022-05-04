package br.com.cotemig.chat.services

import br.com.cotemig.chat.models.Friend
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface ServiceFriend {

    @GET("account/friends")
    fun getFriend(@Header("token") token: String): Call<List<Friend>>

}