package com.root.lotto_app.app.oltinbaliq.id;

import android.support.v4.app.Fragment;

import com.root.lotto_app.app.oltinbaliq.FragmentOltinBaliq;
import com.root.lotto_app.app.oltinbaliq.presenters.FragmentOltinBaliqPresenter;
import com.root.lotto_app.app.oltinbaliq.presenters.FragmentOltinBaliqPresenterImpl;
import com.root.lotto_app.app.oltinbaliq.presenters.FragmentOltinBaliqPresenterView;
import com.root.lotto_app.conf.scope.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Created by root on 1/9/18.
 */
@Module
public abstract class FragmentOltinBaliqMudule {
    @Binds
    @PerFragment
    abstract Fragment provideFragmentOltinBaliq(FragmentOltinBaliq oltinBaliq);
    @Binds
    @PerFragment
    abstract FragmentOltinBaliqPresenterView provideFragmentOltinBaliqPresenterView(FragmentOltinBaliq oltinBaliq);
    @Binds
    @PerFragment
    abstract FragmentOltinBaliqPresenter provideFragmentOltinBaliqPresenter(FragmentOltinBaliqPresenterImpl presenter);
}

