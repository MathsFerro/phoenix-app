package br.com.fiap.phoenixapp.utils

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.widget.ArrayAdapter

class SelectedFilters (
    var prefeitura: String? = null,
    var relatorios: String? = null
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(prefeitura)
        parcel.writeString(relatorios)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<SelectedFilters> {
        override fun createFromParcel(parcel: Parcel): SelectedFilters {
            return SelectedFilters(parcel)
        }

        override fun newArray(size: Int): Array<SelectedFilters?> {
            return arrayOfNulls(size)
        }
    }
}


fun createAdapters(context: Context): MutableMap<String, ArrayAdapter<String>> {
    val prefeituras: List<String> = listOf("Guarulhos", "Campinas")
    val relatorios: List<String> = listOf("Receita", "Despesas")

    val prefeiturasAdapter = ArrayAdapter(context, br.com.fiap.phoenixapp.R.layout.support_simple_spinner_dropdown_item, prefeituras)
    val relatoriosAdapter = ArrayAdapter(context, android.R.layout.simple_spinner_item, relatorios)

    prefeiturasAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
    relatoriosAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

    return mutableMapOf<String, ArrayAdapter<String>>(
        "prefeituras" to prefeiturasAdapter,
        "relatorios" to relatoriosAdapter
    )
}
