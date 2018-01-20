package com.root.lotto_app.app.registration.id;

import android.support.v4.app.Fragment;

import com.root.lotto_app.app.registration.RegistrationFragment;
import com.root.lotto_app.app.registration.presenter.RegistrationFragmentPresenter;
import com.root.lotto_app.app.registration.presenter.RegistrationFragmentPresenterImpl;
import com.root.lotto_app.app.registration.presenter.RegistrationFragmentView;
import com.root.lotto_app.conf.scope.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Created by root on 12/26/17.
 */
@Module
public abstract class RegistrFragmentModule {
    @Binds
    @PerFragment
    abstract Fragment provideRegitrFragment(RegistrationFragment fragment);
    @Binds
    @PerFragment
    abstract RegistrationFragmentView provideRegistrPresenterView(RegistrationFragment fragment);
    @Binds
    @PerFragment
    abstract RegistrationFragmentPresenter provideRegistrFragmentPresenter(RegistrationFragmentPresenterImpl fragmentPresenter);

}
