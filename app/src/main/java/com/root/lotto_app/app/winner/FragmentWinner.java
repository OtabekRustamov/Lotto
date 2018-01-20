package com.root.lotto_app.app.winner;

import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.ViewGroup;
import android.widget.GridView;

import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.root.lotto_app.R;
import com.root.lotto_app.app.winner.model.WinnerAdapter;
import com.root.lotto_app.app.winner.presenters.FragmentWinnerPresenterView;
import com.root.lotto_app.core.BaseFragment;

import java.util.List;

import butterknife.BindView;

/**
 * Created by root on 1/12/18.
 */
public class FragmentWinner extends BaseFragment {

    @BindView(R.id.grvWinnerFragment)
    GridView grvWinnerFragment;
    private WinnerAdapter adapter;
    static final String[] osNameListENG = {
            "Davron Abdullayev",
            "Shelly Bishop",
            "Davron Abdullayev",
            "Shelly Bishop",
    };

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_winner;
    }

    @Override
    protected void init() {
        adapter = new WinnerAdapter(getActivity(), osNameListENG);
        grvWinnerFragment.setAdapter(adapter);
    }

}
