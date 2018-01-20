package com.root.lotto_app.util;

import android.content.Context;

import com.root.lotto_app.app.main.modul.HomeModel;
import com.root.lotto_app.app.media.full.models.MediaModel;
import com.root.lotto_app.app.message.model.NotificationModel;
import com.root.lotto_app.app.news.module.NewsModel;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

/**
 * Created by root on 12/20/17.
 */

public class ApiManager {
    private ApiManager() {
    }

    private Retrofit retrofit;
    private ApiService apiService;
    private Context context;

    public ApiManager(Retrofit retrofit, Context context) {
        this.context = context;
        this.retrofit = retrofit;
        apiService = retrofit.create(ApiService.class);
    }

    // TODO: 12/20/17
    // these are only for test(prediction of API)
    public Single<Boolean> getPrise(long priseId) {
        return apiService.getPrise(priseId)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Observable<List<HomeModel>> getHome() {
        return apiService.getHome()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Observable<List<NewsModel>> getNews() {
        return apiService.getNews()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Observable<List<MediaModel>> getMedia() {
        return apiService.getMedia()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Observable<List<NotificationModel>> getMessage() {
        return apiService.getMessage()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
