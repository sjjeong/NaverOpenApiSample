package com.googry.naveropenapisample.ui.search.local

import com.dino.library.ui.BaseViewModel
import com.googry.naver.domain.usecase.GetNaverSearchLocalUseCase

class LocalViewModel(
    private val getNaverSearchLocalUseCase: GetNaverSearchLocalUseCase
) : BaseViewModel()
