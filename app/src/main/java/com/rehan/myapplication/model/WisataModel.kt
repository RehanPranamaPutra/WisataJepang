package com.rehan.myapplication.model

import com.rehan.myapplication.R

data class WisataModel(
    val gambar : Int,
    val nama : String,
    val tempat : String,
    val detail : String
)

object WisataList {
    fun getModel(): List<WisataModel> {
        val itemModel1 = WisataModel(
            R.drawable.osaka,
            "Osaka",
            "City in Kansai",
            "Osaka is a designated city in the Kansai region of Honshu in Japan, and one of the three major cities of Japan (Tokyo-Osaka-Nagoya). It is the capital of and most populous city in Osaka Prefecture, and the third-most populous city in Japan"

        )
        val itemModel2 = WisataModel(
            R.drawable.asakusa,
            "Asakusa",
            "District in Taito",
            "Asakusa is a district in Taitō, Tokyo, Japan. It is known for the Sensō-ji, a Buddhist temple dedicated to the bodhisattva Kannon. There are several other temples in Asakusa, as well as various festivals, such as the Sanja Matsuri"

        )
        val itemModel3 = WisataModel(
            R.drawable.oip,
            "Hoshu",
            "Largest Island of Japan",
            "Honshu , historically called Akitsushima (秋津島, lit. 'Dragonfly island'), is the largest and most populous island of Japan. It is located south of Hokkaidō across the Tsugaru Strait, north of Shikoku across the Inland Sea, and northeast of Kyūshū across the Kanmon Straits."

        )
        val itemModel4 = WisataModel(
            R.drawable.hakone,
            "Hakone",
            "Kanagawa Prefecture",
            "Hakone (箱根町, Hakone-machi) is a town in Kanagawa Prefecture, Japan. As of 1 October 2023 , the town had a population of 10,965, and total area of 92.82 km (35.84 sq mi)."

        )

        val itemList: ArrayList<WisataModel> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)


        return itemList
    }
}
