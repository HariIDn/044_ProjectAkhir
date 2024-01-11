package com.example.a044_projectakhir.model

data class Bengkel(
    val id: String,
    val nama: String,
    val motor: String,
    val oli: String
){
    constructor(): this("","","","")
}

data class Services(
    val id: String,
    val nama: String,
    val servis: String,
)