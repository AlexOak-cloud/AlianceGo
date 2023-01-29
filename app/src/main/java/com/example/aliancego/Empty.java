package com.example.aliancego;

public class Empty {

    // id project -> project-233845677172
    //SHA1 -> 9A:9D:29:68:BA:B2:59:DC:8A:B5:C6:6F:F6:6F:DE:E4:D2:61:E2:CA


    /**
     *
     * Новые кнопки входа и регитсрации (не) работают в тестовом режиме
     *
     *
     *
     * */


    //For Exemple ->
    /*package com.example.aliancego;

public class MainActivity extends AppCompatActivity {

    private Button buttonSignIn, buttonRegistration;
    private FirebaseAuth auth;
    private FirebaseDatabase db;
    private DatabaseReference users;

    RelativeLayout root;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        root = findViewById(R.id.root_element);

        auth = FirebaseAuth.getInstance();
        db = FirebaseDatabase.getInstance();
        users = db.getReference("Users");

        buttonSignIn = findViewById(R.id.button_signIn);

        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSignInWindow();
            }
        });

        buttonRegistration = findViewById(R.id.button_registration);
        buttonRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showRegisterWindow();
            }
        });

//
    }

    private void showSignInWindow() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("sign in");
        dialog.setMessage("input all data for sign in");

        LayoutInflater inflater = LayoutInflater.from(this);
        View registerWindow = inflater.inflate(R.layout.activity_input, null);
        dialog.setView(registerWindow);

        EditText name = findViewById(R.id.editName);
        EditText password = findViewById(R.id.editPassword);
        EditText email = findViewById(R.id.editEmail);

        dialog.setNegativeButton("Back", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });


        dialog.setPositiveButton("Sign In", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

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
    }

    private void showRegisterWindow() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("register");
        dialog.setMessage("input all data for registration");

        LayoutInflater inflater = LayoutInflater.from(this);
        View registerWindow = inflater.inflate(R.layout.activity_registration, null);
        dialog.setView(registerWindow);

        EditText name = findViewById(R.id.editName);
        EditText password = findViewById(R.id.editPassword);
        EditText email = findViewById(R.id.editEmail);

        dialog.setNegativeButton("Back", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });


        dialog.setPositiveButton("Registration", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                if (TextUtils.isEmpty(email.getText().toString())) {
                    Snackbar.make(root, "Input email", Snackbar.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(name.getText().toString())) {
                    Snackbar.make(root, "Input name", Snackbar.LENGTH_SHORT).show();
                    return;
                }
                if (password.getText().toString().length() < 5) {
                    Snackbar.make(root, "Input password ( password > 5 )", Snackbar.LENGTH_SHORT).show();
                    return;
                }

                auth.createUserWithEmailAndPassword(email.getText().toString(), password.getText().toString())
                        .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                            @Override
                            public void onSuccess(AuthResult authResult) {
                                User user = new User(name.getText().toString(),
                                        password.getText().toString(),
                                        email.getText().toString());

                                users.child(FirebaseAuth.getInstance().getCurrentUser().getUid()    )
                                        .setValue(user)
                                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                                            @Override
                                            public void onSuccess(Void unused) {
                                                Snackbar.make(root, "Created!", Snackbar.LENGTH_SHORT).show();
                                            }
                                        });
                            }
                        });
            }
        });
        dialog.show();
    }
    public void butClick(View v) {
        Intent intent = new Intent(this, WorkActivity.class);
        startActivity(intent);
    }

}*/

}
