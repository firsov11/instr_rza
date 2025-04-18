package com.firsov.mybook.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel() : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "РЗА \n"
    }
    val text: LiveData<String> = _text
}