package com.root.lotto_app.app.oltinbaliq.presenters;

import com.root.lotto_app.core.BasePresenterImpl;
import com.root.lotto_app.util.ApiManager;

import javax.inject.Inject;

/**
 * Created by root on 1/9/18.
 */

public class FragmentOltinBaliqPresenterImpl extends BasePresenterImpl<FragmentOltinBaliqPresenterView> implements FragmentOltinBaliqPresenter {

    @Inject
    protected FragmentOltinBaliqPresenterImpl(FragmentOltinBaliqPresenterView fragmentOltinBaliqPresenterView, ApiManager apiManager) {
        super(fragmentOltinBaliqPresenterView, apiManager);
    }
}

