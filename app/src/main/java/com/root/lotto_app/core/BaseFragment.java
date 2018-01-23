package com.root.lotto_app.core;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.root.lotto_app.util.custom_views.ProgressLoadingDialog;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import dagger.android.support.DaggerFragment;

/**
 * Created by root on 12/20/17.
 */

public abstract class BaseFragment extends DaggerFragment implements BaseView {
    protected ProgressLoadingDialog loadingDialog;
    private Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(getLayoutId(), container, false);
        unbinder = ButterKnife.bind(this, rootView);
        loadingDialog = new ProgressLoadingDialog(getContext());
        init();
        return rootView;
    }

    protected abstract @LayoutRes
    int getLayoutId();

    protected abstract void init();

    public void showLoading() {
        if (loadingDialog != null)
            loadingDialog.show();
    }

    public void hideLoading() {
        if (loadingDialog != null)
            loadingDialog.hide();
    }

    @Override
    public void makeToast(int message) {
        Toast.makeText(getContext(), getContext().getResources().getString(message), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void makeToast(String message) {
        Toast.makeText(getContext(), "" + message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        if (loadingDialog != null)
            loadingDialog.dismiss();
        unbinder.unbind();
        super.onDestroy();
    }
}
