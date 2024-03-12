package com.example.touristcompass.repository

interface IRegister {
    suspend fun register(firstName:String,lastName:String,username:String,email:String,password:String,passwordAgain:String)
}