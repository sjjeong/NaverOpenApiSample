package com.googry.naveropenapisample.ui.search.news

import com.dino.library.ui.BaseViewModel
import com.googry.naver.domain.usecase.GetNaverSearchNewsUseCase

class NewsViewModel(
    private val getNaverSearchNewsUseCase: GetNaverSearchNewsUseCase
) : BaseViewModel()