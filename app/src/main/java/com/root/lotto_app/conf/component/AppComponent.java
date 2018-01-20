package com.root.lotto_app.conf.component;

import com.root.lotto_app.LottoApplication;
import com.root.lotto_app.conf.module.AppModule;
import com.root.lotto_app.conf.module.MainModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;


/**
 * Created by root on 9/4/17.
 */

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, AppModule.class, MainModule.class})
public interface AppComponent extends AndroidInjector<LottoApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(LottoApplication application);
        AppComponent build();
    }
    void inject(LottoApplication lottoApplication);
}