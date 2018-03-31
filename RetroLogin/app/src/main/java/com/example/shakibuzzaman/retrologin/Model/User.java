package com.example.shakibuzzaman.retrologin.Model;

/*
import android.widget.Toast;

import com.google.gson.annotations.SerializedName;

*/
/**
 * Created by Shakibuzzaman on 3/28/2018.
 *//*


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
*/


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("age")
    @Expose
    private String age;
    @SerializedName("blood_group")
    @Expose
    private String bloodGroup;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("pass")
    @Expose
    private String pass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}


