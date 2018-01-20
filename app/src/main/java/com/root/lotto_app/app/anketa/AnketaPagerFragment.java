package com.root.lotto_app.app.anketa;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.root.lotto_app.R;
import com.root.lotto_app.app.archive.profile.ArchiveFragment;
import com.root.lotto_app.app.message.NotificationFragment;
import com.root.lotto_app.app.ticket.TicketFragment;
import com.root.lotto_app.core.BaseFragment;

import butterknife.BindView;

/**
 * Created by root on 1/15/18.
 */

public class AnketaPagerFragment extends BaseFragment {
    @BindView(R.id.tlAnketa)
    TabLayout tlAnketa;
    @BindView(R.id.anketaVP)
    ViewPager anketaVP;

    @Override
    protected int getLayoutId() {
        return R.layout.anketa_root_fragment;
    }

    @Override
    protected void init() {
        anketaVP.setAdapter(new MypagerAdapter(getChildFragmentManager()));
        tlAnketa.setupWithViewPager(anketaVP);
    }

    public class MypagerAdapter extends FragmentPagerAdapter {

        public MypagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position) {
                case 0: {
                    fragment = new AnketaFragment();
                    break;
                }
                case 1: {
                    fragment = new NotificationFragment();
                    break;
                }
                case 2: {
                    fragment = new TicketFragment();
                    break;
                }case 3:{
                    fragment = new ArchiveFragment();
                    break;
                }
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            String title = null;
            switch (position) {
                case 0: {
                    title = "Anketa";
                    break;
                }
                case 1: {
                    title = "Notifica";
                    break;
                }
                case 2: {
                    title = "Ticket";
                    break;
                }
                case 3: {
                    title = "Archive";
                    break;
                }
            }
            return title;
        }
    }
}
