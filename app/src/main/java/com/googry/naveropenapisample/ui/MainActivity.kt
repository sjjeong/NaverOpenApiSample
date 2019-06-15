package com.googry.naveropenapisample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dino.library.ext.replaceFragmentInActivity
import com.googry.naveropenapisample.R
import com.googry.naveropenapisample.ui.blog.BlogFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragmentInActivity(BlogFragment.newInstance(), R.id.fl_content)
    }
}
