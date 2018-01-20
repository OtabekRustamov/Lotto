package com.root.lotto_app.app.play.id;

import android.support.v4.app.Fragment;

import com.root.lotto_app.app.play.PlayFragment;
import com.root.lotto_app.conf.scope.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Created by root on 1/15/18.
 */
@Module
public abstract class PlayFragmentModule {
    @Binds
    @PerFragment
    abstract Fragment providePlayFragment(PlayFragment playFragmen);
}
