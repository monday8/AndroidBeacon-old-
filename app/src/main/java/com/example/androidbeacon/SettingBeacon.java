package com.example.androidbeacon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class SettingBeacon extends Activity {

    protected String major = "";
    protected String minor = "";

    EditText text_Major;
    EditText text_Minor;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settingbeacon);

        Intent intent = getIntent();
        major = intent.getStringExtra("major");
        minor = intent.getStringExtra("minor");


        //Component
        initialComponent();
    }

    private void initialComponent() {
        text_Major = (EditText) findViewById(R.id.text_Major);
        text_Minor = (EditText) findViewById(R.id.text_Minor);

        text_Major.setText(major);
        text_Minor.setText(minor);
    }
    public void onSettingBeaconReturnClicked(View view) {
        Intent myIntent = new Intent(SettingBeacon.this, MainActivity.class);

        major = text_Major.getText().toString();
        minor = text_Minor.getText().toString();

        myIntent.putExtra("major", major);
        myIntent.putExtra("minor", minor);
        finish();
    }
}
