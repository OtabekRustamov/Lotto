package com.root.lotto_app.app.main.modul.holder;

import android.support.annotation.LayoutRes;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.root.lotto_app.R;
import com.root.lotto_app.app.main.modul.HomeModel;

/**
 * Created by root on 1/6/18.
 */

public class ItemHomeHolder extends BaseViewHolder<HomeModel> {
    ImageView imageView;

    public ItemHomeHolder(ViewGroup parent, @LayoutRes int res) {
        super(parent, res);
        this.imageView = $(R.id.ivItemHome);
    }

    TextView textView;

    @Override
    public void setData(HomeModel data) {
        super.setData(data);
        Glide.with(getContext()).load(data.getUrl()).into(imageView);

    }

    public ItemHomeHolder(View itemView) {
        super(itemView);
    }
}
