package com.example.shakibuzzaman.retrologin;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Shakibuzzaman on 3/28/2018.
 */

public interface ApiInterface {

    @POST("/Webconnect/php_helper.php")
    Call<ServerResponse> getUserValidity(@Body User userLoginCredential);
}
