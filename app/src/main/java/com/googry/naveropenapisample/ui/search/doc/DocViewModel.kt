package com.googry.naveropenapisample.ui.search.doc

import com.dino.library.ui.BaseViewModel
import com.googry.naver.domain.usecase.GetNaverSearchDocUseCase

class DocViewModel(
    private val getNaverSearchDocUseCase: GetNaverSearchDocUseCase
) : BaseViewModel()