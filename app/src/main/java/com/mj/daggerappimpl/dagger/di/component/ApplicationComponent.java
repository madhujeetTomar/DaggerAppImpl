package com.mj.daggerappimpl.dagger.di.component;

import com.mj.daggerappimpl.MyApplication;
import com.mj.daggerappimpl.dagger.di.module.ApplicationModule;
import com.mj.daggerappimpl.dagger.di.qualifier.DatabaseInfo;
import com.mj.daggerappimpl.dagger.services.DatabaseService;
import com.mj.daggerappimpl.dagger.services.NetworkService;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
   void inject(MyApplication myApplication);

   NetworkService getNetworkService();
   DatabaseService getDatabaseService();


}
