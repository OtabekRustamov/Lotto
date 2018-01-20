package com.root.lotto_app.app.media.item.id;

import android.app.Activity;

import com.root.lotto_app.app.media.item.ItemMediaActivity;
import com.root.lotto_app.conf.scope.PerActivity;

import dagger.Binds;
import dagger.Module;

/**
 * Created by root on 1/17/18.
 */
@Module
public abstract class ItemMediaActivityModule {
    @Binds
    @PerActivity
    abstract Activity provideItemMediaActivity(ItemMediaActivity activity);
}
