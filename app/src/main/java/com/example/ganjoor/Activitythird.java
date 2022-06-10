package com.example.ganjoor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.ganjoor.Api.ApiServices;
import com.example.ganjoor.Api.RetrofitConfig;
import com.example.ganjoor.Model.poets.Poet;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Activitythird extends AppCompatActivity {
    ApiServices request;
    Call<List<Poet>> call;
    PoetsAdapterClass bioAdapter;
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytwo);

        rv = findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        rv.setHasFixedSize(true);
        request = RetrofitConfig.getApiclient().create(ApiServices.class);

        call = request.getpoets();
        call.enqueue(new Callback<List<Poet>>() {
            @Override
            public void onResponse(Call<List<Poet>> call, Response<List<Poet>> response) {
                if (response.isSuccessful()) {
                    Log.e("BiooT", "onResponse: " + response.body());


                    bioAdapter = new PoetsAdapterClass(Activitythird.this, response.body());

                    rv.setAdapter(bioAdapter);
                }
            }

            @Override
            public void onFailure(Call<List<Poet>> call, Throwable t) {
                Log.i("Example", "onError: " + t.getMessage());

            }
        });
    }
}