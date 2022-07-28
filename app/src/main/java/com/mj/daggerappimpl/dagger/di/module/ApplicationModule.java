package com.mj.daggerappimpl.dagger.di.module;

import android.content.Context;
import com.mj.daggerappimpl.MyApplication;
import com.mj.daggerappimpl.dagger.di.qualifier.DatabaseInfo;
import com.mj.daggerappimpl.dagger.di.qualifier.DatabaseVersionInfo;
import com.mj.daggerappimpl.dagger.di.qualifier.NetworkInfo;
import com.mj.daggerappimpl.dagger.services.DatabaseService;
import com.mj.daggerappimpl.dagger.services.NetworkService;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module
public class ApplicationModule {

  private MyApplication myApplication;

  public ApplicationModule(MyApplication myApplication) {
    this.myApplication = myApplication;
  }

  @Provides
  Context providesContext() {
    return myApplication;
  }

  @DatabaseInfo
  @Provides
  String providesDatabaseName() {
    return "ABC";
  }

  @DatabaseVersionInfo
  @Provides
  String providesVersionName() {
    return "1.0";
  }

  @NetworkInfo
  @Provides
  String providesApiKey() {
    return "ABC";
  }

  // Commenting after added @inject in constructor
 /* @Singleton
  @Provides
  NetworkService provideNetworkService() {
    return new NetworkService(myApplication, "abc");
  }

  @Singleton
  @Provides
  DatabaseService provideDatabaseService() {
    return new DatabaseService(myApplication, "abc", "1.0");
  }*/

}
