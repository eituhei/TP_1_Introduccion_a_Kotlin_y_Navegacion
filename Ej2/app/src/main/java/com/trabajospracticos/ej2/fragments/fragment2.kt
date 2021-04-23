package com.trabajospracticos.ej2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.trabajospracticos.ej2.R
import com.trabajospracticos.ej2.fragments.entities.producto


class fragment2 : Fragment() {
    lateinit var v: View
    lateinit var Producto : producto
    lateinit var txtName : TextView
    lateinit var txtPrice : TextView
    lateinit var txtDescription : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v=  inflater.inflate(R.layout.fragment_fragment2, container, false)
        txtName = v.findViewById(R.id.txtNombre)
        txtPrice = v.findViewById(R.id.txtPrecio)
        txtDescription = v.findViewById(R.id.txtDescripcion)
        return v
    }

    override fun onStart() {
        super.onStart()
        Producto = fragment2Args.fromBundle(requireArguments()).Producto
        txtName.text = Producto.nombre
        txtPrice.text = "$" + Producto.precio.toString()
        txtDescription.text = Producto.descripcion


    }
}