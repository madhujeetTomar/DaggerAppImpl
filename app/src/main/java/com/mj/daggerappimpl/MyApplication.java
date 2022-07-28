package com.mj.daggerappimpl;

import android.app.Application;
import android.util.Log;

import com.mj.daggerappimpl.dagger.di.component.ApplicationComponent;
import com.mj.daggerappimpl.dagger.di.component.DaggerApplicationComponent;
import com.mj.daggerappimpl.dagger.di.module.ApplicationModule;
import com.mj.daggerappimpl.dagger.services.DatabaseService;
import com.mj.daggerappimpl.dagger.services.NetworkService;
import javax.inject.Inject;

public class MyApplication extends Application {



  public ApplicationComponent applicationComponent;

  @Override
  public void onCreate() {
    super.onCreate();

    applicationComponent = DaggerApplicationComponent.builder()
        .applicationModule(new ApplicationModule(this)).build();
    /*store application component*/
    applicationComponent.inject(this);



  }
}
