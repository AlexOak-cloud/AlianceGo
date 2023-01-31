package com.example.aliancego;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TestActivity extends AppCompatActivity {

    private TextView text;
    private Button button;
    private ProgressBar bar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        text = findViewById(R.id.testText);
        bar = findViewById(R.id.testBar);
        button = findViewById(R.id.testButton);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                CountDownTimer timer = new CountDownTimer(10000, 1000) {
                    @Override
                    public void onTick(long l) {
                        text.setText("" + l/1000);

                        bar.setProgress((int) (l / 1000));
                    }

                    @Override
                    public void onFinish() {
                        text.setText("-");

                    }
                };
                timer.start();
            }
        });


    }
}