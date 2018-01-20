package com.root.lotto_app.app.auth.presenter;

import com.root.lotto_app.core.BasePresenterImpl;
import com.root.lotto_app.util.ApiManager;

/**
 * Created by root on 12/25/17.
 */

public class AuthPresenterImpl extends BasePresenterImpl<AuthPresenterView> implements AuthPresenter {

    protected AuthPresenterImpl(AuthPresenterView authView, ApiManager apiManager) {
        super(authView, apiManager);
    }

    @Override
    public void fillPhoneNumber() {
        //todo getNumbers();
    }

    @Override
    public void forgetPass() {

    }
}
