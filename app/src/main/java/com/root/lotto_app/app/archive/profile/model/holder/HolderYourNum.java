package com.root.lotto_app.app.archive.profile.model.holder;

import android.view.ViewGroup;
import android.widget.Button;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.root.lotto_app.R;

/**
 * Created by root on 1/17/18.
 */

public class HolderYourNum extends BaseViewHolder<Integer> {
    Button btnItemHomeNum;

    public HolderYourNum(ViewGroup parent, int res) {
        super(parent, res);
        this.btnItemHomeNum = $(R.id.btnItemHomeNum);
    }

    @Override
    public void setData(Integer data) {
        super.setData(data);
        btnItemHomeNum.setText("" + data);
    }
}
