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
    public TextView test;
    public static final WorkoutBuilder workoutBuilder = new WorkoutBuilder();
    public static final List<Action> actions = workoutBuilder.getList();
    public static int i = 0;


    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);
        timerView = findViewById(R.id.timerView);
        progressBar = findViewById(R.id.progressBar);
        nameAction = findViewById(R.id.nameAction);
        test = findViewById(R.id.textTimer);
        start();
    }


    public void progressWorkout(Action action) {


    }


    public void start() {
        Action action = actions.get(i);
        nameAction.setText(action.getName());
        test.setText(i + "");

        CountDownTimer timer = new CountDownTimer
                (action.getDuration() * 1000L, 1000) {
            @Override
            public void onTick(long l) {
                progressBar.setMax(action.getDuration());
                timerView.setText("" + l / 1000);
                progressBar.setProgress((int) (l / 1000));
            }

            @Override
            public void onFinish() {
                start();
            }
        };
        timer.start();
        i += 1;
    }
}
//            for (int j = duration; j >= 0; j--) {
////                try {
//                timerView.setText(String.valueOf(j));
//                    progressBar.setProgress(duration / 1000);
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }

//            }


//        for(Action action : actions){
//            nameAction.setText(action.getName());
//
//            CountDownTimer timer = new CountDownTimer
//                    (action.getDuration() * 1000L, 1000) {
//                @Override
//                public void onTick(long l) {
//
//                    progressBar.setMax(action.getDuration());
//                    timerView.setText("" + l / 1000);
//                    progressBar.setProgress((int) (l / 1000));
//                }
//
//                @Override
//                public void onFinish() {
//                    return;
//                }
//            };
//            timer.start();
//        }


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







