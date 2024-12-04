package com.neorandom.artspace.data.model

import com.neorandom.artspace.R

class ArtInfo(id: Int) {
    val infoFooterData: InfoFooterData = infoFooterDataArray[id]
    val imageID: Int = imagesArray[id]

    companion object {
        val getMaxSize = { infoFooterDataArray.size - 1 }
    }
}

val infoFooterDataArray = arrayOf(
    InfoFooterData(
        title = "Osamu Sugiyama",
        description = "Vila em uma montanha nevosa"
    ),
    InfoFooterData(
        title = "Osamu Sugiyama",
        description = "Pintura de Machu Picchu"
    ),
    InfoFooterData(
        title = "Osamu Sugiyama",
        description = "Campo de arroz no Japão"
    ),
    InfoFooterData(
        title = "Osamu Sugiyama",
        description = "Viajantes em uma montanha nevosa"
    ),
    InfoFooterData(
        title = "Osamu Sugiyama",
        description = "Vila no meio de um vale"
    )
)

val imagesArray = arrayOf(
    R.drawable.village_in_a_snowy_mountain,
    R.drawable.machu_picchu,
    R.drawable.rice_field_in_japan,
    R.drawable.travellers_in_a_snowy_mountain,
    R.drawable.village_in_a_valley
)
