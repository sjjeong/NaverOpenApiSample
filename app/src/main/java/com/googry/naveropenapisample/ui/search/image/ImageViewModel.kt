package com.googry.naveropenapisample.ui.search.image

import com.dino.library.ui.BaseViewModel
import com.googry.naver.domain.usecase.GetNaverSearchImageUseCase

class ImageViewModel(
    private val getNaverSearchImageUseCase: GetNaverSearchImageUseCase
) : BaseViewModel()