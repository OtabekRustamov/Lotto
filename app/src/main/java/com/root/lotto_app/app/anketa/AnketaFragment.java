package com.root.lotto_app.app.anketa;

import android.widget.Button;
import android.widget.EditText;

import com.root.lotto_app.R;
import com.root.lotto_app.core.BaseFragment;

import butterknife.BindView;

/**
 * Created by root on 1/4/18.
 */

public class AnketaFragment extends BaseFragment {
    @BindView(R.id.etName)
    EditText etName;
    @BindView(R.id.etPhone)
    EditText etPhone;
    @BindView(R.id.etEmail)
    EditText etEmail;
    @BindView(R.id.etPassword)
    EditText etPassword;
    @BindView(R.id.btnSave)
    Button btnSave;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_anketa;
    }

    @Override
    protected void init() {

    }
}
