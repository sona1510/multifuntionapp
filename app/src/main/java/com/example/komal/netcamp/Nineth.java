package com.example.komal.netcamp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Nineth extends AppCompatActivity {
    Button b21;
    RadioButton r1,r2,r3,r4;
    static int score=0;
    TextView t1,t2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nineth);
        b21=(Button)findViewById(R.id.button21);

        r1=(RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton2);
        r3=(RadioButton)findViewById(R.id.radioButton3);
        r4=(RadioButton)findViewById(R.id.radioButton4);
        t1=(TextView)findViewById(R.id.textView2);
        t2=(TextView)findViewById(R.id.textView3);

        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score =0;
                if(r1.isChecked())
                {
                    ++score;

                }
                else
                {
                    --score;
                }
                Intent j=new Intent(Nineth.this,Tenth.class);
                startActivity(j);
                finish();
            }
        });





    }
    }

