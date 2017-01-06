package com.dougritter.baseproject.presentation.view.activity

import android.os.Bundle
import com.dougritter.baseproject.R

class MainActivity : BaseActivity() {

    val TAG = MainActivity::class.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}
