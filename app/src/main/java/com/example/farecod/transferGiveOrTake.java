package com.example.farecod;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class transferGiveOrTake extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_give_or_take);

        Button give= (Button) findViewById(R.id.give);
        give.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(transferGiveOrTake.this, transferGive.class));
            }
        }
    }
}
