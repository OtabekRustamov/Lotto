package com.root.lotto_app.app.archive.game.model.holders;

import android.support.annotation.LayoutRes;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.root.lotto_app.R;
import com.root.lotto_app.app.archive.game.model.GameArchiveModel;

/**
 * Created by root on 1/16/18.
 */

public class HolderGameArchiveRedko extends BaseViewHolder<Integer> {
    Button itemBntGameArchiveVechno;

    public HolderGameArchiveRedko(ViewGroup parent, @LayoutRes int res) {
        super(parent, res);
        this.itemBntGameArchiveVechno = $(R.id.itemBntGameArchiveRedko);
    }

    public HolderGameArchiveRedko(View itemView) {
        super(itemView);
    }

    @Override
    public void setData(Integer data) {
        super.setData(data);
        itemBntGameArchiveVechno.setText("" + data);
    }
}
