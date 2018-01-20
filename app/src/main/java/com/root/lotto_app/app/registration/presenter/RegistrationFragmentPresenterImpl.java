package com.root.lotto_app.app.registration.presenter;

import com.root.lotto_app.core.BasePresenterImpl;
import com.root.lotto_app.util.ApiManager;

import javax.inject.Inject;

/**
 * Created by root on 12/26/17.
 */

public class RegistrationFragmentPresenterImpl extends BasePresenterImpl<RegistrationFragmentView> implements RegistrationFragmentPresenter  {

    @Inject
    protected RegistrationFragmentPresenterImpl(RegistrationFragmentView registrationFragmentView, ApiManager apiManager) {
        super(registrationFragmentView, apiManager);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getMail() {
        return null;
    }

    @Override
    public String getPass() {
        return null;
    }

    @Override
    public String getPhoneNumber() {
        return null;
    }

    @Override
    public String getStrana() {
        return null;
    }

    @Override
    public void postInfo() {
        //todo
    }
}
