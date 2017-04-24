package com.example.eric.android_hw4_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class ActivityNotification extends AppCompatActivity {
    EditText et_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        et_msg = (EditText)findViewById(R.id.editText);

        setContentView(et_msg);
    }
}
