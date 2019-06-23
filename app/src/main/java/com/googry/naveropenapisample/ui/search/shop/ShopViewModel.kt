package com.googry.naveropenapisample.ui.search.shop

import com.dino.library.ui.BaseViewModel
import com.googry.naver.domain.usecase.GetNaverSearchShopUseCase

class ShopViewModel(
    private val getNaverSearchShopUseCase: GetNaverSearchShopUseCase
) : BaseViewModel()