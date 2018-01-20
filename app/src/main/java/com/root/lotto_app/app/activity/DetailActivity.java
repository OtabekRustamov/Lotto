package com.root.lotto_app.app.activity;

import android.support.v4.app.Fragment;
import android.widget.Button;

import com.root.lotto_app.R;
import com.root.lotto_app.core.BaseActivity;

import butterknife.BindView;

public class DetailActivity extends BaseActivity {

    @BindView(R.id.btnTwitter)
    Button btnTwitter ;
    @Override
    protected int getLayoutId() {
        return R.layout.activity_detail;
    }

    @Override
    protected void init() {
        btnTwitter.setBackgroundResource(R.drawable.twitter);
    }

    @Override
    protected Fragment openMainFragment() {
        return null;
    }

    @Override
    protected int getContainerId() {
        return 0;
    }
}
