package com.root.lotto_app.app.archive.profile.presenter;

import com.root.lotto_app.core.BasePresenterImpl;
import com.root.lotto_app.util.ApiManager;

import javax.inject.Inject;

/**
 * Created by root on 1/4/18.
 */

public class ArchiveFragmentPresenterImpl extends BasePresenterImpl<ArchiveFragmentPresenterView> implements ArchiveFragmentPresenter {

    @Inject
    protected ArchiveFragmentPresenterImpl(ArchiveFragmentPresenterView archiveFragmentPresenterView, ApiManager apiManager) {
        super(archiveFragmentPresenterView, apiManager);
    }

    @Override
    public void checkInfo() {

    }
}
