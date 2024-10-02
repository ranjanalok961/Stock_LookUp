package com.example.stook_lookup

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import kotlin.math.log

@SuppressLint("NullSafeMutableLiveData")
class StockViewModel : ViewModel() {

    private val _mostActiveStocks = MutableLiveData<StockResponse>()
    val mostActiveStocks: LiveData<StockResponse> get() = _mostActiveStocks

    private val coroutineScope = CoroutineScope(Dispatchers.IO + SupervisorJob())

    init {
        coroutineScope.launch {
            try {
                Log.d("ViewModel", "Fetching data...")
                val response = StockRepository().getMostActiveStocks(
                    "d8364edc31msh8b923d7742a56f8p103aa1jsnfe5c61ef2e81",
                    "yahoo-finance15.p.rapidapi.com"
                )
                if (response != null) {
                    _mostActiveStocks.postValue(response)
                    Log.d("ViewModel", "Data received: ${response.body[0].symbolName}")
                } else {
                    Log.e("ViewModel", "Failed to retrieve data")
                }
            } catch (e: Exception) {
                Log.e("ViewModel", "Exception: ${e.message}")
            }
        }
    }
}
