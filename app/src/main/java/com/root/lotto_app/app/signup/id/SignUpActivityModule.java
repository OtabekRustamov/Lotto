package com.root.lotto_app.app.signup.id;

import com.root.lotto_app.app.signup.SignUpActivity;
import com.root.lotto_app.conf.scope.PerActivity;

import dagger.Binds;
import dagger.Module;

/**
 * Created by root on 12/26/17.
 */
@Module
public abstract class SignUpActivityModule {
    @Binds
    @PerActivity
    abstract SignUpActivity providerSighUpActivity(SignUpActivity signUpActivity);
}
