package com.azna.a020.utils;

import com.azna.a020.api.ApiClient;
import com.azna.a020.api.ApiInterface;

public class ApiUtils {
    public static final String BASE_URL="https://jsonplaceholder.typicode.com/";
    public static ApiInterface getApi(){
        return ApiClient.getRetrofit(BASE_URL).create(ApiInterface.class);
    }

}
