package com.example.ganjoor.Api;



import com.example.ganjoor.Model.faal.Fal;
import com.example.ganjoor.Model.poets.Poet;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServices {

    @GET("poets")
    Call<List<Poet>> getpoets();

    @GET("hafez/faal")
    Call<Fal> getfaal();




}
