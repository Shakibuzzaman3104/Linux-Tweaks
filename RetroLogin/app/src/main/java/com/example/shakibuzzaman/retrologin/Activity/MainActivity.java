package com.example.shakibuzzaman.retrologin.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.shakibuzzaman.retrologin.Interface.ApiInterface;
import com.example.shakibuzzaman.retrologin.R;
import com.example.shakibuzzaman.retrologin.Retrofit.RetrofitApiClient;
import com.example.shakibuzzaman.retrologin.Model.ServerResponse;
import com.example.shakibuzzaman.retrologin.Model.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class MainActivity extends AppCompatActivity {

    EditText u,p;

    private ApiInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiInterface = RetrofitApiClient.getClient().create(ApiInterface.class);
        u=findViewById(R.id.ID);
        p=findViewById(R.id.Pass);
    }

    public void login(View view) {

        final String email;String Password;

        if(u.getText().toString().isEmpty() || p.getText().toString().isEmpty())
        {
            Toast.makeText(getApplicationContext(), "Please Fill all the places", Toast.LENGTH_SHORT).show();
        }

        else {
            email = u.getText().toString().trim();
            Password = p.getText().toString();
            User user = new User();
            user.setPass(Password);
            user.setEmail(email);
            if(!isValidEmail(email))
            {
                Toast.makeText(getApplicationContext(), "Invalid Email Format", Toast.LENGTH_SHORT).show();
            }

            else
            {
                checkUserValidity(user);
            }


        }

    }

    private void checkUserValidity(User userCredential)
    {
        Call<ServerResponse> call = apiInterface.getUserValidity(userCredential);
        call.enqueue(new Callback<ServerResponse>() {
            @Override
            public void onResponse(Call<ServerResponse> call, Response<ServerResponse> response) {
                ServerResponse validity = response.body();
                Toast.makeText(getApplicationContext(),validity.getMessage(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<ServerResponse> call, Throwable t) {

                Log.e("mess",t.getMessage());
                Toast.makeText(getApplicationContext(), "Connection Failed!!", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public final static boolean isValidEmail(CharSequence target) {
        if (target == null) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }

    public void Registers(View view) {

        Toast.makeText(getApplicationContext(), "Regitration Clicked", Toast.LENGTH_SHORT).show();
        Intent intent;
        intent = new Intent(MainActivity.this, Registration.class);
        startActivity(intent);
    }
}
