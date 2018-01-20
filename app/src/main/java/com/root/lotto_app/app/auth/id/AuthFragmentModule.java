package com.root.lotto_app.app.auth.id;

import android.app.Fragment;

import com.root.lotto_app.app.auth.AuthorizationFragment;
import com.root.lotto_app.app.auth.presenter.AuthPresenter;
import com.root.lotto_app.app.auth.presenter.AuthPresenterImpl;
import com.root.lotto_app.app.auth.presenter.AuthPresenterView;
import com.root.lotto_app.conf.scope.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Created by root on 12/26/17.
 */
@Module
public abstract class AuthFragmentModule {
    @Binds
    @PerFragment
    abstract android.support.v4.app.Fragment providerAuthFragment(AuthorizationFragment autorizationFragment);
    @Binds
    @PerFragment
    abstract AuthPresenterView providerAuthFragmentView(AuthorizationFragment autorizationFragment);
    @Binds
    @PerFragment
    abstract AuthPresenter providerAuthFragmentPresenter(AuthPresenterImpl authPresenter);
}
