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

public class HolderGameArchiveChisto extends BaseViewHolder<Integer> {
    Button itemBntGameArchiveChisto;

    public HolderGameArchiveChisto(ViewGroup parent, @LayoutRes int res) {
        super(parent, res);
        this.itemBntGameArchiveChisto =$(R.id.itemBntGameArchiveChisto);
    }

    public HolderGameArchiveChisto(View itemView) {
        super(itemView);
    }

    @Override
    public void setData(Integer data) {
        super.setData(data);
        itemBntGameArchiveChisto.setText(""+data);
    }
}
