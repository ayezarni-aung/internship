package com.azna.a020.api;

import com.azna.a020.model.Users;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("/users")
    Call<List<Users>> getAllusers();
}
