package com.ayberk.sayitahmin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.ayberk.sayitahmin.databinding.FragmentGirisBinding
import com.ayberk.sayitahmin.databinding.FragmentSonucBinding

private var _binding : FragmentSonucBinding? = null
private val binding get() = _binding!!

class SonucFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val sonuc = SonucFragmentArgs.fromBundle(it).sonuc

            if (sonuc) {

                binding.textViewSonuc.text = "KAZANDINIZ"
                binding.imageViewsonuc.setImageResource(R.drawable.mutlu_resim)

            } else {
                binding.textViewSonuc.text = "KAYBETTİNİZ"
                binding.imageViewsonuc.setImageResource(R.drawable.uzgun_resim)


            }


        }


        binding.buttonTekrar.setOnClickListener {

            val action = SonucFragmentDirections.actionSonucFragmentToGirisFragment()
            findNavController().navigate(action)

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSonucBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

}