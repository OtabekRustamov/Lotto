package com.root.lotto_app.app.message.presenters;

import com.root.lotto_app.app.message.model.NotificationModel;
import com.root.lotto_app.core.BaseView;

import java.util.List;

/**
 * Created by root on 1/9/18.
 */

public interface FragmentMessagePresenterView extends BaseView{
    void setImagesMessage(List<NotificationModel> modules);
}
