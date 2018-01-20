package com.root.lotto_app.app.media.full.presenters;

import com.root.lotto_app.app.media.full.models.MediaModel;
import com.root.lotto_app.core.BaseView;

import java.util.List;

/**
 * Created by root on 1/8/18.
 */

public interface MediaFragmentPresenterView extends BaseView {
    void setImageData(List<MediaModel> images);
}
