package ge.giosan777.matutu.Retrofit

import ge.giosan777.matutu.models.Person
import retrofit2.http.GET

interface PersonAPI {
    @GET("all")
    fun getAllPerson(): List<Person>

    @GET("all")
    suspend fun getPersonByPhone(): Person
}