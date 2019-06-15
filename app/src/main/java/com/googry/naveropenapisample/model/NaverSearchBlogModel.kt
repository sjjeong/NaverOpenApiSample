package com.googry.naveropenapisample.model

import com.googry.naver.domain.model.search.NaverSearchBlog

data class NaverSearchBlogModel(
    val bloggerLink: String,
    val bloggerName: String,
    val description: String,
    val link: String,
    val postdate: String,
    val title: String
)

fun NaverSearchBlog.toPresentation() = NaverSearchBlogModel(
    bloggerLink = bloggerLink,
    bloggerName = bloggerName,
    description = description,
    link = link,
    postdate = postdate,
    title = title
)
