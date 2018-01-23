package com.root.lotto_app.app.registration;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import com.root.lotto_app.R;
import com.root.lotto_app.app.registration.presenter.RegistrationFragmentPresenterImpl;
import com.root.lotto_app.app.registration.presenter.RegistrationFragmentView;
import com.root.lotto_app.core.BaseFragment;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by root on 12/16/17.
 */

public class RegistrationFragment extends BaseFragment implements RegistrationFragmentView{

    @Inject
    RegistrationFragmentPresenterImpl presenter ;

    @BindView(R.id.etName)
    EditText etName;
    @BindView(R.id.etPochta)
    EditText etPochta;
    @BindView(R.id.etPass)
    EditText etPass;
    @BindView(R.id.etRepeatPass)
    EditText etRepeatPass;
    @BindView(R.id.spStrana)
    Spinner spStrana;
    @BindView(R.id.spPhone)
    Spinner spPhone;
    @BindView(R.id.checkAccept)
    CheckBox checkAccept;
    @BindView(R.id.check18)
    CheckBox check18;
    // todo below checkboxes
    @BindView(R.id.btRegistr)
    Button btRegistr;

    public static RegistrationFragment getInstance(){
        RegistrationFragment fragment = new RegistrationFragment();
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_registration;
    }

    @OnClick(value = {R.id.btRegistr})
    public void onclickRegistr(View view){
        if (view.getId() == R.id.btRegistr){
            checkInfo();
        }
        // todo

    }

    @Override
    protected void init() {
        presenter.getMail();
    }


    @Override
    public void checkInfo() {
        // todo checkInfo weather infos correct or not
    }
}
