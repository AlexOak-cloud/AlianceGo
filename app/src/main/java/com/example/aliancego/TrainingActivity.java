package com.example.aliancego;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aliancego.entity.Action;
import com.example.aliancego.entity.WorkoutBuilder;

import java.util.List;

public class TrainingActivity extends AppCompatActivity {

    public TextView nameAction;
    public TextView timerView;
    public ProgressBar progressBar;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);
        timerView = findViewById(R.id.timerView);
        progressBar = findViewById(R.id.progressBar);
        nameAction = findViewById(R.id.nameAction);

        WorkoutBuilder workoutBuilder = new WorkoutBuilder();
        List<Action> actions = workoutBuilder.getList();

        for (int i = 0; i < actions.size(); i++) {
            Action action = actions.get(i);


        }


        CountDownTimer timer = new CountDownTimer(45000, 1000) {
            @Override
            public void onTick(long l) {
                timerView.setText("" + l / 1000);
                progressBar.setProgress((int) (l / 1000));

            }

            @Override
            public void onFinish() {
                timerView.setText("-");

            }
        };
        timer.start();


    }

    public void executing(List<Action> actions) {


        for (int i = 0; i < actions.size(); i++) {
            nameAction.setText(actions.get(i).getName());

            int finalI = i;
            CountDownTimer timer = new CountDownTimer(actions.get(finalI).getTime() * 1000L, 1000) {
                @Override
                public void onTick(long l) {
                    progressBar.setMax(actions.get(finalI).getTime());
                    timerView.setText("" + l / 1000);
                    progressBar.setProgress((int) (l / 1000));
                }
                @Override
                public void onFinish() {
                }
            };
            timer.start();
        }
    }
}



