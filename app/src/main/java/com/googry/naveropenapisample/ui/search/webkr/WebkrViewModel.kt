package com.googry.naveropenapisample.ui.search.webkr

import com.dino.library.ui.BaseViewModel
import com.googry.naver.domain.usecase.GetNaverSearchWebkrUseCase

class WebkrViewModel(
    private val getNaverSearchWebkrUseCase: GetNaverSearchWebkrUseCase
) : BaseViewModel()