package com.example.aliancego;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WorkActivity extends AppCompatActivity {

    private TextView actionList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_page);
    }

    public void butClickTwo(View v) {
        Intent intent = new Intent(this, TrainingActivity.class);
        startActivity(intent);

    }
}