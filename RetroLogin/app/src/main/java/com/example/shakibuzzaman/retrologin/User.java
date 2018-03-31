package com.example.shakibuzzaman.retrologin;

import android.widget.Toast;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Shakibuzzaman on 3/28/2018.
 */

public class User {

    @SerializedName("email")
    String Email;

    @SerializedName("pass")
    String password;

    void setEmail(String Email)
    {
        this.Email=Email;
    }

     void setPassword(String password)
    {
        this.password=password;
    }
}
