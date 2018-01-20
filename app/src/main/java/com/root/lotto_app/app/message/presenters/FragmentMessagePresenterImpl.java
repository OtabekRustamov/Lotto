package com.root.lotto_app.app.message.presenters;

import com.root.lotto_app.app.message.model.NotificationModel;
import com.root.lotto_app.core.BasePresenterImpl;
import com.root.lotto_app.util.ApiManager;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by root on 1/9/18.
 */

public class FragmentMessagePresenterImpl extends BasePresenterImpl<FragmentMessagePresenterView> implements FragmentMessagePresenter {

    @Inject
    protected FragmentMessagePresenterImpl(FragmentMessagePresenterView fragmentMessagePresenterView, ApiManager apiManager) {
        super(fragmentMessagePresenterView, apiManager);
    }

    @Override
    public void fillImgesMessage() {
        view.showLoading();
        apiManager.getMessage()
                .subscribe(new Observer<List<NotificationModel>>() {
                    @Override
                    public void onSubscribe(Disposable d) {}

                    @Override
                    public void onNext(List<NotificationModel> messageModels) {
                        view.hideLoading();
                        view.setImagesMessage(messageModels);
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
