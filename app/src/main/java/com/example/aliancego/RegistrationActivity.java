package com.example.aliancego;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aliancego.database.Registration;
import com.example.aliancego.entity.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegistrationActivity extends AppCompatActivity {

    private Button btnRegistration, btnBack;
    private EditText editName, editPassword, editEmail;
    private TextView exempleText;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        exempleText = findViewById(R.id.exemple_text);

        btnRegistration = findViewById(R.id.button_registration);
        btnBack = findViewById(R.id.button_back);

        editName = findViewById(R.id.editNameForRegistration);
        editPassword = findViewById(R.id.editPasswordForRegistration);
        editEmail = findViewById(R.id.editEmailForRegistration);

        btnRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = editName.getText().toString();
                String email = editEmail.getText().toString();
                String password = editPassword.getText().toString();
                User user = new User(name, password, email);
                Registration registration = new Registration();
                registration.registrationUser(user);
//                exempleText.setText(user.toString());
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegistrationActivity.this, MainActivity.class));
            }
        });
    }
}