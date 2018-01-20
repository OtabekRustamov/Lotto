package com.root.lotto_app.app.message.model;

import android.support.annotation.LayoutRes;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.root.lotto_app.R;

/**
 * Created by root on 1/9/18.
 */

public class MessageHolder extends BaseViewHolder<NotificationModel> {
    ImageView itemIvMessage;
    ImageView itemIvSeeAll;
    TextView itemTvMessage;
    TextView itemTvSeeAll;
    LinearLayout llContainer;
    private boolean isClicked = false;

    public MessageHolder(ViewGroup parent, @LayoutRes int res) {
        super(parent, res);
        this.itemIvMessage = $(R.id.itemIvMessage);
        this.itemTvMessage = $(R.id.itemTvMessage);
        this.itemTvSeeAll = $(R.id.itemTvSeeAll);
        this.llContainer = $(R.id.llContainer);
        this.itemIvSeeAll = $(R.id.itemIvSeeAll);
    }

    @Override
    public void setData(NotificationModel data) {
        super.setData(data);
        Glide.with(getContext()).load(data.getUrl()).into(itemIvMessage);
        llContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isClicked = !isClicked;
                if (isClicked) {
                    itemTvMessage.setVisibility(View.VISIBLE);
                    itemTvSeeAll.setText("SeeLess");
                    itemIvSeeAll.setRotation(180);

                } else {
                    itemTvMessage.setVisibility(View.GONE);
                    itemTvSeeAll.setText("SeeMore");
                    itemIvSeeAll.setRotation(0);
                }
            }
        });
    }
}
