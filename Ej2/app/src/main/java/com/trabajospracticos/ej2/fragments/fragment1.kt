package com.trabajospracticos.ej2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.trabajospracticos.ej2.R
import com.trabajospracticos.ej2.fragments.entities.producto


class fragment1 : Fragment() {
    lateinit var v: View
    lateinit var btnGoToFragment2: Button
    lateinit var Producto : producto

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_fragment1, container, false)

        btnGoToFragment2 = v.findViewById(R.id.btnFrom1To2)
        // Inflate the layout for this fragment
        return v
    }
    override fun onStart() {
        super.onStart()

        Producto = producto ("LEGO",300.0,"Bloque de 1cmx1cm")

        btnGoToFragment2.setOnClickListener {
            val action = fragment1Directions.actionFragment1ToFragment2(Producto)
            v.findNavController().navigate(action)
        }
    }

}