package com.root.lotto_app.app.ticket.presenter;

import com.root.lotto_app.app.news.module.NewsModel;
import com.root.lotto_app.core.BaseView;

import java.util.List;

/**
 * Created by root on 1/4/18.
 */

public interface TicketFragmentView extends BaseView {
    void setImagess(List<NewsModel> modules);
}
