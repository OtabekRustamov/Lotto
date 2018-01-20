package com.root.lotto_app.app.play;

import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.root.lotto_app.R;
import com.root.lotto_app.app.play.model.holder.HolderFragmentPlay;
import com.root.lotto_app.app.winner.model.WinnerAdapter;
import com.root.lotto_app.app.winner.presenters.FragmentWinnerPresenterView;
import com.root.lotto_app.core.BaseFragment;

import java.util.List;

import butterknife.BindView;

/**
 * Created by root on 1/15/18.
 */

public class PlayFragment extends BaseFragment implements FragmentWinnerPresenterView {

    @BindView(R.id.ervFragmentPlay)
    EasyRecyclerView ervFragmentPlay;
    RecyclerArrayAdapter adapter;

    static final String[] numbers = {
            "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "1", "2", "3", "4", "5", "6", "7", "8", "9"
    };

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_play;
    }

    @Override
    protected void init() {
        ervFragmentPlay.setLayoutManager(new StaggeredGridLayoutManager(9, StaggeredGridLayoutManager.VERTICAL));
        ervFragmentPlay.setAdapter(adapter = new RecyclerArrayAdapter(getContext()) {
            @Override
            public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
                return new HolderFragmentPlay(parent, R.layout.item_playfragment);
            }
        });
        adapter.addAll(numbers);
    }

    @Override
    public void setInfor(List<String> infor) {
    }
}
