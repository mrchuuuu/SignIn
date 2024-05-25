package com.example.signinapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CreateAccountActivity extends AppCompatActivity {

    private EditText getUsername;
    private EditText getFirstName;
    private EditText getMiddleName;
    private EditText getLastName;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        getUsername = findViewById(R.id.getUsername);
        getFirstName = findViewById(R.id.getFirstName);
        getMiddleName = findViewById(R.id.getMiddleName);
        getLastName = findViewById(R.id.getLastName);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(v -> {
            String username = getUsername.getText().toString();
            String firstName = getFirstName.getText().toString();
            String middleName = getMiddleName.getText().toString();
            String lastName = getLastName.getText().toString();

            if (firstName.isEmpty() || lastName.isEmpty() ) {
                Toast.makeText(CreateAccountActivity.this, "Please fill out all required fields", Toast.LENGTH_SHORT).show();
            } else {
                // Here, you would typically save the new account information to a database
                Toast.makeText(CreateAccountActivity.this, "Account created successfully!", Toast.LENGTH_SHORT).show();
                // Close the activity and return to the main activity
                finish();
            }
        });
    }
}
