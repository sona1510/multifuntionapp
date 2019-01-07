package com.example.komal.netcamp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Twele extends AppCompatActivity {
    Button b22;
    RadioButton r1,r2,r3,r4;
    TextView t1;
    static int k=Nineth.score;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twele);
        b22=(Button)findViewById(R.id.button24);
        r1=(RadioButton)findViewById(R.id.radioButton13);
        r2=(RadioButton)findViewById(R.id.radioButton14);
        r3=(RadioButton)findViewById(R.id.radioButton15);
        r4=(RadioButton)findViewById(R.id.radioButton16);
        t1=(TextView)findViewById(R.id.textView5);
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b22.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Nineth.score=k;

                        if(r4.isChecked())
                        {
                            Nineth.score++;

                        }
                        else
                        {
                            Nineth.score--;
                        }
                        Intent j=new Intent(Twele.this,Thirteen.class);
                        startActivity(j);
                        finish();
                    }
                });
            }
        });
    }
}

