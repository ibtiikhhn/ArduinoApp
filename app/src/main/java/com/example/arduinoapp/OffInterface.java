package com.example.arduinoapp;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;

public interface OffInterface {
    @GET("OFF")
    Call<JsonObject> off();
}
