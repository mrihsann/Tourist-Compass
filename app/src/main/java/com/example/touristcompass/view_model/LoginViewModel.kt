package com.example.touristcompass.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.touristcompass.use_case.LoginUseCase
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel() {
    private val loginUseCase = LoginUseCase()

    val username = MutableLiveData("")
    val password = MutableLiveData("")

    fun login(){
        viewModelScope.launch {
            loginUseCase.execute(username = username.value!!, password = password.value!!)
        }
    }
}