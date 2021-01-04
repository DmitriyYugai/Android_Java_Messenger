package com.demo.messanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivedMessageActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_message);
        textView = findViewById(R.id.textViewReceivedMsg);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        textView.setText(msg);
    }
}