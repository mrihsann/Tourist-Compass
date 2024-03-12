package com.example.touristcompass.repository

interface ILogin {
    suspend fun login(username:String,password:String):String
}