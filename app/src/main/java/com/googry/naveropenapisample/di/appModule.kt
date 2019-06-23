package com.googry.naveropenapisample.di

import com.googry.naveropenapisample.ui.search.adult.AdultViewModel
import com.googry.naveropenapisample.ui.search.blog.BlogViewModel
import com.googry.naveropenapisample.ui.search.book.BookViewModel
import com.googry.naveropenapisample.ui.search.cafearticle.CafearticleViewModel
import com.googry.naveropenapisample.ui.search.doc.DocViewModel
import com.googry.naveropenapisample.ui.search.encyc.EncycViewModel
import com.googry.naveropenapisample.ui.search.errata.ErrataViewModel
import com.googry.naveropenapisample.ui.search.image.ImageViewModel
import com.googry.naveropenapisample.ui.search.kin.KinViewModel
import com.googry.naveropenapisample.ui.search.local.LocalViewModel
import com.googry.naveropenapisample.ui.search.movie.MovieViewModel
import com.googry.naveropenapisample.ui.search.news.NewsViewModel
import com.googry.naveropenapisample.ui.search.shop.ShopViewModel
import com.googry.naveropenapisample.ui.search.webkr.WebkrViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appViewModelModule = module {
    viewModel { BlogViewModel(get()) }
    viewModel { NewsViewModel(get()) }
    viewModel { BookViewModel(get()) }
    viewModel { AdultViewModel(get()) }
    viewModel { EncycViewModel(get()) }
    viewModel { MovieViewModel(get()) }
    viewModel { CafearticleViewModel(get()) }
    viewModel { KinViewModel(get()) }
    viewModel { LocalViewModel(get()) }
    viewModel { ErrataViewModel(get()) }
    viewModel { WebkrViewModel(get()) }
    viewModel { ImageViewModel(get()) }
    viewModel { ShopViewModel(get()) }
    viewModel { DocViewModel(get()) }
}