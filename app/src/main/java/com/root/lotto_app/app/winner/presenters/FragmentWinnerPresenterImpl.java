package com.root.lotto_app.app.winner.presenters;

import com.root.lotto_app.app.message.presenters.FragmentMessagePresenter;
import com.root.lotto_app.core.BasePresenterImpl;
import com.root.lotto_app.util.ApiManager;

import javax.inject.Inject;

/**
 * Created by root on 1/16/18.
 */

public class FragmentWinnerPresenterImpl extends BasePresenterImpl<FragmentWinnerPresenterView> implements FragmentMessagePresenter {

    @Inject
    protected FragmentWinnerPresenterImpl(FragmentWinnerPresenterView fragmentWinnerPresenterView, ApiManager apiManager) {
        super(fragmentWinnerPresenterView, apiManager);
    }

    @Override
    public void fillImgesMessage() {

    }
}
