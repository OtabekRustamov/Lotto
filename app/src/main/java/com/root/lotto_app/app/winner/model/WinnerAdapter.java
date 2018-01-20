package com.root.lotto_app.app.winner.model;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.root.lotto_app.R;

/**
 * Created by root on 1/12/18.
 */


public class WinnerAdapter extends BaseAdapter {
    private Activity mContext;
    private String[] gridViewString;

    public WinnerAdapter(Activity mContext, String[] gridViewString) {
        this.mContext = mContext;
        this.gridViewString = gridViewString;
    }

    @Override
    public int getCount() {
        return gridViewString.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View gridViewAndroid;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridViewAndroid = inflater.inflate(R.layout.item_winner, viewGroup, false);
        } else {
            gridViewAndroid = view;
        }
        return gridViewAndroid;
    }
}

