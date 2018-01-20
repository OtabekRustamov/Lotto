package com.root.lotto_app.app.main.presenters;

import com.root.lotto_app.app.main.modul.HomeModel;
import com.root.lotto_app.core.BasePresenterImpl;
import com.root.lotto_app.util.ApiManager;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by root on 12/20/17.
 */

public class HomeFragmentPresenterIml extends BasePresenterImpl<HomeFragmentPresenterView> implements HomeFragmentPresenter {

    @Inject
    protected HomeFragmentPresenterIml(HomeFragmentPresenterView baseView, ApiManager apiManager) {
        super(baseView, apiManager);
    }

    @Override
    public void fillImges() {
        view.showLoading();
        apiManager.getHome()
                .subscribe(new Observer<List<HomeModel>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onNext(List<HomeModel> homes) {
                        view.hideLoading();
                        view.setImagess(homes);
                    }

                    @Override
                    public void onError(Throwable e) {
                        view.hideLoading();
                    }

                    @Override
                    public void onComplete() {
                        view.hideLoading();
                    }
                });
    }
}
