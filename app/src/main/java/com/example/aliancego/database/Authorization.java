package com.example.aliancego.database;

import com.example.aliancego.entity.User;
import com.google.firebase.auth.FirebaseAuth;

public class Authorization {

//    private FirebaseAuth auth;
//
//    public void login(User user){
//        auth.signInWithEmailAndPassword(user.getEmail(),)
//                .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
//                    @Override
//                    public void onSuccess(AuthResult authResult) {
//                        startActivity(new  Intent(MainActivity.this, MapActivity.class));
//                        finish();
//                    }
//                }).addOnFailureListener(new OnFailureListener() {
//                    @Override
//                    public void onFailure(@NonNull Exception e) {
//                        Snackbar.make(root, "false " + e.getMessage(), Snackbar.LENGTH_SHORT).show();
//                    }
//                });
//
//    }
//
//
//
//    }
//
//


/*  !!!!!!!! CREATE SERVICES !

                if (TextUtils.isEmpty(email.getText().toString())) {
                    Snackbar.make(root, "Input email", Snackbar.LENGTH_SHORT).show();
                    return;
                }
                if (password.getText().toString().length() < 5) {
                    Snackbar.make(root, "Input password ( password > 5 )", Snackbar.LENGTH_SHORT).show();
                    return;
                }

                auth.signInWithEmailAndPassword(email.getText().toString(),password.getText().toString())
                        .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                            @Override
                            public void onSuccess(AuthResult authResult) {
                                startActivity(new  Intent(MainActivity.this, MapActivity.class));
                                finish();
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Snackbar.make(root, "false " + e.getMessage(), Snackbar.LENGTH_SHORT).show();
                            }
                        });

            }
        });
        dialog.show();
    }*/
}
