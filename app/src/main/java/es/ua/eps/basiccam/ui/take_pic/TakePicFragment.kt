package es.ua.eps.basiccam.ui.take_pic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import es.ua.eps.basiccam.databinding.FragmentTakePicBinding

class TakePicFragment : Fragment() {

    private var _binding: FragmentTakePicBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val takePicViewModel =
            ViewModelProvider(this).get(TakePicViewModel::class.java)

        _binding = FragmentTakePicBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textTakePic
        takePicViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}