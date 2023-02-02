package com.example.aliancego;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.aliancego.entity.Action;
import com.example.aliancego.entity.ActionBuilder;
import com.example.aliancego.entity.Workout;
import com.example.aliancego.entity.WorkoutBuilder;

import java.util.ArrayList;
import java.util.List;

public class WorkActivity extends AppCompatActivity {

    private TextView actionList;
    private Button btnBack;
    private ListView list;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);
        list = findViewById(R.id.list);
        btnBack = findViewById(R.id.button_back);

        WorkoutBuilder workoutBuilder = new WorkoutBuilder();
        ActionBuilder actionBuilder = new ActionBuilder();
        List<Action> actions = workoutBuilder.generateWorkout(actionBuilder.listWorkout1(), 1,
                actionBuilder.listWorkout2(), 2,
                actionBuilder.listWorkout3(), 3,
                actionBuilder.listWorkout4(), 2,
                actionBuilder.listWorkout5(), 2);


        List<String> forShow = new ArrayList<>();
        for(Action tmp: actions){
            forShow.add(tmp.getName() + ": " + tmp.getTime() + " секунд");
        }


        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this, android.R.layout.simple_list_item_1, forShow);


        list.setAdapter(adapter);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WorkActivity.this,MainActivity.class));
            }
        });


    }


    public void butClickTwo(View v) {
        Intent intent = new Intent(this, TrainingActivity.class);
        startActivity(intent);

    }
}