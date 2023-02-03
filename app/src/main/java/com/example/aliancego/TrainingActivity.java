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
    public static final WorkoutBuilder workoutBuilder = new WorkoutBuilder();
    public static final List<Action> actions = workoutBuilder.getList();
    public static int i = 0;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);
        timerView = findViewById(R.id.timerView);
        progressBar = findViewById(R.id.progressBar);
        nameAction = findViewById(R.id.nameAction);

        /** LIFO or FIFO */
        loop();
    }


    public void loop(){
        for (; i < actions.size(); i++) {
            nameAction.setText(actions.get(i).getName());
            startTimer(actions.get(i));
        }
    }


    public void startTimer(Action action){
        CountDownTimer timer = new CountDownTimer
                (action.getTime() * 1000L, 1000) {
            @Override
            public void onTick(long l) {
                progressBar.setMax(action.getTime());
                timerView.setText("" + l / 1000);
                progressBar.setProgress((int) (l / 1000));
            }

            @Override
            public void onFinish() {
                loop();
            }
        };
        timer.start();

    }


//    CountDownTimer timer = new CountDownTimer(45000, 1000) {
//        @Override
//        public void onTick(long l) {
//            timerView.setText("" + l / 1000);
//            progressBar.setProgress((int) (l / 1000));
//
//        }
//
//        @Override
//        public void onFinish() {
//            timerView.setText("-");
//
//        }
//
//    };




}



