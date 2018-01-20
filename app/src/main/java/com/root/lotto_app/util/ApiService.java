package com.root.lotto_app.util;

import com.root.lotto_app.app.main.modul.HomeModel;
import com.root.lotto_app.app.media.full.models.MediaModel;
import com.root.lotto_app.app.message.model.NotificationModel;
import com.root.lotto_app.app.news.module.NewsModel;
import com.root.lotto_app.app.registration.modul.ModulRegistr;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by root on 12/20/17.
 */

public interface ApiService {
    @POST("")
    Single<Boolean> getPrise(long priseId);

    @GET("/lottery")
    Observable<List<HomeModel>> getHome();

    @GET("/photos")
    Observable<List<NewsModel>> getNews();

    @GET("/photos")
    Observable<List<MediaModel>> getMedia();

    @GET("/photos")
    Observable<List<NotificationModel>> getMessage();

    @POST("")
    Observable<ModulRegistr> getRegist(List<ModulRegistr> ModulRegistr);

}
