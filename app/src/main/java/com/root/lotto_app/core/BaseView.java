package com.root.lotto_app.core;

import android.support.annotation.IdRes;
import android.support.annotation.StringRes;

/**
 * Created by root on 18/11/2017.
 */

public interface BaseView {
    void showLoading();
    void hideLoading();
    void makeToast(@StringRes int message);
    void makeToast(String message);
}
