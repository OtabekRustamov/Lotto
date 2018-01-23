package com.root.lotto_app.app.main.modul;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by root on 1/6/18.
 */

public class HomeModel implements Serializable {
    @SerializedName("id")
    Integer id;
    @SerializedName("name")
    String name;
    @SerializedName("module")
    String module;
    @SerializedName("status")
    Integer status;
    @SerializedName("type")
    String type;
    @SerializedName("number_of_lotteries")
    Integer number_of_lotteries;
    @SerializedName("winning_fund")
    Long winning_fund;
    @SerializedName("price_of_lottery")
    Integer price_of_lottery;
    @SerializedName("lottery_percentage")
    Double lottery_percentage;
    @SerializedName("jackpot")
    Integer jackpot;
    @SerializedName("super_prize")
    String super_prize;
    @SerializedName("logo")
    String logo;
    @SerializedName("logo_app")
    String logo_app;
    @SerializedName("banner_home")
    String banner_home;
    @SerializedName("banner_lottery")
    String banner_lottery;
    @SerializedName("created_at")
    String created_at;
    @SerializedName("last_edtions")
    List<LastAddition> lastAdditions;

    public List<LastAddition> getLastAdditions() {
        return lastAdditions;
    }

    public void setLastAdditions(List<LastAddition> lastAdditions) {
        this.lastAdditions = lastAdditions;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNumber_of_lotteries() {
        return number_of_lotteries;
    }

    public void setNumber_of_lotteries(Integer number_of_lotteries) {
        this.number_of_lotteries = number_of_lotteries;
    }

    public Long getWinning_fund() {
        return winning_fund;
    }

    public void setWinning_fund(Long winning_fund) {
        this.winning_fund = winning_fund;
    }

    public Integer getPrice_of_lottery() {
        return price_of_lottery;
    }

    public void setPrice_of_lottery(Integer price_of_lottery) {
        this.price_of_lottery = price_of_lottery;
    }

    public Double getLottery_percentage() {
        return lottery_percentage;
    }

    public void setLottery_percentage(Double lottery_percentage) {
        this.lottery_percentage = lottery_percentage;
    }

    public Integer getJackpot() {
        return jackpot;
    }

    public void setJackpot(Integer jackpot) {
        this.jackpot = jackpot;
    }

    public String getSuper_prize() {
        return super_prize;
    }

    public void setSuper_prize(String super_prize) {
        this.super_prize = super_prize;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLogo_app() {
        return logo_app;
    }

    public void setLogo_app(String logo_app) {
        this.logo_app = logo_app;
    }

    public String getBanner_home() {
        return banner_home;
    }

    public void setBanner_home(String banner_home) {
        this.banner_home = banner_home;
    }

    public String getBanner_lottery() {
        return banner_lottery;
    }

    public void setBanner_lottery(String banner_lottery) {
        this.banner_lottery = banner_lottery;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

}
