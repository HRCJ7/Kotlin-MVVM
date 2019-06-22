package com.rajitha.countries.di

import com.rajitha.countries.model.CountriesService
import com.rajitha.countries.viewmodel.ListViewModel
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: CountriesService)

    fun inject(viewModel: ListViewModel)
}