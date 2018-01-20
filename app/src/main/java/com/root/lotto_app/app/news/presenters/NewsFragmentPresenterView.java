package com.root.lotto_app.app.news.presenters;

import com.root.lotto_app.app.news.module.NewsModel;
import com.root.lotto_app.core.BaseView;

import java.util.List;

/**
 * Created by root on 1/8/18.
 */

public interface NewsFragmentPresenterView extends BaseView {
    void setImagess(List<NewsModel> modules);
}
