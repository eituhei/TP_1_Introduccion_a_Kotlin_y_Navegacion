package com.trabajospracticos.ejercicio1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.trabajospracticos.ejercicio1.R


class fragment2 : Fragment() {
    lateinit var v: View
    lateinit var btnGoToFragment4: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_fragment2, container, false)

        btnGoToFragment4 = v.findViewById(R.id.btnDePantalla2A4)
        return v
    }
    override fun onStart() {
        super.onStart()

        btnGoToFragment4.setOnClickListener {

            val action2 = fragment2Directions.actionFragment2ToFragment4()
            v.findNavController().navigate(action2)
        }

    }
}