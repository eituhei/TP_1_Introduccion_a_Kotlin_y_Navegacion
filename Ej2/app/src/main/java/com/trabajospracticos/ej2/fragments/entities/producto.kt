package com.trabajospracticos.ej2.fragments.entities

import android.os.Parcel
import android.os.Parcelable

class producto (nombre : String, precio : Double, descripcion : String) : Parcelable {
    var nombre: String
    var precio: Double
    var descripcion: String

    init {

        this.nombre = nombre
        this.precio = precio
        this.descripcion= descripcion
    }

    constructor(source: Parcel) : this(
        source.readString()!!,
        source.readDouble()!!,
        source.readString()!!
    )
    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(nombre)
        writeDouble(precio)
        writeString(descripcion)
    }
    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<producto> = object : Parcelable.Creator<producto> {
            override fun createFromParcel(source: Parcel): producto = producto(source)
            override fun newArray(size: Int): Array<producto?> = arrayOfNulls(size)
        }
    }


}