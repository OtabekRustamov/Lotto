package com.root.lotto_app.app.winner.id;

import android.support.v4.app.Fragment;

import com.root.lotto_app.app.winner.FragmentWinner;
import com.root.lotto_app.conf.scope.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Created by root on 1/12/18.
 */
@Module
public abstract class WinnerFragmentModul {
    @Binds
    @PerFragment
    abstract Fragment providerWinnerFragment(FragmentWinner winner);
}
