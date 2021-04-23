package com.trabajospracticos.ejercicio1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.trabajospracticos.ejercicio1.R

class fragment3 : Fragment() {
    lateinit var vista: View
    lateinit var btnGoToFragmento1: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_fragment3, container, false)

        btnGoToFragmento1 = vista.findViewById(R.id.btnDePantalla3A1)
        return vista
    }
    override fun onStart() {
        super.onStart()

        btnGoToFragmento1.setOnClickListener{

            val action = fragment3Directions.actionFragment3ToFragment1()
            vista.findNavController().navigate(action)
        }
    }

}