package com.ims.mvvmbelajar1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CoronaDataService {
    @GET("indonesia/provinsi")
    Call<List<Corona>> getCorona();
}