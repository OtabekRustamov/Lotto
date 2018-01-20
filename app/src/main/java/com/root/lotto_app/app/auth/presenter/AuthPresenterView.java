package com.root.lotto_app.app.auth.presenter;

import com.root.lotto_app.app.auth.model.PhoneNumer;
import com.root.lotto_app.core.BaseView;

import java.util.List;

/**
 * Created by root on 12/25/17.
 */

public interface AuthPresenterView extends BaseView {
    void setPhoneNumber(List<PhoneNumer> phoneNumber);
    void openForgetPass();
    void openRegistr();
}
