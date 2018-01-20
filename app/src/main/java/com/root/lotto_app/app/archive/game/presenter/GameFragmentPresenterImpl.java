package com.root.lotto_app.app.archive.game.presenter;

import com.root.lotto_app.core.BasePresenterImpl;
import com.root.lotto_app.util.ApiManager;

import javax.inject.Inject;

/**
 * Created by root on 1/15/18.
 */

public class GameFragmentPresenterImpl extends BasePresenterImpl<GameFragmentPresenterView> implements GameArchiveFragmentPresenter {
    @Inject
    protected GameFragmentPresenterImpl(GameFragmentPresenterView gameFragmentPresenterView, ApiManager apiManager) {
        super(gameFragmentPresenterView, apiManager);
    }

    @Override
    public void fillArchive() {

    }
}
