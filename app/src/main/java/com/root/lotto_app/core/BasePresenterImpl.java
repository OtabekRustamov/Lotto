package com.root.lotto_app.core;

import android.os.Bundle;

import com.root.lotto_app.util.ApiManager;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by root on 18/11/2017.
 */

public class BasePresenterImpl<T extends BaseView> implements BasePresenter {
    protected ApiManager apiManager;
    protected final T view;

    protected CompositeDisposable disposable = new CompositeDisposable();

    protected BasePresenterImpl(T t, ApiManager apiManager) {
        this.view = t;
        this.apiManager = apiManager;
    }

    @Override
    public void onStart() {}

    @Override
    public void onResume() {}

    @Override
    public void onPause() {}

    @Override
    public void onSaveInstanceState(Bundle bundle) {}

    @Override
    public void onRestoreSavedInstance(Bundle bundle) {}

    @Override
    public void onDestroy() {
        if (disposable != null)
            disposable.clear();
    }

    @Override
    public void onCreateView(Bundle bundle) {}

    @Override
    public void onStop() {}

    @Override
    public void onCreate(Bundle savedInstance) {}

    @Override
    public void onDetach() {
        if (disposable != null)
            disposable.clear();
    }
}