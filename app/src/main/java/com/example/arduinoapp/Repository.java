package com.example.arduinoapp;

import android.util.Log;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Repository {

    final Retrofit retrofit = NetworkClient.getRetrofit();



    public void onBulb() {

        OnInterface onInterface = retrofit.create(OnInterface.class);

        Call<JsonObject> call = onInterface.on();

        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                if (response.isSuccessful()) {
                    Log.i("HELLO", "onResponse: "+"Bulb has been turned on");
                }
                Log.i("HELLO", "outside onResponse: "+"Bulb has been turned on");
                Log.i("HELLO", "onResponse: "+response.body());
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                Log.i("HEllo", "onFailure: "+t.toString());
            }
        });
    }

    public void offBulb() {
        OffInterface offInterface= retrofit.create(OffInterface.class);

        Call<JsonObject> call = offInterface.off();

        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                if (response.isSuccessful()) {
                    Log.i("HELLO", "onResponse: "+"Bulb has been turned off");
                }
                Log.i("HELLO", "outside onResponse: " + "Bulb has been turned off");


                Log.i("HELLO", "onResponse: "+response.body());
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                Log.i("HEllo", "onFailure: "+t.toString());
            }
        });
    }
}
