package com.root.lotto_app.app.anketa.id;

import android.support.v4.app.Fragment;

import com.root.lotto_app.app.anketa.AnketaFragment;
import com.root.lotto_app.app.anketa.presenter.AnketaFragmentPresenter;
import com.root.lotto_app.app.anketa.presenter.AnketaFragmentPresenterImpl;
import com.root.lotto_app.app.anketa.presenter.AnketaFragmentPresenterView;
import com.root.lotto_app.conf.scope.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Created by root on 1/4/18.
 */
@Module
public abstract class AnketaFragmentModule {
    @Binds
    @PerFragment
    abstract Fragment provideAnketaFragment(AnketaFragment fragment);

//    @Binds
//    @PerFragment
//    abstract AnketaFragmentPresenterView provideAnketaPresenterView(AnketaFragment anketaFragment);
//
//    @Binds
//    @PerFragment
//    abstract AnketaFragmentPresenter provideAnketaPresenter(AnketaFragmentPresenterImpl anketaPresenter);
}
