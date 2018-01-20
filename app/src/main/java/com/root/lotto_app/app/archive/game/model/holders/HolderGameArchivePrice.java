package com.root.lotto_app.app.archive.game.model.holders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.root.lotto_app.R;
import com.root.lotto_app.app.archive.game.model.GameArchiveModel;

import javax.inject.Inject;

/**
 * Created by root on 1/15/18.
 */

public class HolderGameArchivePrice extends BaseViewHolder<Integer> {
    TextView itemTvDataGameArchive;
    TextView itemTvGameArchive;
    TextView itemTvAmountGameArchive;
    Button itemBntGameArchive;

    public HolderGameArchivePrice(View itemView) {
        super(itemView);
    }

    public HolderGameArchivePrice(ViewGroup parent, int res) {
        super(parent, res);
        this.itemBntGameArchive = $(R.id.itemBntGameArchive);
        this.itemTvAmountGameArchive = $(R.id.itemTvAmountGameArchive);
        this.itemTvGameArchive = $(R.id.itemTvGameArchive);
        this.itemTvDataGameArchive = $(R.id.itemTvDataGameArchive);
    }

    @Override
    public void setData(Integer data) {
        super.setData(data);
        itemTvGameArchive.setText(""+data);
    }
}
