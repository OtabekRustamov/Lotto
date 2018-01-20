package com.root.lotto_app.app.media.full.presenters;

import com.root.lotto_app.app.media.full.models.MediaModel;
import com.root.lotto_app.core.BasePresenterImpl;
import com.root.lotto_app.util.ApiManager;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by root on 1/8/18.
 */

public class MediaFragmentPresenterImpl extends BasePresenterImpl<MediaFragmentPresenterView> implements MediaFragmentPresenter {

    @Inject
    protected MediaFragmentPresenterImpl(MediaFragmentPresenterView mediaFragmentView, ApiManager apiManager) {
        super(mediaFragmentView, apiManager);
    }

    @Override
    public void getImagesData() {
        view.showLoading();
        apiManager.getMedia()
                .subscribe(new Observer<List<MediaModel>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onNext(List<MediaModel> mediaModels) {
                        view.hideLoading();
                        view.setImageData(mediaModels);
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
