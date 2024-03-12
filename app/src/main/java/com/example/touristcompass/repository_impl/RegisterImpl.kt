package com.example.touristcompass.repository_impl

import com.example.touristcompass.repository.IRegister

class RegisterImpl : IRegister {
    override suspend fun register(
        firstName: String,
        lastName: String,
        username: String,
        email: String,
        password: String,
        passwordAgain: String
    ) {
        if (password == passwordAgain){
            TODO("Not yet implemented")

        }
        else{
            TODO("Not yet implemented")
        }
    }

}