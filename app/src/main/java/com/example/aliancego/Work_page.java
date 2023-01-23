package com.example.aliancego;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.aliancego.entity.Action;

import org.w3c.dom.Text;

public class Work_page extends AppCompatActivity {

    private TextView actionList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_page);


        /** Код для примера будет отображаться в приложении -> (test) */
        Action action = new Action(1, "Анжумания", "Отжимайся 25 секунд", 25);
        Action action1 = new Action(2, "Бег на метсе", "Бегий 25 секунд", 25);
        Action action2 = new Action(3, "Пресс качать", "Прес качай  25 секунд", 25);
        actionList = findViewById(R.id.actionsList);
        StringBuilder sb = new StringBuilder();
        sb.append("1 " + action.getName() + " " + action.getTime() + " секунд" + "\n");
        sb.append("2 " + action1.getName() + " " + action1.getTime() + " секунд" + "\n");
        sb.append("3 " + action2.getName() + " " + action2.getTime() + " секунд" + "\n");
        actionList.setText(sb.toString());

    }

    public void butClickTwo(View v) {
        Intent intent = new Intent(this, Training_page.class);
        startActivity(intent);

    }
}