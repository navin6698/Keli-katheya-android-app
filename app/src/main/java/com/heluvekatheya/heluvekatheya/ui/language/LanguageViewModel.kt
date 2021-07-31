package com.heluvekatheya.heluvekatheya.ui.language

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LanguageViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is language update Fragment"
    }
    val text: LiveData<String> = _text
}