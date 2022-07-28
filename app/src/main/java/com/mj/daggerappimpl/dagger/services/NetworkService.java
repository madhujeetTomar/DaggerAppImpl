package com.mj.daggerappimpl.dagger.services;

import android.app.Application;
import android.content.Context;
import com.mj.daggerappimpl.MyApplication;
import com.mj.daggerappimpl.dagger.di.qualifier.NetworkInfo;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class NetworkService {

  private Context myApplication;
  private String apiKey;

  @Inject
  public NetworkService(Context myApplication, @NetworkInfo String apiKey) {
    this.myApplication = myApplication;
    this.apiKey = apiKey;
  }
}
