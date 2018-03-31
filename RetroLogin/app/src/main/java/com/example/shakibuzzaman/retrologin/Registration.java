package com.example.shakibuzzaman.retrologin;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Registration extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
    }
    public void Reg(View view)
    {
        Toast.makeText(getApplicationContext(), "Found", Toast.LENGTH_SHORT).show();
    }
}
