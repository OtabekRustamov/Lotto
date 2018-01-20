package com.root.lotto_app.app.play.presenter;

import com.root.lotto_app.core.BasePresenterImpl;
import com.root.lotto_app.util.ApiManager;

import javax.inject.Inject;

/**
 * Created by root on 1/15/18.
 */

public class PlayFragementPresenterImpl extends BasePresenterImpl<PlayFragementPresenterView> implements PlayFragementPresenter {

    @Inject
    protected PlayFragementPresenterImpl(PlayFragementPresenterView playFragementPresenterView, ApiManager apiManager) {
        super(playFragementPresenterView, apiManager);
    }

    @Override
    public void getInfoPlay() {

    }
}
