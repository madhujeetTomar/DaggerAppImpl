package com.mj.daggerappimpl.dagger.di.component;

import android.app.Activity;
import com.mj.daggerappimpl.dagger.di.module.ActivityModule;
import com.mj.daggerappimpl.dagger.di.scope.ActivityScope;
import com.mj.daggerappimpl.lifecycle.MainActivity;
import dagger.Component;
import javax.inject.Singleton;

@ActivityScope
@Component(dependencies = {ApplicationComponent.class},modules = {ActivityModule.class})
public interface ActivityComponent {

  void inject(MainActivity activity);

}
