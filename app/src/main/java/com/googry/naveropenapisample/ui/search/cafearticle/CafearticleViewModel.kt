package com.googry.naveropenapisample.ui.search.cafearticle

import com.dino.library.ui.BaseViewModel
import com.googry.naver.domain.usecase.GetNaverSearchCafearticleUseCase

class CafearticleViewModel(
    private val getNaverSearchCafearticleUseCase: GetNaverSearchCafearticleUseCase
) : BaseViewModel()