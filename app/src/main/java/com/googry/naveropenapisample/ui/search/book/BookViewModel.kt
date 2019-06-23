package com.googry.naveropenapisample.ui.search.book

import com.dino.library.ui.BaseViewModel
import com.googry.naver.domain.usecase.GetNaverSearchBookUseCase

class BookViewModel(
    private val getNaverSearchBookUseCase: GetNaverSearchBookUseCase
) : BaseViewModel()