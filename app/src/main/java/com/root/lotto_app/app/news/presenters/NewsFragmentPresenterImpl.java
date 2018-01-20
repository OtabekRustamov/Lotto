package com.root.lotto_app.app.news.presenters;

import com.root.lotto_app.app.news.module.NewsModel;
import com.root.lotto_app.core.BasePresenterImpl;
import com.root.lotto_app.util.ApiManager;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by root on 1/8/18.
 */

public class NewsFragmentPresenterImpl extends BasePresenterImpl<NewsFragmentPresenterView> implements NewsFragmentPresenter {

    @Inject
    protected NewsFragmentPresenterImpl(NewsFragmentPresenterView newsFragmentPresenterView, ApiManager apiManager) {
        super(newsFragmentPresenterView, apiManager);
    }

    @Override
    public void fillImges() {
        view.showLoading();
           apiManager.getNews()
                .subscribe(new Observer<List<NewsModel>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onNext(List<NewsModel> newsModules) {
                        view.hideLoading();
                        view.setImagess(newsModules);
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
