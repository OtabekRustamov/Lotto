package com.root.lotto_app.app.auth;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.root.lotto_app.R;
import com.root.lotto_app.app.registration.RegistrationFragment;
import com.root.lotto_app.app.auth.model.PhoneNumer;
import com.root.lotto_app.app.auth.presenter.AuthPresenterView;
import com.root.lotto_app.core.BaseFragment;

import java.util.List;

import butterknife.BindView;

/**
 * Created by root on 12/16/17.
 */

public class AuthorizationFragment extends BaseFragment implements AuthPresenterView {
    @BindView(R.id.spMobile)
    Spinner spMobile;
    @BindView(R.id.tvForger)
    TextView tvForger;
    @BindView(R.id.checkRemember)
    CheckBox checkRemember;
    @BindView(R.id.btEnter)
    Button btEnter;
    @BindView(R.id.tvRegister)
    TextView tvRegister;
    @BindView(R.id.llPrepare)
    LinearLayout llPrepare;
    @BindView(R.id.llDone)
    LinearLayout llDone;
    @BindView(R.id.etCode)
    EditText etCode;
    @BindView(R.id.tvPhoneNumber)
    TextView tvPhoneNumber;
    @BindView(R.id.btDone)
    Button btDone;
    private List<PhoneNumer> phoneNumers;
    private ArrayAdapter arrayAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_autorization;
    }

    @Override
    protected void init() {
        arrayAdapter = new ArrayAdapter(getContext(),android.R.layout.simple_spinner_item,phoneNumers);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spMobile.setAdapter(arrayAdapter);
    }

    @Override
    public void setPhoneNumber(List<PhoneNumer> phoneNumber) {
        this.phoneNumers = phoneNumber;

    }

    @Override
    public void openForgetPass() {
        //todo open FrogerPass
    }

    @Override
    public void openRegistr() {
        RegistrationFragment.getInstance();
    }
}
