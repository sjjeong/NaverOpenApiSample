package com.googry.naveropenapisample.ui.search.movie

import com.dino.library.ui.BaseViewModel
import com.googry.naver.domain.usecase.GetNaverSearchMovieUseCase

class MovieViewModel(
    private val getNaverSearchMovieUseCase: GetNaverSearchMovieUseCase
) : BaseViewModel()