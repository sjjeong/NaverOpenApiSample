package com.googry.naveropenapisample.ui.search.adult

import com.dino.library.ui.BaseViewModel
import com.googry.naver.domain.usecase.GetNaverSearchAdultUseCase

class AdultViewModel(
    private val getNaverSearchAdultUseCase: GetNaverSearchAdultUseCase
) : BaseViewModel()