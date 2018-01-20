package com.root.lotto_app.app.archive.profile.model.holder;

import android.view.ViewGroup;
import android.widget.Button;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.root.lotto_app.R;

/**
 * Created by root on 1/17/18.
 */

public class HolderPredic extends BaseViewHolder<Integer> {
    Button btnItemHomePred;

    public HolderPredic(ViewGroup parent, int res) {
        super(parent, res);
        this.btnItemHomePred = $(R.id.btnItemHomePred);
    }

    @Override
    public void setData(Integer data) {
        super.setData(data);
        btnItemHomePred.setText(""+data);
    }
}
