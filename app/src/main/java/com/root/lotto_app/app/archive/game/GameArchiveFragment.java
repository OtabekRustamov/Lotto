package com.root.lotto_app.app.archive.game;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;

import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.root.lotto_app.R;
import com.root.lotto_app.app.archive.game.model.holders.HolderGameArchiveChisto;
import com.root.lotto_app.app.archive.game.model.holders.HolderGameArchivePrice;
import com.root.lotto_app.app.archive.game.model.GameArchiveModel;
import com.root.lotto_app.app.archive.game.model.holders.HolderGameArchiveRedko;
import com.root.lotto_app.app.archive.game.presenter.GameFragmentPresenterView;
import com.root.lotto_app.core.BaseFragment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.zip.DataFormatException;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by root on 1/15/18.
 */

public class GameArchiveFragment extends BaseFragment implements GameFragmentPresenterView, DatePickerDialog.OnDateSetListener {

    @BindView(R.id.ervGameArchive)
    EasyRecyclerView ervGameArchive;
    @BindView(R.id.ervredkoVipomemashy)
    EasyRecyclerView ervredkoVipomemashy;
    @BindView(R.id.ervChistoVipomemashy)
    EasyRecyclerView ervChistoVipomemashy;
    RecyclerArrayAdapter adapter1;
    RecyclerArrayAdapter adapter2;
    RecyclerArrayAdapter adapter3;
    @BindView(R.id.btnStartingTime)
    Button btnStartingTime;
    @BindView(R.id.btnEndingTime)
    Button btnEndingTime;
    private DataFormatException dialog;
    private Calendar calendar;
    private DateFormat dateFormat;
    private SimpleDateFormat timeFormat;
    private DatePickerDialog dpd;
    private List<GameArchiveModel> modelList;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_gamearchive;
    }

    @Override
    protected void init() {
        calendar = Calendar.getInstance();
        dateFormat = DateFormat.getDateInstance(DateFormat.LONG, Locale.getDefault());
        // timeFormat = new SimpleDateFormat(TIME_Pa)

        ervGameArchive.setLayoutManager(new LinearLayoutManager(getContext()));
        ervGameArchive.setAdapter(adapter1 = new RecyclerArrayAdapter(getContext()) {
            @Override
            public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
                return new HolderGameArchivePrice(parent, R.layout.item_game_archive);
            }
        });
        ervredkoVipomemashy.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL));
        ervredkoVipomemashy.setAdapter(adapter2 = new RecyclerArrayAdapter(getContext()) {
            @Override
            public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
                return new HolderGameArchiveRedko(parent, R.layout.item_gamearchive_vechino);
            }
        });
        ervChistoVipomemashy.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL));
        ervChistoVipomemashy.setAdapter(adapter3 = new RecyclerArrayAdapter(getContext()) {
            @Override
            public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
                return new HolderGameArchiveChisto(parent, R.layout.item_gamearchive_chisto);
            }
        });
        adapter1.addAll(new Integer[]{6865, 6865, 6865, 6865, 6865});
        adapter3.addAll(new Integer[]{23, 34, 34, 9, 9, 2});
        adapter2.addAll(new Integer[]{23, 34, 34, 9, 9, 24, 23, 34, 34, 1, 9, 24});
    }

    @OnClick({R.id.btnStartingTime, R.id.btnEndingTime})
    public void Click(View view) {
        switch (view.getId()) {
            case R.id.btnStartingTime: {
                if (dpd == null) {

                }
                break;
            }
            case R.id.btnEndingTime: {
                break;
            }
        }

    }

    @Override
    public void setArchive(List<GameArchiveModel> archive) {
//        this.modelList = archive;
//        adapter1.addAll(archive);
    }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

    }
}
