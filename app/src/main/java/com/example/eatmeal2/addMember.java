package com.example.eatmeal2;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class addMember extends AppCompatActivity {
    LinearLayout layout = new LinearLayout(this);
    Button add_Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_member);

        layout = (LinearLayout)findViewById(R.id.layout);
        add_Btn = (Button)findViewById(R.id.addBtn);

        add_Btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                ;
            }
        });


    }
}
