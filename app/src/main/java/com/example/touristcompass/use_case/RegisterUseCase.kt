package com.example.touristcompass.use_case

import com.example.touristcompass.repository_impl.RegisterImpl

class RegisterUseCase {
    private val registerImpl = RegisterImpl()

    suspend fun execute(
        firstName: String,
        lastName: String,
        username: String,
        email: String,
        password: String,
        passwordAgain: String
    ){
        registerImpl.register(
            firstName = firstName,
            lastName = lastName,
            username = username,
            email = email,
            password = password,
            passwordAgain = passwordAgain
        )
    }
}