package com.root.lotto_app.app.news.id;

import android.support.v4.app.Fragment;

import com.root.lotto_app.app.news.NewsFragment;
import com.root.lotto_app.app.news.presenters.NewsFragmentPresenter;
import com.root.lotto_app.app.news.presenters.NewsFragmentPresenterImpl;
import com.root.lotto_app.app.news.presenters.NewsFragmentPresenterView;
import com.root.lotto_app.conf.scope.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Created by root on 1/8/18.
 */

@Module
public abstract class NewsFragmentModule {
    @Binds
    @PerFragment
    abstract Fragment provideNewsFragment(NewsFragment newsFragment);

    @Binds
    @PerFragment
    abstract NewsFragmentPresenterView provideNewsFragmentPresenterView(NewsFragment newsFragment);

    @Binds
    @PerFragment
    abstract NewsFragmentPresenter provideNewsFragmentPresenter(NewsFragmentPresenterImpl fragmentPresenter);
}
