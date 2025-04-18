package com.firsov.mybook.ui.general_part

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.firsov.mybook.R
import com.firsov.mybook.databinding.FragmentGeneralPartBinding

class GeneralPartFragment : Fragment() {

    private var _binding: FragmentGeneralPartBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGeneralPartBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textGeneralPart

            textView.text = getString(R.string.general_part)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}