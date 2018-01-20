package com.root.lotto_app.app.play.model.holder;

import android.view.ViewGroup;
import android.widget.Button;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.root.lotto_app.R;

/**
 * Created by root on 1/15/18.
 */

public class HolderFragmentPlay extends BaseViewHolder<String> {
    Button itemTvPlayFragment;

    public HolderFragmentPlay(ViewGroup parent, int res) {
        super(parent, res);
        this.itemTvPlayFragment = $(R.id.itemBtnPlayFragment);
//        TypedValue outValue = new TypedValue();
//        getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground,
//                outValue, true);
//        itemTvPlayFragment.setBackgroundResource(o);
    }

    @Override
    public void setData(String data) {
        super.setData(data);
        itemTvPlayFragment.setText("" + data);
    }
}
