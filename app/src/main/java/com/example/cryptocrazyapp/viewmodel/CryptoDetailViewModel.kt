package com.example.cryptocrazyapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.cryptocrazyapp.model.Crypto
import com.example.cryptocrazyapp.repository.CryptoRepository
import com.example.cryptocrazyapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CryptoDetailViewModel @Inject constructor(private val repository: CryptoRepository) :
    ViewModel() {

    suspend fun getCrypto(id: String): Resource<Crypto> {
        return repository.getCrypto(id)
    }

}