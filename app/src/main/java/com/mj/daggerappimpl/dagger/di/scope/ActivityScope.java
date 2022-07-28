package com.mj.daggerappimpl.dagger.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.security.Policy;
import javax.inject.Scope;

@Scope
@Retention(RetentionPolicy.SOURCE)
public @interface ActivityScope {

}
