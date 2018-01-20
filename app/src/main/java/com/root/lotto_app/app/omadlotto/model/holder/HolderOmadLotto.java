package com.root.lotto_app.app.omadlotto.model.holder;

import android.support.v7.widget.LinearLayoutManager;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.root.lotto_app.R;

/**
 * Created by root on 1/19/18.
 */

public class HolderOmadLotto extends BaseViewHolder<Integer> {
    ImageView itemIvOmadLotto;
    TextView itemTvOmadLotto;
    TextView itemOne;
    TextView itemTwo;
    TextView itemThree;
    TextView itemFour;
    TextView itemFive;
    TextView itemTvSuperPrize;
    LinearLayout llSuperPrize;
    Button itemBntPress;

    public HolderOmadLotto(ViewGroup parent, int res) {
        super(parent, res);
        this.itemIvOmadLotto = $(R.id.itemIvOmadLotto);
        this.itemTvOmadLotto = $(R.id.itemTvOmadLotto);
        this.itemOne = $(R.id.itemOne);
        this.itemTwo = $(R.id.itemTwo);
        this.itemThree = $(R.id.itemThree);
        this.itemFour = $(R.id.itemFour);
        this.itemFive = $(R.id.itemFive);
        this.itemTvSuperPrize = $(R.id.itemTvSuperPrize);
        this.llSuperPrize = $(R.id.llSuperPrize);
        this.itemBntPress = $(R.id.itemBntPress);
    }

    @Override
    public void setData(Integer data) {
        super.setData(data);
        itemOne.setText("" + data);

    }

}
