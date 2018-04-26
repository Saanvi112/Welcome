package com.example.sonal.welcome;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v4.app.Fragment;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.IOException;

public class LoginActivity extends AppCompatActivity {
    Dialog myDialog;
Spinner spinnerRoll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        myDialog = new Dialog(this);
spinnerRoll=(Spinner)findViewById(R.id.spinnerroll);
String[] rolls={"Student","H.O.D","TEACHER"};
ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,rolls);
spinnerRoll.setAdapter(adapter);


}




    public void ShowPopup(View v){
        TextView txt;
        Button reg;
        myDialog.setContentView(R.layout.activity_registeractivity);
        txt = (TextView) myDialog.findViewById(R.id.txtclose);
        reg = (Button) myDialog.findViewById(R.id.reg);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }



    public void login(View view)
    {

        Intent intent = new Intent(LoginActivity.this,XpressActivity.class);
        startActivity(intent);
    }


    public void register (View view) {
        Intent intent = new Intent(LoginActivity.this,XpressActivity.class);

    }
}



