package com.root.lotto_app.conf.module;

import com.root.lotto_app.app.anketa.AnketaFragment;
import com.root.lotto_app.app.anketa.AnketaPagerFragment;
import com.root.lotto_app.app.anketa.id.AnketaPagerFragmentModule;
import com.root.lotto_app.app.anketa.id.AnketaFragmentModule;
import com.root.lotto_app.app.archive.game.GameArchiveFragment;
import com.root.lotto_app.app.archive.game.id.GameArchiveFragmentModule;
import com.root.lotto_app.app.archive.profile.ArchiveFragment;
import com.root.lotto_app.app.archive.profile.id.ArchiveFragmentModule;
import com.root.lotto_app.app.auth.AuthorizationFragment;
import com.root.lotto_app.app.auth.id.AuthFragmentModule;
import com.root.lotto_app.app.checktickets.CheckTicketsFragemnt;
import com.root.lotto_app.app.checktickets.id.CheckTicketsModule;
import com.root.lotto_app.app.media.full.MediaFragment;
import com.root.lotto_app.app.media.full.id.MediaFragmentModule;
import com.root.lotto_app.app.media.item.ItemMediaActivity;
import com.root.lotto_app.app.media.item.id.ItemMediaActivityModule;
import com.root.lotto_app.app.message.NotificationFragment;
import com.root.lotto_app.app.message.id.FragmentMessageModule;
import com.root.lotto_app.app.news.NewsFragment;
import com.root.lotto_app.app.news.id.NewsFragmentModule;
import com.root.lotto_app.app.oltinbaliq.FragmentOltinBaliq;
import com.root.lotto_app.app.oltinbaliq.id.FragmentOltinBaliqMudule;
import com.root.lotto_app.app.omadlotto.FragmentOmadLotto;
import com.root.lotto_app.app.omadlotto.id.FragmentOmadLottoModule;
import com.root.lotto_app.app.play.PlayFragment;
import com.root.lotto_app.app.play.id.PlayFragmentModule;
import com.root.lotto_app.app.registration.RegistrationFragment;
import com.root.lotto_app.app.registration.id.RegistrFragmentModule;
import com.root.lotto_app.app.main.MainActivity;
import com.root.lotto_app.app.main.di.MainActivityModule;
import com.root.lotto_app.app.signup.SignUpActivity;
import com.root.lotto_app.app.signup.id.SignUpActivityModule;
import com.root.lotto_app.app.ticket.TicketFragment;
import com.root.lotto_app.app.ticket.id.TicketFragmentModule;
import com.root.lotto_app.app.winner.FragmentWinner;
import com.root.lotto_app.app.winner.id.WinnerFragmentModul;
import com.root.lotto_app.conf.scope.PerActivity;
import com.root.lotto_app.conf.scope.PerFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;


/**
 * Created by root on 01/01/18.
 */

@Module(includes = AndroidSupportInjectionModule.class)
public abstract class MainModule {
    @PerActivity
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity contributeMainActivity();

    @PerFragment
    @ContributesAndroidInjector(modules = RegistrFragmentModule.class)
    abstract RegistrationFragment contributeRegistrationFragment();

    @PerFragment
    @ContributesAndroidInjector(modules = CheckTicketsModule.class)
    abstract CheckTicketsFragemnt contributeCheckTicketsFragemnt();

    @PerFragment
    @ContributesAndroidInjector(modules = AuthFragmentModule.class)
    abstract AuthorizationFragment contributeAuthorizationFragment();

    @PerActivity
    @ContributesAndroidInjector(modules = SignUpActivityModule.class)
    abstract SignUpActivity contributeSignUpActivity();

    @PerFragment
    @ContributesAndroidInjector(modules = AnketaFragmentModule.class)
    abstract AnketaFragment contributeAnketaFrgment();

    @PerFragment
    @ContributesAndroidInjector(modules = AnketaPagerFragmentModule.class)
    abstract AnketaPagerFragment contributeAnketaPagerFragment();

    @PerFragment
    @ContributesAndroidInjector(modules = NewsFragmentModule.class)
    abstract NewsFragment contributeNewsFragment();

    @PerFragment
    @ContributesAndroidInjector(modules = MediaFragmentModule.class)
    abstract MediaFragment contributeMediaFragment();

    @PerFragment
    @ContributesAndroidInjector(modules = FragmentOltinBaliqMudule.class)
    abstract FragmentOltinBaliq contributeFragmentOltinBaliq();

    @PerFragment
    @ContributesAndroidInjector(modules = FragmentMessageModule.class)
    abstract NotificationFragment contributeFragmentMessage();

    @PerFragment
    @ContributesAndroidInjector(modules = WinnerFragmentModul.class)
    abstract FragmentWinner contributeFrgmentWinner();

    @PerFragment
    @ContributesAndroidInjector(modules = TicketFragmentModule.class)
    abstract TicketFragment contributeTicketFragment();

    @PerFragment
    @ContributesAndroidInjector(modules = ArchiveFragmentModule.class)
    abstract ArchiveFragment contributeArchiveFragment();

    @PerFragment
    @ContributesAndroidInjector(modules = GameArchiveFragmentModule.class)
    abstract GameArchiveFragment contributeGameArchiveFragment();

    @PerFragment
    @ContributesAndroidInjector(modules = PlayFragmentModule.class)
    abstract PlayFragment contributePlayFragment();

    @PerFragment
    @ContributesAndroidInjector(modules = FragmentOmadLottoModule.class)
    abstract FragmentOmadLotto contributeFragmentOmadLotto();

    @PerActivity
    @ContributesAndroidInjector(modules = ItemMediaActivityModule.class)
    abstract ItemMediaActivity contributeItemMediaActivity();
}