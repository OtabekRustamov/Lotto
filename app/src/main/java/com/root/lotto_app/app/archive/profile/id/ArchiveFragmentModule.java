package com.root.lotto_app.app.archive.profile.id;


import android.support.v4.app.Fragment;

import com.root.lotto_app.app.archive.profile.ArchiveFragment;
import com.root.lotto_app.app.archive.profile.presenter.ArchiveFragmentPresenter;
import com.root.lotto_app.app.archive.profile.presenter.ArchiveFragmentPresenterView;
import com.root.lotto_app.app.archive.profile.presenter.ArchiveFragmentPresenterImpl;
import com.root.lotto_app.conf.scope.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Created by root on 1/4/18.
 */
@Module
public abstract class ArchiveFragmentModule {
    @Binds
    @PerFragment
    abstract Fragment providerArchiveFragment(ArchiveFragment archiveFragment);

    @Binds
    @PerFragment
    abstract ArchiveFragmentPresenterView provideArchiveFragmentView(ArchiveFragment archiveFragment);

    @Binds
    @PerFragment
    abstract ArchiveFragmentPresenter provideArchiveFragmentPresenter(ArchiveFragmentPresenterImpl archivePresenter);

}
