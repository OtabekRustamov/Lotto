package com.root.lotto_app.app.archive.game.id;

import android.support.v4.app.Fragment;

import com.root.lotto_app.app.archive.game.GameArchiveFragment;
import com.root.lotto_app.conf.scope.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Created by root on 1/15/18.
 */

@Module
public abstract class GameArchiveFragmentModule {
    @Binds
    @PerFragment
    abstract Fragment provideGameArchiveFragment(GameArchiveFragment gameArchiveFragment);

}
