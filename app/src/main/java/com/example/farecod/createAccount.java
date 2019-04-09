package com.example.farecod;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class createAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        EditText userName = (EditText) findViewById(R.id.userName);
        userName.setInputType(InputType.TYPE_CLASS_TEXT);
        String name=userName.getText().toString();
        Button yourButton = (Button) findViewById(R.id.createAccountBtn2);

        yourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(createAccount.this, mainPage.class));

            }
        });
    }
}
