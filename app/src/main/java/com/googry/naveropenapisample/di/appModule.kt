package com.googry.naveropenapisample.di

import com.googry.naveropenapisample.ui.blog.BlogViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appViewModelModule = module {
    viewModel { BlogViewModel(get()) }
}