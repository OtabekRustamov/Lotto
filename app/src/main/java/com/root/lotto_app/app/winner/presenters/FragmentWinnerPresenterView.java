package com.root.lotto_app.app.winner.presenters;

import com.root.lotto_app.core.BaseView;

import java.util.List;

/**
 * Created by root on 1/16/18.
 */

public interface FragmentWinnerPresenterView extends BaseView {
    void setInfor(List<String> infor);
}
