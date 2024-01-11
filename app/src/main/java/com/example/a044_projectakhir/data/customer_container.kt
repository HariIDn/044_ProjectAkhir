package com.example.a044_projectakhir.data

import com.google.firebase.firestore.FirebaseFirestore

interface AppContainer {
    val customerRepository: CustomerRepository
}

class CustomerContainer : AppContainer{
    private val firestore: FirebaseFirestore = FirebaseFirestore.getInstance()

    override val customerRepository: CustomerRepository by lazy {
        KontakRepositoryImpl(firestore)
    }
}