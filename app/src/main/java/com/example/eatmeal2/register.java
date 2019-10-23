package com.example.eatmeal2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity {
    EditText id_et,pw_et,pw_right_et;
    Button logincheck, new_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        id_et = (EditText)findViewById(R.id.id);
        pw_et = (EditText)findViewById(R.id.password);
        pw_right_et = (EditText)findViewById(R.id.password_check);
        logincheck = (Button)findViewById(R.id.logcheck);
        new_register = (Button)findViewById(R.id.create_tableBtn_register);



        logincheck.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

            }
        });

        new_register.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),addMember.class);
                startActivity(intent);
                finish();

            }
        });
    }
}
