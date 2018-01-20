package com.root.lotto_app.app.omadlotto.model.holder;

import android.view.ViewGroup;
import android.widget.TextView;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.root.lotto_app.R;

import butterknife.BindView;

/**
 * Created by root on 1/19/18.
 */

public class HolderWinnerList extends BaseViewHolder<Integer> {
    TextView itemWinnerAmount;

    public HolderWinnerList(ViewGroup parent, int res) {
        super(parent, res);
        this.itemWinnerAmount = $(R.id.itemWinnerAmount);
    }

    @Override
    public void setData(Integer data) {
        super.setData(data);
        itemWinnerAmount.setText(""+data);
    }
}
