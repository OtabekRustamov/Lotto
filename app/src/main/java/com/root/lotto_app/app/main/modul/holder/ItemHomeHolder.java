package com.root.lotto_app.app.main.modul.holder;

import android.support.annotation.LayoutRes;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.root.lotto_app.R;
import com.root.lotto_app.app.main.modul.HomeModel;
import com.root.lotto_app.util.Constants;

/**
 * Created by root on 1/6/18.
 */

public class ItemHomeHolder extends BaseViewHolder<HomeModel> {
    ImageView imageView;
    TextView tvItemTimeHome;
    TextView itemTvDescription;
    TextView itemTvHomeName;
    Button itemBntHome;

    ImageView itemImvSuperPrice;
    Button itemBtnTime;
    TextView itemTvPrise;
    TextView itemTvAmount;


    public ItemHomeHolder(ViewGroup parent, @LayoutRes int res) {
        super(parent, res);
        this.imageView = $(R.id.ivItemHome);
        this.itemBntHome = $(R.id.itemBntHome);
        this.itemImvSuperPrice = $(R.id.itemImvSuperPrice);
        this.itemTvPrise =$(R.id.itemTvPrise);
        this.itemTvAmount =$(R.id.itemTvAmount);
        this.itemTvHomeName =$(R.id.itemTvHomeName);
        this.itemTvDescription =$(R.id.itemTvDescription);
        this.tvItemTimeHome =$(R.id.tvItemTimeHome);
        this.itemBtnTime =$(R.id.itemBtnTime);
    }

    @Override
    public void setData(HomeModel data) {
        super.setData(data);
        Glide.with(getContext()).load(Constants.BASE_URL + "" + data.getBanner_home()).into(imageView);
        Glide.with(getContext()).load(Constants.BASE_URL + "" + data.getBanner_home()).into(itemImvSuperPrice);

        itemBntHome.setText(data.getModule());
    }
}
