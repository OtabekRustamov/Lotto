package com.root.lotto_app.app.media.full.id;

import android.support.v4.app.Fragment;

import com.root.lotto_app.app.media.full.MediaFragment;
import com.root.lotto_app.app.media.full.presenters.MediaFragmentPresenterImpl;
import com.root.lotto_app.app.media.full.presenters.MediaFragmentPresenter;
import com.root.lotto_app.app.media.full.presenters.MediaFragmentPresenterView;
import com.root.lotto_app.conf.scope.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Created by root on 1/8/18.
 */
@Module
public abstract class MediaFragmentModule {
    @Binds
    @PerFragment
    abstract Fragment provideMediaFragment(MediaFragment fragment);

    @Binds
    @PerFragment
    abstract MediaFragmentPresenterView privideMediaFragmentView(MediaFragment fragment);

    @Binds
    @PerFragment
    abstract MediaFragmentPresenter provideMediaFragmentPresenter(MediaFragmentPresenterImpl presenter);
}
