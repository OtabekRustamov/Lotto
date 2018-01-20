package com.root.lotto_app.app.ticket;

import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.root.lotto_app.R;
import com.root.lotto_app.app.news.module.NewsModel;
import com.root.lotto_app.app.ticket.modul.TicketHolder;
import com.root.lotto_app.app.ticket.presenter.TicketFragmentView;
import com.root.lotto_app.core.BaseFragment;

import java.util.List;

import butterknife.BindView;

/**
 * Created by root on 1/4/18.
 */

public class TicketFragment extends BaseFragment implements TicketFragmentView {

    @BindView(R.id.llInfo)
    LinearLayout llInfo;
    @BindView(R.id.tvDay)
    TextView tvDay;
    @BindView(R.id.tvData)
    TextView tvData;
    @BindView(R.id.tvNumber)
    TextView tvNumber;
    @BindView(R.id.bntContainer)
    Button bntContainer;
    @BindView(R.id.tvAmount)
    TextView tvAmount;


    @BindView(R.id.ervTicket)
    EasyRecyclerView ervTicket;
    RecyclerArrayAdapter adapter;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_ticket;
    }

    @Override
    protected void init() {
        ervTicket.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL));
        ervTicket.setAdapter(adapter = new RecyclerArrayAdapter(getContext()) {
            @Override
            public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
                return new TicketHolder(parent, R.layout.item_ticket);
            }
        });
        adapter.addAll(new Integer[]{23, 34, 34, 9, 9, 24, 23, 34, 34, 1, 9, 24});
    }

    @Override
    public void setImagess(List<NewsModel> modules) {

    }
}
