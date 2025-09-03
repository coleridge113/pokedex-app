package com.luna.pokedex.di

import com.luna.pokedex.common.Constants.BASE_URL
import com.luna.pokedex.data.remote.PokeApi
import com.luna.pokedex.data.repository.RemoteSourceImpl
import com.luna.pokedex.domain.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePokeApi(): PokeApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PokeApi::class.java)
    }

    @Provides
    @Singleton
    fun provideRemoteSource(api: PokeApi): Repository {
        return RemoteSourceImpl(api)
    }

}