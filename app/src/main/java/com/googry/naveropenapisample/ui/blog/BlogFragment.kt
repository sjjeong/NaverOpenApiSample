package com.googry.naveropenapisample.ui.blog

import android.os.Bundle
import android.view.View
import com.dino.library.ui.BaseFragment
import com.dino.library.ui.SimpleRecyclerView
import com.googry.naveropenapisample.BR
import com.googry.naveropenapisample.R
import com.googry.naveropenapisample.databinding.BlogFragmentBinding
import com.googry.naveropenapisample.databinding.BlogItemBinding
import com.googry.naveropenapisample.model.NaverSearchBlogModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class BlogFragment : BaseFragment<BlogFragmentBinding>(R.layout.blog_fragment) {

    private val blogViewModel by viewModel<BlogViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding {
            vm = blogViewModel
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