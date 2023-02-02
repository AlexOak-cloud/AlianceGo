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
import com.example.aliancego.entity.WorkoutBuilder;

import java.util.List;

public class RunUpActivity extends AppCompatActivity {

    private Button btnBack;
    private ListView list;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_runup);
        list = findViewById(R.id.list);
        btnBack = findViewById(R.id.button_back);

        /** Создание списка упражнений -> */
        WorkoutBuilder workoutBuilder = new WorkoutBuilder();
        List<Action> actions = workoutBuilder.generateWorkout();
        List<String> showList = workoutBuilder.showList(actions);
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this, android.R.layout.simple_list_item_1, showList);
        list.setAdapter(adapter);

        /** Нажатие на кнопку "Назад" -> */
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RunUpActivity.this,MainActivity.class));
            }
        });
    }


    public void butClickTwo(View v) {
        Intent intent = new Intent(this, TrainingActivity.class);
        startActivity(intent);
    }
}