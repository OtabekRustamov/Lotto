package com.root.lotto_app.app.media.full;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.view.ViewGroup;
import android.widget.Toast;

import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.root.lotto_app.R;
import com.root.lotto_app.app.media.full.models.holder.MediaHolder;
import com.root.lotto_app.app.media.full.models.MediaModel;
import com.root.lotto_app.app.media.full.presenters.MediaFragmentPresenterImpl;
import com.root.lotto_app.app.media.full.presenters.MediaFragmentPresenterView;
import com.root.lotto_app.app.media.item.ItemMediaActivity;
import com.root.lotto_app.core.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

/**
 * Created by root on 1/8/18.
 */

public class MediaFragment extends BaseFragment implements MediaFragmentPresenterView {
    @Inject
    MediaFragmentPresenterImpl presenterImpl;

    @BindView(R.id.ervMediaFragment)
    EasyRecyclerView ervMedia;

    private RecyclerArrayAdapter adapter;
    private List<MediaModel> models;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_media;
    }

    @Override
    protected void init() {
        ervMedia.setLayoutManager(new LinearLayoutManager(getContext()));
        ervMedia.setAdapter(adapter = new RecyclerArrayAdapter(getContext()) {
            @Override
            public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
                return new MediaHolder(parent, R.layout.item_media);
            }
        });
        //presenterImpl.getImagesData();
        models = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            MediaModel model = new MediaModel();
            model.setUrl("https://img1.etsystatic.com/033/0/9827456/il_340x270.635972217_7vq5.jpg");
            models.add(model);
        }
        setImageData(models);
        adapter.setOnItemClickListener(new RecyclerArrayAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(getContext(), "" + position, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), ItemMediaActivity.class);
                startActivity(intent);

            }
        });
    }

    @Override
    public void setImageData(List<MediaModel> images) {
        this.models = images;
        adapter.addAll(images);
    }
}
