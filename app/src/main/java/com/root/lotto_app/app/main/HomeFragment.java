package com.root.lotto_app.app.main;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;
import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.root.lotto_app.R;
import com.root.lotto_app.app.main.modul.HomeModel;
import com.root.lotto_app.app.main.modul.holder.ItemHomeHolder;
import com.root.lotto_app.app.main.presenters.HomeFragmentPresenterIml;
import com.root.lotto_app.app.main.presenters.HomeFragmentPresenterView;
import com.root.lotto_app.app.omadlotto.FragmentOmadLotto;
import com.root.lotto_app.core.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

/**
 * Created by root on 12/20/17.
 */

public class HomeFragment extends BaseFragment implements HomeFragmentPresenterView {
    @Inject
    HomeFragmentPresenterIml presenterIml;
    @Inject
    MainActivity mainActivity;
    @BindView(R.id.ervHomeFragment)
    EasyRecyclerView ervHomeFragment;
    private RecyclerArrayAdapter adapter;
    private List<HomeModel> homes;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_home;
    }

    @Override
    protected void init() {
        ervHomeFragment.setLayoutManager(new LinearLayoutManager(getContext()));
        ervHomeFragment.setAdapter(adapter = new RecyclerArrayAdapter(getContext()) {
            @Override
            public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
                return new ItemHomeHolder(parent, viewType == 0 ? R.layout.item_home : R.layout.item_home2);
            }

            @Override
            public int getViewType(int position) {
                // 0 or 1
//                if ()
                return ((HomeModel) getItem(position)).getSuper_prize() == null ? 0 : 1;
            }
        });
        adapter.setOnItemClickListener(new RecyclerArrayAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                if (position == 0) {
                    mainActivity.replaceFragment(new FragmentOmadLotto());
                }
            }
        });
        presenterIml.fillImges();
    }

    @Override
    public void setImagess(List<HomeModel> images) {
        this.homes = images;
        adapter.addAll(images);
    }
}
