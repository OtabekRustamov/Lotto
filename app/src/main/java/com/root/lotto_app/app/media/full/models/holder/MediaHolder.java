package com.root.lotto_app.app.media.full.models.holder;

import android.support.annotation.LayoutRes;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.root.lotto_app.R;
import com.root.lotto_app.app.media.full.models.MediaModel;

/**
 * Created by root on 1/8/18.
 */

public class MediaHolder extends BaseViewHolder<MediaModel> {
    ImageView itemIvMedia;
    TextView itemtvTiraj;
    TextView itemtvHour;
    TextView itemtvSize;

    public MediaHolder(ViewGroup parent, @LayoutRes int res) {
        super(parent, res);
        this.itemIvMedia = $(R.id.itemIvMedia);
        this.itemtvTiraj = $(R.id.itemtvTiraj);
        this.itemtvHour = $(R.id.itemtvHour);
        this.itemtvSize = $(R.id.itemtvSize);
    }

    @Override
    public void setData(MediaModel data) {
        super.setData(data);
        Glide.with(getContext()).load(data.getUrl()).into(itemIvMedia);
        itemtvTiraj.setText(data.getTitle());
        itemtvHour.setText("" + data.getId());
        itemtvSize.setText("" + data.getAlbumId());
    }
}
