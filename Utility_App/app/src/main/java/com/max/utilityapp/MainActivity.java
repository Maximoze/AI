package com.max.utilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ImageButton btnNewActivity = (ImageButton) findViewById(R.id.newActivityButton6);
        ImageButton btncall = (ImageButton) findViewById(R.id.callButton);
        ImageButton btnsms = (ImageButton) findViewById(R.id.smsButton5);

        btncall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+221772769122"));
                startActivity(intent);
            }
        });

        btnsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("smsto:"+ Uri.encode("+221772769122")));
                intent.putExtra("sms_body", "Slt Slt");
                startActivity(intent);
            }
        });

        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent intentNewActivity = new Intent(getApplicationContext(),Activity_2.class);
              startActivity(intentNewActivity);
            }
        });
    }
}
