package com.googry.naveropenapisample.ui.search.encyc

import com.dino.library.ui.BaseViewModel
import com.googry.naver.domain.usecase.GetNaverSearchEncycUseCase

class EncycViewModel(
    private val getNaverSearchEncycUseCase: GetNaverSearchEncycUseCase
) : BaseViewModel()