package com.root.lotto_app.app.ticket.id;

import com.root.lotto_app.app.ticket.TicketFragment;
import com.root.lotto_app.app.ticket.presenter.TicketFragmentPresenter;
import com.root.lotto_app.app.ticket.presenter.TicketFragmentPresenterImpl;
import com.root.lotto_app.app.ticket.presenter.TicketFragmentView;
import com.root.lotto_app.conf.scope.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Created by root on 1/4/18.
 */
@Module
public abstract class TicketFragmentModule {
    @Binds
    @PerFragment
    abstract android.support.v4.app.Fragment fragment(TicketFragment ticketFragment);
    @Binds
    @PerFragment
    abstract TicketFragmentView provideTicketFragmentView(TicketFragment ticketFragmentView);
    @Binds
    @PerFragment
    abstract TicketFragmentPresenter provideTicketFragmentPresenter(TicketFragmentPresenterImpl TicketFragmentPresenter);

}
