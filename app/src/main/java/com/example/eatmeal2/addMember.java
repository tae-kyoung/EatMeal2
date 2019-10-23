package com.example.eatmeal2;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class addMember extends AppCompatActivity {
    LinearLayout layout;
    Button add_Btn;
    TextView tv;
    View view;
    public static int textcounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_member);

        layout = (LinearLayout)findViewById(R.id.layout);
        add_Btn = (Button)findViewById(R.id.addBtn);
        tv = (TextView)findViewById(R.id.text_count_view);

        tv.setText(String.valueOf(textcounter));

        add_Btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                LinearLayout linearLayout = new LinearLayout(addMember.this);
                linearLayout.setOrientation(LinearLayout.HORIZONTAL);

                LinearLayout.LayoutParams linearLayoutParams = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT
                );

                EditText editText = new EditText(addMember.this);
                LinearLayout.LayoutParams edittextLP = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
                edittextLP.weight=1;
                editText.setEms(10);
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});



                Button bt = new Button(addMember.this);
                LinearLayout.LayoutParams buttonLP = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
                buttonLP.weight=1;




                linearLayout.addView(editText,edittextLP);
                linearLayout.addView(bt,buttonLP);


                layout.addView(linearLayout);
                //setContentView(layout);
                textcounter +=1;
                bt.setId(textcounter);
                /*
                view.findViewById(textcounter);
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ((ViewGroup)view.getParent()).removeView(view);
                    }
                });
                */
                tv.setText(String.valueOf(textcounter));

            }
        });


    }
}
