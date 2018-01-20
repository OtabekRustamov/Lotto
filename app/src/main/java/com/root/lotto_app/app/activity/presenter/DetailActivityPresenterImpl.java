package com.root.lotto_app.app.activity.presenter;

import com.root.lotto_app.app.anketa.presenter.AnketaFragmentPresenter;
import com.root.lotto_app.app.anketa.presenter.AnketaFragmentPresenterView;
import com.root.lotto_app.core.BasePresenterImpl;
import com.root.lotto_app.util.ApiManager;

/**
 * Created by root on 1/4/18.
 */

public class DetailActivityPresenterImpl extends BasePresenterImpl<AnketaFragmentPresenterView> implements AnketaFragmentPresenter {
    private AnketaFragmentPresenterView view;
    private ApiManager apiManager;


    protected DetailActivityPresenterImpl(AnketaFragmentPresenterView anketaView, ApiManager apiManager) {
        super(anketaView, apiManager);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getData() {
        return null;
    }

    @Override
    public String getPhone() {
        return null;
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public String getPass() {
        return null;
    }
}
