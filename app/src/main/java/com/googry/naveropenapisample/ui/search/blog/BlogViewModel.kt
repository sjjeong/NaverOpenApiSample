package com.googry.naveropenapisample.ui.search.blog

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.dino.library.data.DataResource
import com.dino.library.ui.BaseViewModel
import com.googry.naver.domain.usecase.GetNaverSearchBlogUseCase
import com.googry.naveropenapisample.BuildConfig
import com.googry.naveropenapisample.model.NaverSearchBlogModel
import com.googry.naveropenapisample.model.toPresentation
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class BlogViewModel(
    private val getNaverSearchBlogUseCase: GetNaverSearchBlogUseCase
) : BaseViewModel() {

    private var _liveBlogList = MutableLiveData<List<NaverSearchBlogModel>>()
    val liveBlogList: LiveData<List<NaverSearchBlogModel>> get() = _liveBlogList

    val liveQuery = MutableLiveData<String>("")

    fun searchBlog() = viewModelScope.launch {
        getNaverSearchBlogUseCase(
            clientId = BuildConfig.NAVER_CLIENT_ID,
            clientSecret = BuildConfig.NAVER_CLIENT_SECRET,
            query = liveQuery.value ?: return@launch
        ).collect {
            when (it.status) {
                DataResource.Status.SUCCESS -> {
                    _liveLoading.value = false
                    _liveBlogList.value = it.data?.map { it.toPresentation() }
                }
                DataResource.Status.ERROR -> {
                    _liveLoading.value = false
                }
                DataResource.Status.LOADING -> {
                    _liveLoading.value = true
                }
            }
        }
    }
}