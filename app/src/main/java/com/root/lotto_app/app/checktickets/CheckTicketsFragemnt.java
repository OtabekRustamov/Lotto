package com.root.lotto_app.app.checktickets;

import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.root.lotto_app.R;
import com.root.lotto_app.app.checktickets.modul.holder.HolderCheckTicket;
import com.root.lotto_app.app.checktickets.presenter.CheckTicketsFragemntView;
import com.root.lotto_app.core.BaseFragment;

import butterknife.BindView;
import dagger.Module;

/**
 * Created by root on 12/16/17.
 */
@Module
public class CheckTicketsFragemnt extends BaseFragment implements CheckTicketsFragemntView {
    @BindView(R.id.tvTerajNumber)
    TextView tvTerajNumber;
    @BindView(R.id.btnByNumber)
    Button btnByNumber;
    @BindView(R.id.btnByComb)
    Button btnByComb;
    @BindView(R.id.etTicketNumber)
    EditText etTicketNumber;
    @BindView(R.id.etTirajNumber)
    EditText etTirajNumber;
    @BindView(R.id.btnCheck)
    Button btnCheck;
    @BindView(R.id.bntCode)
    Button bntCode;
    @BindView(R.id.etCode)
    EditText etCode;
    @BindView(R.id.ervCheckTicket)
    EasyRecyclerView ervCheckTicket;
    RecyclerArrayAdapter adapter;

    // todo below blue view

    static final String[] numbers = {
            "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "1", "2", "3", "4", "5", "6", "7", "8", "9"
    };

    @Override
    protected int getLayoutId() {
        return R.layout.fragmnet_check_ticket;
    }

    @Override
    protected void init() {
        ervCheckTicket.setLayoutManager(new StaggeredGridLayoutManager(9, StaggeredGridLayoutManager.VERTICAL));
        ervCheckTicket.setAdapter(adapter = new RecyclerArrayAdapter(getContext()) {
            @Override
            public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
                return new HolderCheckTicket(parent, R.layout.item_check_ticket);
            }
        });
        adapter.addAll(numbers);
    }

    // 29 5 4
    @Override
    public void checkLotto() {

    }
}
