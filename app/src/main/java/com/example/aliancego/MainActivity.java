package com.example.aliancego;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.aliancego.entity.Action;

import org.w3c.dom.Text;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    private TextView qwe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView qwe = findViewById(R.id.qwe);
        Action action = new Action(1,"qwe","Anjumanija","asd",15,new File("asda"));
        qwe.setText(action.toString());
    }


    public void butClick(View v) {
        Intent intent = new Intent(this, work_page.class);
        startActivity(intent);
    }

}