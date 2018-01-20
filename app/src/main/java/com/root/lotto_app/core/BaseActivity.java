package com.root.lotto_app.core;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;

import com.root.lotto_app.util.custom_views.ProgressLoadingDialog;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import dagger.android.support.DaggerAppCompatActivity;

/**
 * Created by root on 12/20/17.
 */

public abstract class BaseActivity extends DaggerAppCompatActivity  {
    protected ProgressLoadingDialog loadingDialog;
    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        unbinder = ButterKnife.bind(this);
        loadingDialog = new ProgressLoadingDialog(this);
        init();
        if (openMainFragment() != null && getContainerId() != 0) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(getContainerId(), openMainFragment())
                    .commit();
        }
    }

    protected abstract @LayoutRes int getLayoutId();
    protected abstract void init();

    protected abstract Fragment openMainFragment();
    protected abstract @IdRes int getContainerId();

    protected void setToolbarTitle(@StringRes int titleId) {
        if (getSupportActionBar() != null)
            getSupportActionBar().setTitle(titleId);
    }

    protected void setToolbarTitle(String title) {
        if (getSupportActionBar() != null)
            getSupportActionBar().setTitle(title);
    }

    protected void showLoading() {
        if (loadingDialog != null)
            loadingDialog.show();
    }

    protected void hideLoading() {
        if (loadingDialog != null)
            loadingDialog.hide();
    }

    @Override
    protected void onDestroy() {
        if (loadingDialog != null)
            loadingDialog.dismiss();
        unbinder.unbind();
        super.onDestroy();
    }
}
