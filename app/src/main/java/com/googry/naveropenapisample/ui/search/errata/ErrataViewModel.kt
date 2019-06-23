package com.googry.naveropenapisample.ui.search.errata

import com.dino.library.ui.BaseViewModel
import com.googry.naver.domain.usecase.GetNaverSearchErrataUseCase

class ErrataViewModel(
    private val getNaverSearchErrataUseCase: GetNaverSearchErrataUseCase
) : BaseViewModel()