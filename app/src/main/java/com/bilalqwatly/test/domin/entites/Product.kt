package com.bilalqwatly.test.domin.entites


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Product(


    @SerialName("name")
    val name: String? = "",



    @SerialName("price")
    val price: String? = "",

    )