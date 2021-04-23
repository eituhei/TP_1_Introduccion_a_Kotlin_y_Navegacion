package com.trabajospracticos.ejercicio1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.trabajospracticos.ejercicio1.R

class fragment1 : Fragment() {
    lateinit var v: View
    lateinit var btnGoToFragment2: Button
    lateinit var btnGoToFragment3: Button
    lateinit var btnGoToFragment4: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_fragment1, container, false)

        btnGoToFragment2 = v.findViewById(R.id.btnAPantalla2)
        btnGoToFragment3 = v.findViewById(R.id.btnAPantalla3)
        btnGoToFragment4 = v.findViewById(R.id.btnAPantalla4)
        return v
    }

    override fun onStart() {
        super.onStart()

        btnGoToFragment2.setOnClickListener {

            val action2 = fragment1Directions.actionFragment1ToFragment2()
            v.findNavController().navigate(action2)

        }
        btnGoToFragment3.setOnClickListener {

            val action2 = fragment1Directions.actionFragment1ToFragment3()
            v.findNavController().navigate(action2)

        }
        btnGoToFragment4.setOnClickListener {

            val action2 = fragment1Directions.actionFragment1ToFragment4()
            v.findNavController().navigate(action2)

        }

    }
}