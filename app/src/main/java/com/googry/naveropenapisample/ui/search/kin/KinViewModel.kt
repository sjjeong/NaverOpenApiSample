package com.googry.naveropenapisample.ui.search.kin

import com.dino.library.ui.BaseViewModel
import com.googry.naver.domain.usecase.GetNaverSearchKinUseCase

class KinViewModel(
    private val getNaverSearchKinUseCase: GetNaverSearchKinUseCase
) : BaseViewModel()