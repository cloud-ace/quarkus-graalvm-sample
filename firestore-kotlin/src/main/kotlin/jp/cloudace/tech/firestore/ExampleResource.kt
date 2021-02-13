package jp.cloudace.tech.firestore

import com.google.auth.oauth2.GoogleCredentials
import com.google.cloud.firestore.FirestoreOptions
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello(): String {
        val credentials = GoogleCredentials.getApplicationDefault()
        val firestoreOptions = FirestoreOptions.newBuilder()
            .setCredentials(credentials)
            .build()
        val db = firestoreOptions.service

        val query = db.collection("users").get()
        val querySnapshot = query.get()
        val documents = querySnapshot.documents

        return documents.joinToString { it.id }
    }

}
