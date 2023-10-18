package es.ua.eps.basiccam.ui.take_pic

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TakePicViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Take Pic Fragment"
    }
    val text: LiveData<String> = _text
}