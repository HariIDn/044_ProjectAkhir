package com.example.a044_projectakhir.data

import com.example.a044_projectakhir.model.Bengkel
import android.content.ContentValues
import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.tasks.await


interface CustomerRepository {
    fun getAll(): Flow<List<Bengkel>>
    suspend fun save(bengkel: Bengkel): String
    suspend fun update(bengkel: Bengkel)
    suspend fun delete(bengkelId: String)
    fun getKontakById(bengkelId: String): Flow<Bengkel>
}

class KontakRepositoryImpl(private val firestore: FirebaseFirestore) : CustomerRepository {
    override fun getAll(): Flow<List<Bengkel>> = flow {
        val snapshot = firestore.collection("Kontak")
            .orderBy("nama", Query.Direction.ASCENDING)
            .get()
            .await()
        val kontak = snapshot.toObjects(Bengkel::class.java)
        emit(kontak)
    }.flowOn(Dispatchers.IO)


    override suspend fun save(bengkel: Bengkel): String {
        return try {
            val documentReference = firestore.collection("Customer").add(bengkel).await()
            // Update the Kontak with the Firestore-generated DocumentReference
            firestore.collection("Customer").document(documentReference.id)
                .set(bengkel.copy(id = documentReference.id))
            "Berhasil + ${documentReference.id}"
        } catch (e: Exception) {
            Log.w(ContentValues.TAG, "Error adding document", e)
            "Gagal $e"
        }
    }

    override suspend fun update(bengkel: Bengkel) {
        firestore.collection("Customer").document(bengkel.id).set(bengkel).await()
    }

    override suspend fun delete(bengkelId: String) {
        firestore.collection("Customer").document(bengkelId).delete().await()
    }

    override fun getKontakById(kontakId: String): Flow<Bengkel> {
        return flow {
            val snapshot = firestore.collection("Kontak").document(kontakId).get().await()
            val kontak = snapshot.toObject(Bengkel::class.java)
            emit(kontak!!)
        }.flowOn(Dispatchers.IO)
    }

}
