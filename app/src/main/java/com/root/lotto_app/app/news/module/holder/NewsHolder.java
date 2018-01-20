package com.root.lotto_app.app.news.module.holder;

import android.support.annotation.LayoutRes;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.root.lotto_app.R;
import com.root.lotto_app.app.news.module.NewsModel;

/**
 * Created by root on 1/8/18.
 */

public class NewsHolder extends BaseViewHolder<NewsModel> {
    ImageView itemImvNews;
    TextView itemTvITime;
    //    Button itemBntNews;
    TextView itemTvNews;
    TextView itemTvNewsPrice;

    public NewsHolder(ViewGroup parent, @LayoutRes int res) {
        super(parent, res);
        this.itemImvNews = $(R.id.itemImvNews);
        this.itemTvNews = $(R.id.itemTvNews);
        this.itemTvNewsPrice = $(R.id.itemTvNewsPrice);
    }

    @Override
    public void setData(NewsModel data) {
        super.setData(data);
        Glide.with(getContext()).load(data.getUrl()).into(itemImvNews);
        itemTvNews.setText(data.getTitle());
        itemTvNewsPrice.setText(data.getTitle());
    }
}
