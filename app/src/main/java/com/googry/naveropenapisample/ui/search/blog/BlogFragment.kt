package com.googry.naveropenapisample.ui.search.blog

import android.os.Bundle
import android.view.View
import com.dino.library.ui.BaseFragment
import com.dino.library.ui.SimpleRecyclerView
import com.googry.naveropenapisample.BR
import com.googry.naveropenapisample.R
import com.googry.naveropenapisample.databinding.BlogFragmentBinding
import com.googry.naveropenapisample.databinding.BlogItemBinding
import com.googry.naveropenapisample.model.NaverSearchBlogModel
import org.koin.androidx.viewmodel.ext.android.getViewModel

class BlogFragment :
    BaseFragment<BlogFragmentBinding, BlogViewModel>(R.layout.blog_fragment) {

    override val viewModel = getViewModel<BlogViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding {
            rvContent.adapter =
                object : SimpleRecyclerView.Adapter<NaverSearchBlogModel, BlogItemBinding>(
                    layoutRes = R.layout.blog_item,
                    bindingVariableId = BR.item
                ) {}
        }
    }

    companion object {
        fun newInstance() = BlogFragment().apply {
            arguments = Bundle().apply {

            }
        }
    }
}