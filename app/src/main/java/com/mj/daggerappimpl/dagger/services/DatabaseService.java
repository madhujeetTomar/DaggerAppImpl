package com.mj.daggerappimpl.dagger.services;

import android.app.Application;
import android.content.Context;
import com.mj.daggerappimpl.MyApplication;
import com.mj.daggerappimpl.dagger.di.qualifier.DatabaseInfo;
import com.mj.daggerappimpl.dagger.di.qualifier.DatabaseVersionInfo;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DatabaseService {

  private Context context;
  private String databaseName;
  private String version;

  @Inject
  public DatabaseService(Context context, @DatabaseInfo String databaseName,
  @DatabaseVersionInfo String version) {
    this.context = context;
    this.databaseName = databaseName;
    this.version = version;
  }
}
