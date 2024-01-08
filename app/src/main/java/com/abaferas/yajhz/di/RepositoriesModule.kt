package com.abaferas.yajhz.di

import com.abaferas.yajhz.data.repository.IRepository
import com.abaferas.yajhz.data.repository.IRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {
    @Binds
    abstract fun provideRepository(
        iRepositoryImpl: IRepositoryImpl
    ): IRepository
}