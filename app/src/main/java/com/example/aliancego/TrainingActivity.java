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


    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);
        timerView = findViewById(R.id.timerView);
        progressBar = findViewById(R.id.progressBar);
        nameAction = findViewById(R.id.nameAction);
        onResume();



    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onResume() {
        super.onResume();

        Action action = actions.get(1);
        nameAction.setText(action.getName());
        timerView.setText(action.getDuration() + "");
        for (int i = action.getDuration(); i >= 0; i--) {
            try {
                timerView.setText(i + "");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

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
}


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
/**
 * LIFO or FIFO
 */


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







