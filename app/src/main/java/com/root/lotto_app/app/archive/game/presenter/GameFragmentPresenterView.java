package com.root.lotto_app.app.archive.game.presenter;

import com.root.lotto_app.app.archive.game.model.GameArchiveModel;
import com.root.lotto_app.core.BaseView;

import java.util.List;

/**
 * Created by root on 1/15/18.
 */

public interface GameFragmentPresenterView extends BaseView {
    void setArchive(List<GameArchiveModel> archive);
}
