package com.root.lotto_app.app.omadlotto.model.holder;

import android.view.ViewGroup;
import android.widget.TextView;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.root.lotto_app.R;

/**
 * Created by root on 1/19/18.
 */

public class HolderWhereBuy extends BaseViewHolder<String> {
    TextView itemTvWhereBuy;

    public HolderWhereBuy(ViewGroup parent, int res) {
        super(parent, res);
        this.itemTvWhereBuy = $(R.id.itemTvWhereBuy);
    }

    @Override
    public void setData(String data) {
        super.setData(data);
        itemTvWhereBuy.setText(data);
    }
}
