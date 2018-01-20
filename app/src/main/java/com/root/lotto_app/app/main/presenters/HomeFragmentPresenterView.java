package com.root.lotto_app.app.main.presenters;

import com.root.lotto_app.app.main.modul.HomeModel;
import com.root.lotto_app.core.BaseView;

import java.util.List;

/**
 * Created by root on 12/21/17.
 */

public interface HomeFragmentPresenterView extends BaseView {
    void setImagess(List<HomeModel> images);
}
