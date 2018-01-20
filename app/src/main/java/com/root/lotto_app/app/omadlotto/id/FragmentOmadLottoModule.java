package com.root.lotto_app.app.omadlotto.id;

import android.support.v4.app.Fragment;

import com.root.lotto_app.app.omadlotto.FragmentOmadLotto;
import com.root.lotto_app.conf.scope.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Created by root on 1/16/18.
 */
@Module
public abstract class FragmentOmadLottoModule {
    @Binds
    @PerFragment
    abstract Fragment provideFragmentOmadLotto(FragmentOmadLotto omadLotto);
}
