package com.moh.mfl.model;


/**
 * Created by Chulu on 1/27/2018.
 */

public class MFLAPIUtils {
    private MFLAPIUtils() {}

   public static final String BASE_URL = "http://154.120.217.168:8082/";
    public static MFLAPIService getAPIService() {
        return RetrofitClient.getClient(BASE_URL).create(MFLAPIService.class);
    }
}
