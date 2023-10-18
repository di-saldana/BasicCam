package es.ua.eps.basiccam.ui.swap_cam

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import es.ua.eps.basiccam.databinding.FragmentSwapCamBinding

class SwapCamFragment : Fragment() {

    private var _binding: FragmentSwapCamBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val swapCamViewModel =
            ViewModelProvider(this).get(SwapCamViewModel::class.java)

        _binding = FragmentSwapCamBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSwapCam
        swapCamViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}