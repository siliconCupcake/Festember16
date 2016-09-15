package com.festember16.app;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by vishnu on 15/9/16.
 */
public interface GooglePing {

    public static final String ENDPOINT = "https://google.co.in";
    public static final String FESTEMBER16 = "festember16";

    @GET("/")
    Observable<Void> ping();
}
