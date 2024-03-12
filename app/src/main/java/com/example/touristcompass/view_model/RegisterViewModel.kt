package com.example.touristcompass.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.touristcompass.use_case.RegisterUseCase
import kotlinx.coroutines.launch

class RegisterViewModel : ViewModel() {
    private val registerUseCase = RegisterUseCase()

    val firstName = MutableLiveData("")
    val lastName = MutableLiveData("")
    val userName = MutableLiveData("")
    val email = MutableLiveData("")
    val password = MutableLiveData("")
    val passwordAgain = MutableLiveData("")

    fun register(
        firstName: String,
        lastName: String,
        username: String,
        email: String,
        password: String,
        passwordAgain: String){
        viewModelScope.launch {
            registerUseCase.execute(
                firstName = firstName,
                lastName = lastName,
                username = username,
                email = email,
                password = password,
                passwordAgain = passwordAgain
            )
        }
    }
}