package com.example.a044_projectakhir.ui.theme

import com.example.a044_projectakhir.model.Bengkel
import com.example.a044_projectakhir.model.Services

data class AddUIState(
    val addEvent: AddEvent = AddEvent(),
)

data class AddEvent(
    val id: String = "",
    val nama: String = "",
    val servis: String = "",

)

fun AddEvent.toServices() = Services(
    id = id,
    nama = nama,
    servis = servis
)

data class DetailUIState(
    val addEvent: AddEvent = AddEvent(),
)

fun Services.toDetailServis(): AddEvent =
    AddEvent(
        id = id,
        nama = nama,
        servis = servis
)

fun Services.toUIStateServices(): AddUIState = AddUIState(
    addEvent =this.toDetailServis()
)

data class ServicesUIState(
    val listKontak: List<Services> = listOf(),
    val dataLength: Int = 0
)