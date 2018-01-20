package com.root.lotto_app.app.checktickets.id;

import android.support.v4.app.Fragment;

import com.root.lotto_app.app.checktickets.CheckTicketsFragemnt;
import com.root.lotto_app.app.checktickets.presenter.CheckTicketsFragemntPresenter;
import com.root.lotto_app.app.checktickets.presenter.CheckTicketsFragemntPresenterImpl;
import com.root.lotto_app.app.checktickets.presenter.CheckTicketsFragemntView;
import com.root.lotto_app.conf.scope.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Created by root on 12/26/17.
 */
@Module
public abstract class CheckTicketsModule {
    @Binds
    @PerFragment
    abstract Fragment provideChekcTicketsFragment(CheckTicketsFragemnt ticketsFragemnt);
    @Binds
    @PerFragment
    abstract CheckTicketsFragemntView provideCheckTicketsFragemntView(CheckTicketsFragemnt ticketsFragemnt);
    @Binds
    @PerFragment
    abstract CheckTicketsFragemntPresenter provideCheckTicketsFragemntPresenter(CheckTicketsFragemntPresenterImpl fragemntPresenter);
}
