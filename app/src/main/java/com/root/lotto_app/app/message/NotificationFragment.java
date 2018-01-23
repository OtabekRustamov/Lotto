package com.root.lotto_app.app.message;

import android.support.v7.widget.LinearLayoutManager;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.root.lotto_app.R;
import com.root.lotto_app.app.message.model.MessageHolder;
import com.root.lotto_app.app.message.model.NotificationModel;
import com.root.lotto_app.app.message.presenters.FragmentMessagePresenterImpl;
import com.root.lotto_app.app.message.presenters.FragmentMessagePresenterView;
import com.root.lotto_app.core.BaseFragment;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

/**
 * Created by root on 1/9/18.
 */

public class NotificationFragment extends BaseFragment implements FragmentMessagePresenterView {
    @Inject
    FragmentMessagePresenterImpl presenter;

    @BindView(R.id.ervNotificationFragment)
    EasyRecyclerView ervNotificationFragment;

    private RecyclerArrayAdapter adapter;
    private List<NotificationModel> notificationModels;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_message;
    }

    @Override
    protected void init() {
        ervNotificationFragment.setLayoutManager(new LinearLayoutManager(getContext()));
        ervNotificationFragment.setAdapter(adapter = new RecyclerArrayAdapter(getContext()) {
            @Override
            public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
                return new MessageHolder(parent, R.layout.item_notification);
            }
        });
        presenter.fillImgesMessage();
        adapter.setOnItemClickListener(new RecyclerArrayAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                makeToast("click " + position);
            }
        });
    }

    @Override
    public void setImagesMessage(List<NotificationModel> modules) {
        this.notificationModels = modules;
        adapter.addAll(modules);
    }
}
