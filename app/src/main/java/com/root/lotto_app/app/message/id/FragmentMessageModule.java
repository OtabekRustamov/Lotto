package com.root.lotto_app.app.message.id;

import android.support.v4.app.Fragment;

import com.root.lotto_app.app.message.NotificationFragment;
import com.root.lotto_app.app.message.presenters.FragmentMessagePresenter;
import com.root.lotto_app.app.message.presenters.FragmentMessagePresenterImpl;
import com.root.lotto_app.app.message.presenters.FragmentMessagePresenterView;
import com.root.lotto_app.conf.scope.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Created by root on 1/9/18.
 */
@Module
public abstract class FragmentMessageModule {
    @Binds
    @PerFragment
    abstract Fragment provideFragmentMesssage(NotificationFragment fragmentMessage);

    @Binds
    @PerFragment
    abstract FragmentMessagePresenterView provideFragmentMessagePresenterView(NotificationFragment fragmentMessage);

    @Binds
    @PerFragment
    abstract FragmentMessagePresenter provideFragmentMessagePresenter(FragmentMessagePresenterImpl fragmentMessagePresenter);

}
