package com.root.lotto_app.app.ticket.presenter;

import com.root.lotto_app.app.anketa.presenter.AnketaFragmentPresenter;
import com.root.lotto_app.app.anketa.presenter.AnketaFragmentPresenterView;
import com.root.lotto_app.core.BasePresenterImpl;
import com.root.lotto_app.util.ApiManager;

/**
 * Created by root on 1/4/18.
 */

public class TicketFragmentPresenterImpl extends BasePresenterImpl<TicketFragmentView> implements TicketFragmentPresenter {


    protected TicketFragmentPresenterImpl(TicketFragmentView ticketFragmentView, ApiManager apiManager) {
        super(ticketFragmentView, apiManager);
    }

    @Override
    public void fillImges() {

    }
}
