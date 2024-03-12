package com.example.touristcompass.use_case

import com.example.touristcompass.repository_impl.LoginImpl

class LoginUseCase {

    private val loginImpl = LoginImpl()
    suspend fun execute(username:String,password:String){
        loginImpl.login(
            username = username,
            password = password
        )
    }

}