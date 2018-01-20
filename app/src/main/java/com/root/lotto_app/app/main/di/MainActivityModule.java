package com.root.lotto_app.app.main.di;

import android.support.v7.app.AppCompatActivity;

import com.root.lotto_app.app.main.HomeFragment;
import com.root.lotto_app.app.main.MainActivity;
import com.root.lotto_app.conf.scope.PerActivity;
import com.root.lotto_app.conf.scope.PerFragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by root on 12/21/17.
 */

@Module
public abstract class MainActivityModule {
    @Binds
    @PerActivity
    abstract AppCompatActivity provideMainActivity(MainActivity activity);
//    @Binds
//    @PerActivity
//    abstract  provideLoginActivityBaseView(LoginActivity activity);
//    @Binds
//    @PerActivity
//    abstract LoginActivityPresenter provideLoginActivityPresenter(LoginActivityPresenterImpl presenter);

    @PerFragment
    @ContributesAndroidInjector(modules = HomeFragmentModule.class)
    abstract HomeFragment provideHomeFragment();
}
