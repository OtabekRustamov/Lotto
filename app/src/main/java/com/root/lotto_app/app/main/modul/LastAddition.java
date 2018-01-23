package com.root.lotto_app.app.main.modul;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by root on 1/22/18.
 */

public class LastAddition implements Serializable {
    @SerializedName("id")
    Integer id;
    @SerializedName("number")
    Integer number;
    @SerializedName("time")
    String time;
    @SerializedName("tv_id")
    Integer tv_id;
    @SerializedName("jackpot")
    Long jackpot;
    @SerializedName("lottery_id")
    Integer lottery_id;
    @SerializedName("user_id")
    Integer user_id;
    @SerializedName("status")
    Integer status;
    @SerializedName("created_at")
    Integer created_at;
    @SerializedName("updated_at")
    Integer updated_at;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getTv_id() {
        return tv_id;
    }

    public void setTv_id(Integer tv_id) {
        this.tv_id = tv_id;
    }

    public Long getJackpot() {
        return jackpot;
    }

    public void setJackpot(Long jackpot) {
        this.jackpot = jackpot;
    }

    public Integer getLottery_id() {
        return lottery_id;
    }

    public void setLottery_id(Integer lottery_id) {
        this.lottery_id = lottery_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Integer created_at) {
        this.created_at = created_at;
    }

    public Integer getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Integer updated_at) {
        this.updated_at = updated_at;
    }
}
