package com.example.sonal.welcome;

import android.content.Intent;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v4.app.Fragment;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


}
    public void login(View view)
    {

        Intent intent = new Intent(LoginActivity.this,XpressActivity.class);
        startActivity(intent);
    }


    public void register(View view) {
        Intent intent = new Intent(LoginActivity.this,XpressActivity.class);
    }
}


