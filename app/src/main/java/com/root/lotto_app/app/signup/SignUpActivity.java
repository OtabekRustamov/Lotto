package com.root.lotto_app.app.signup;

import android.annotation.SuppressLint;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.root.lotto_app.R;
import com.root.lotto_app.app.registration.RegistrationFragment;
import com.root.lotto_app.app.auth.AuthorizationFragment;
import com.root.lotto_app.core.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SignUpActivity extends BaseActivity {

    @BindView(R.id.signUpVP)
    ViewPager signUpVP;
    @BindView(R.id.tlSignUp)
    TabLayout tlSignUp;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_sign_up;
    }

    @Override
    protected void init() {
        signUpVP.setAdapter(new MypagerAdapter(getSupportFragmentManager()));
        tlSignUp.setupWithViewPager(signUpVP);
    }

    @Override
    protected Fragment openMainFragment() {
        return null;
    }

    @SuppressLint("ResourceType")
    @Override
    protected int getContainerId() {
        return R.layout.activity_sign_up;
    }



    public class MypagerAdapter extends FragmentPagerAdapter {

        public MypagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment;
            if (position == 0) {
                fragment = new AuthorizationFragment();
            } else fragment = new RegistrationFragment();
            return fragment;
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            String title;
            if (position == 0) {
                title = "Autorization";
            } else title = "Registration";
            return title;
        }
    }
}
