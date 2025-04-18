package com.firsov.mybook.ui.at2general

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.firsov.mybook.databinding.FragmentAt2generalBinding

class at2generalFragment : Fragment() {

    private var _binding: FragmentAt2generalBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAt2generalBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        // Устанавливаем текст из ресурсов
//        binding.at2Part.text = getString(R.string.at2_part)
//        binding.at2SecondPart.text = getString(R.string.at2_second_part)
//        binding.at2SecondPart.text = getString(R.string.at2_third_part)
//
//        // Устанавливаем изображения из drawable
//        binding.at2Image1.setImageResource(R.drawable.tt2at_1)
//        binding.at2Image2.setImageResource(R.drawable.tt2at_2)
//        binding.ret6701kImage1.setImageResource(R.drawable.ret6701k_1)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}