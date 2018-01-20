package com.root.lotto_app.app.registration.modul;

import java.io.Serializable;

/**
 * Created by root on 12/26/17.
 */

public class ModulRegistr implements Serializable{
    String name ;
    String Number;
    String password ;
    String strana ;
    String passConfirm;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStrana() {
        return strana;
    }

    public void setStrana(String strana) {
        this.strana = strana;
    }

    public String getPassConfirm() {
        return passConfirm;
    }

    public void setPassConfirm(String passConfirm) {
        this.passConfirm = passConfirm;
    }

}
