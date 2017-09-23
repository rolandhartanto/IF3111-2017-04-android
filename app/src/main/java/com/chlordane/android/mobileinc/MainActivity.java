package com.chlordane.android.mobileinc;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLoginButton = (Button) findViewById(R.id.loginButton);
    }

    public void login(View view) {
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "login clicked", Toast.LENGTH_LONG);
        toast.show();
    }
}
