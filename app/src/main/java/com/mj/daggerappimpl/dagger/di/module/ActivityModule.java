package com.mj.daggerappimpl.dagger.di.module;

import android.app.Activity;
import android.content.Context;
import com.mj.daggerappimpl.dagger.services.DatabaseService;
import com.mj.daggerappimpl.dagger.services.NetworkService;
import com.mj.daggerappimpl.dagger.viewmodel.MainViewModel;
import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
  Activity activity;

  public ActivityModule(Activity activity) {
    this.activity = activity;
  }

  @Provides
  Context providesContext() {
    return activity;
  }

// commented after add @inject in constructor of viewmodel
 /* @Provides
  MainViewModel providesMainViewModel(NetworkService networkService, DatabaseService databaseService) {
    return new MainViewModel(databaseService, networkService);}*/
    //commenting the code as it is giving different instance at runtime
 /* @Provides
  MainViewModel providesMainViewModel()
  {
    return new MainViewModel(new DatabaseService(activity.getApplication(),
        "abc","1.0"), new NetworkService(activity.getApplication(),
        "abc"));
  }*/
  }
