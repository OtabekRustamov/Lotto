package com.root.lotto_app.app.news;

import android.support.v7.widget.LinearLayoutManager;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.root.lotto_app.R;
import com.root.lotto_app.app.main.MainActivity;
import com.root.lotto_app.app.news.module.NewsModel;
import com.root.lotto_app.app.news.module.holder.NewsHolder;
import com.root.lotto_app.app.news.presenters.NewsFragmentPresenterImpl;
import com.root.lotto_app.app.news.presenters.NewsFragmentPresenterView;
import com.root.lotto_app.core.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

/**
 * Created by root on 1/8/18.
 */

public class NewsFragment extends BaseFragment implements NewsFragmentPresenterView {
    @Inject
    NewsFragmentPresenterImpl presenterIml;

    @BindView(R.id.ervNewsFragment)
    EasyRecyclerView ervNewsFragment;

    private RecyclerArrayAdapter adapter;
    private List<NewsModel> modules;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_news;
    }

    @Override
    protected void init() {
        ervNewsFragment.setLayoutManager(new LinearLayoutManager(getContext()));
        ervNewsFragment.setAdapter(adapter = new RecyclerArrayAdapter(getContext()) {
            @Override
            public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
                return new NewsHolder(parent, R.layout.item_news);
            }
        });
//        presenterIml.fillImges();

        modules = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            NewsModel model = new NewsModel();
            model.setUrl("https://ichef.bbci.co.uk/news/660/media/images/82669000/jpg/_82669031_026978850-1.jpg");
            modules.add(model);
        }
        setImagess(modules);
    }

    @Override
    public void setImagess(List<NewsModel> modules) {
        this.modules = modules;
        adapter.addAll(modules);
    }
}
