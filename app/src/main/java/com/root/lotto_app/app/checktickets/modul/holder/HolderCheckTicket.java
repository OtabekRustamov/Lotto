package com.root.lotto_app.app.checktickets.modul.holder;

import android.view.ViewGroup;
import android.widget.Button;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.root.lotto_app.R;

/**
 * Created by root on 1/18/18.
 */

public class HolderCheckTicket extends BaseViewHolder<String> {
    Button itemBtnCheckTicket;
    public HolderCheckTicket(ViewGroup parent, int res) {
        super(parent, res);
        this.itemBtnCheckTicket = $(R.id.itemBtnCheckTicket);
    }

    @Override
    public void setData(String data) {
        super.setData(data);
        itemBtnCheckTicket.setText(""+data);
        // 15 7 1
    }
}
