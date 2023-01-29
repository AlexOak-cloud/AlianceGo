package com.example.aliancego.database;

import android.widget.RelativeLayout;

import com.example.aliancego.entity.User;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Registration {

    private FirebaseAuth auth;
    private FirebaseDatabase db;
    private DatabaseReference users;
    private RelativeLayout root;


    public void registrationUser(User user) {


        auth = FirebaseAuth.getInstance();
        db = FirebaseDatabase.getInstance();
        users = db.getReference("users");
        auth.createUserWithEmailAndPassword(user.getEmail(), user.getPassword());
        users.child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                .setValue(user);

        /*mAuth.createUserWithEmailAndPassword(email, password)
        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d(TAG, "createUserWithEmail:success");
                    FirebaseUser user = mAuth.getCurrentUser();
                    updateUI(user);
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w(TAG, "createUserWithEmail:failure", task.getException());
                    Toast.makeText(EmailPasswordActivity.this, "Authentication failed.",
                            Toast.LENGTH_SHORT).show();
                    updateUI(null);
                }
            }
        });
*/
    }
}
