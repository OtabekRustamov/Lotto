package com.root.lotto_app.app.wherebuyfragment.presenter;

import com.root.lotto_app.core.BasePresenterImpl;
import com.root.lotto_app.util.ApiManager;

/**
 * Created by root on 1/5/18.
 */

public class WhereBuyPresenterImpl extends BasePresenterImpl<WherebuyFragmentView> implements WhereBuyFragmentPresenter {


    protected WhereBuyPresenterImpl(WherebuyFragmentView wherebuyFragmentView, ApiManager apiManager) {
        super(wherebuyFragmentView, apiManager);
    }

    @Override
    public void checkInfo() {

    }
}
