package com.root.lotto_app.app.archive.profile;

import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.root.lotto_app.R;
import com.root.lotto_app.app.archive.profile.model.holder.HolderPredic;
import com.root.lotto_app.app.archive.profile.model.holder.HolderYourNum;
import com.root.lotto_app.app.archive.profile.presenter.ArchiveFragmentPresenterImpl;
import com.root.lotto_app.app.archive.profile.presenter.ArchiveFragmentPresenterView;
import com.root.lotto_app.core.BaseFragment;

import javax.inject.Inject;

import butterknife.BindView;

/**
 * Created by root on 1/4/18.
 */

public class ArchiveFragment extends BaseFragment implements ArchiveFragmentPresenterView {
    @BindView(R.id.rvPrediction)
    EasyRecyclerView rvPrediction;
    @BindView(R.id.rvYourNumber)
    EasyRecyclerView rvYourNumber;
    RecyclerArrayAdapter adapter;
    RecyclerArrayAdapter adapter1;


    @Inject
    ArchiveFragmentPresenterImpl archiveFragmentPresenter;


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_archive;
    }

    @Override
    protected void init() {

        //todo these are only for test until real API

        rvPrediction.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL));
        rvPrediction.setAdapter(adapter = new RecyclerArrayAdapter(getContext()) {
            @Override
            public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
                return new HolderPredic(parent, R.layout.item_archive_prediction);
            }
        });
        rvYourNumber.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL));
        rvYourNumber.setAdapter(adapter1 = new RecyclerArrayAdapter(getContext()) {
            @Override
            public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
                return new HolderYourNum(parent, R.layout.item_archive_yournumber);
            }
        });

        adapter.addAll(new Integer[]{1, 2, 3, 4, 5, 6});
        adapter1.addAll(new Integer[]{1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6});

    }

    @Override
    public void checkInfo() {

    }
}
