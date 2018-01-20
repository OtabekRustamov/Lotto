package com.root.lotto_app.app.ticket.modul;

import android.view.ViewGroup;
import android.widget.Button;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.root.lotto_app.R;

/**
 * Created by root on 1/15/18.
 */

public class TicketHolder extends BaseViewHolder<Integer> {
    Button btnItemTIcket;

    public TicketHolder(ViewGroup parent, int res) {
        super(parent, res);
        btnItemTIcket = $(R.id.btnItemTicket);
    }

    @Override
    public void setData(Integer data) {
        super.setData(data);
        btnItemTIcket.setText("" + data);
    }
}
