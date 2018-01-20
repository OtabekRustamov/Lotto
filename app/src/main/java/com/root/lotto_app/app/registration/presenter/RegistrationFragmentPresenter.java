package com.root.lotto_app.app.registration.presenter;

import com.root.lotto_app.core.BasePresenter;

/**
 * Created by root on 12/26/17.
 */

public interface RegistrationFragmentPresenter extends BasePresenter {
    // todo these are only for test
     boolean is18 = false;
    String getName();
    String getMail();
    String getPass();
    String getPhoneNumber();
    String getStrana();
   void postInfo();
}
