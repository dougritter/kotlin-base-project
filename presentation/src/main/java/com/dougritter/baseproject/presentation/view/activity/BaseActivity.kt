package com.dougritter.baseproject.presentation.view.activity

import android.app.Fragment
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import com.dougritter.baseproject.presentation.AndroidApplication
import com.dougritter.baseproject.presentation.internal.di.components.ApplicationComponent
import com.dougritter.baseproject.presentation.internal.di.modules.ActivityModule

abstract class BaseActivity : AppCompatActivity() {

    //  @Inject Navigator navigator;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.applicationComponent.inject(this)
    }

    protected fun addFragment(containerViewId: Int, fragment: Fragment) {
        val fragmentTransaction = this.fragmentManager.beginTransaction()
        fragmentTransaction.add(containerViewId, fragment)
        fragmentTransaction.commit()
    }

    protected val applicationComponent: ApplicationComponent
        get() = (application as AndroidApplication).applicationComponent!!

    protected val activityModule: ActivityModule
        get() = ActivityModule(this)
}
