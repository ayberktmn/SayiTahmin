package com.ayberk.sayitahmin

import android.os.Bundle
import android.system.Os.remove
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.ayberk.sayitahmin.databinding.FragmentGirisBinding
import com.ayberk.sayitahmin.databinding.FragmentTahminBinding
import com.google.android.material.snackbar.Snackbar
import kotlin.random.Random

private var _binding : FragmentTahminBinding? = null
private val binding get() = _binding!!

private var rasgeleSayi = 0

private var sayac = 5


class TahminFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        rasgeleSayi = Random.nextInt(101)


      var sayac = 5
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.buttonTahmin.setOnClickListener {

            sayac = sayac - 1

            val tahmin = binding.editTextGirdi.text.toString().toInt()


            if(tahmin == rasgeleSayi){

                val action = TahminFragmentDirections.actionTahminFragment2ToSonucFragment(true)
                findNavController().navigate(action)

                return@setOnClickListener
            }

            else if (tahmin > rasgeleSayi){

                binding.textViewYardim.text = "Azalt"
                binding.textViewSayac.text = "Kalan Hak : $sayac"

            }

           else if (tahmin < rasgeleSayi){

                binding.textViewYardim.text = "Arttır"
                binding.textViewSayac.text = "Kalan Hak : $sayac"

            }

           if (sayac == 0){

                val action = TahminFragmentDirections.actionTahminFragment2ToSonucFragment(false)
                findNavController().navigate(action)


           }
            binding.editTextGirdi.setText("")

            }
    }

    var sayac = 5

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTahminBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}