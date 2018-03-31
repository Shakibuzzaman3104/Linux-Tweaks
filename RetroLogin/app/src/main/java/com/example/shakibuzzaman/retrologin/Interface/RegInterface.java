package com.example.shakibuzzaman.retrologin.Interface;

import com.example.shakibuzzaman.retrologin.Model.ServerResponse;
import com.example.shakibuzzaman.retrologin.Model.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RegInterface {
    @POST("/Webconnect/web_registration.php")
    Call<ServerResponse> UserRegistration(@Body User userRegistrationCredential);
}
