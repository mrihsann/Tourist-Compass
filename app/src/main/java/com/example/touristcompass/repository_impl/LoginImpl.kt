package com.example.touristcompass.repository_impl

import com.example.touristcompass.repository.ILogin

class LoginImpl : ILogin {
    override suspend fun login(username: String, password: String): String {
        TODO("Not yet implemented")
    }
}