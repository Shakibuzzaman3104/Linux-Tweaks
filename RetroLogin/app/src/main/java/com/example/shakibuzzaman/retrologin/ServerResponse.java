package com.example.shakibuzzaman.retrologin;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Shakibuzzaman on 3/28/2018.
 */

public class ServerResponse {

    @SerializedName("message")
    String Message;

    String getMessage()
    {
        return Message;
    }
}
