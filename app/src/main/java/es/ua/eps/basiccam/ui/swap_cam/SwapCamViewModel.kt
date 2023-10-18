package es.ua.eps.basiccam.ui.swap_cam

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SwapCamViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Swap Cam Fragment"
    }
    val text: LiveData<String> = _text
}