package ge.giosan777.matutu.Retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class CreateRetrofit() {
    val retrofit= Retrofit.Builder()
        .baseUrl("http://162.55.141.130:1990/user_mobile_base")
        .addConverterFactory(GsonConverterFactory.create()).build()
    val personAPI=retrofit.create(PersonAPI::class.java)





}