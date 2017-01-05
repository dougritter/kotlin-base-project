package com.dougritter.baseproject.presentation.view.activity;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dougritter.baseproject.presentation.AndroidApplication;
import com.dougritter.baseproject.presentation.internal.di.components.ApplicationComponent;
import com.dougritter.baseproject.presentation.internal.di.modules.ActivityModule;

import javax.inject.Inject;

public abstract class BaseActivity extends AppCompatActivity {

//  @Inject Navigator navigator;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.getApplicationComponent().inject(this);
  }

  protected void addFragment(int containerViewId, Fragment fragment) {
    FragmentTransaction fragmentTransaction = this.getFragmentManager().beginTransaction();
    fragmentTransaction.add(containerViewId, fragment);
    fragmentTransaction.commit();
  }

  protected ApplicationComponent getApplicationComponent() {
    return ((AndroidApplication) getApplication()).getApplicationComponent();
  }

  protected ActivityModule getActivityModule() {
    return new ActivityModule(this);
  }
}
