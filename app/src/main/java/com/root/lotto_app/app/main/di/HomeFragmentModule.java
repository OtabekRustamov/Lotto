package com.root.lotto_app.app.main.di;

import android.support.v4.app.Fragment;

import com.root.lotto_app.app.main.HomeFragment;
import com.root.lotto_app.app.main.presenters.HomeFragmentPresenter;
import com.root.lotto_app.app.main.presenters.HomeFragmentPresenterIml;
import com.root.lotto_app.app.main.presenters.HomeFragmentPresenterView;
import com.root.lotto_app.conf.scope.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Created by root on 12/21/17.
 */

@Module
public abstract class HomeFragmentModule {
    @Binds
    @PerFragment
    abstract Fragment provideHomeFragment(HomeFragment fragment);

    @Binds
    @PerFragment
    abstract HomeFragmentPresenterView provideHomePresenterView(HomeFragment fragment);

    @Binds
    @PerFragment
    abstract HomeFragmentPresenter provideHomeFragmentPresenter(HomeFragmentPresenterIml presenter);
}
