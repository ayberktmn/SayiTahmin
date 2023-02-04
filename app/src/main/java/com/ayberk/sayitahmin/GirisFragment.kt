package com.ayberk.sayitahmin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController

import com.ayberk.sayitahmin.databinding.FragmentGirisBinding
import com.google.android.material.snackbar.Snackbar


private var _binding : FragmentGirisBinding? = null
private val binding get() = _binding!!

class GirisFragment : Fragment() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGirisBinding.inflate(inflater,container,false)
        val view = binding.root
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonBasla.setOnClickListener {

            val action = GirisFragmentDirections.actionGirisFragmentToTahminFragment2()
            findNavController().navigate(action)
            Snackbar.make(it,"Oyun Başladı",Snackbar.LENGTH_SHORT).show()

        }
    }



}