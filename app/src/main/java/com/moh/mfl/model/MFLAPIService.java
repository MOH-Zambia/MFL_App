package com.moh.mfl.model;

/**
 * Created by Chulu on 1/27/2018.
 */

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MFLAPIService {

    //For facility search
    @GET("/mfl/v1/Facilities/{name}")
    @Headers("Content-Type: application/json")
    Call<FacilityResponse> Search(@Path("name") String name);
}
