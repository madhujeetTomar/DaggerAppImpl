package com.mj.daggerappimpl.dagger.viewmodel;

import com.mj.daggerappimpl.dagger.services.DatabaseService;
import com.mj.daggerappimpl.dagger.services.NetworkService;
import javax.inject.Inject;

public class MainViewModel {

  private DatabaseService databaseService;
  private NetworkService networkService;

@Inject
  public MainViewModel(DatabaseService databaseService,
      NetworkService networkService) {
    this.databaseService = databaseService;
    this.networkService = networkService;
  }


  public String getSomeData()
  {
    return "hellllllloooo";
  }

}
