package com.example.komal.netcamp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class Eleven extends AppCompatActivity {
    Button b23;
    RadioButton r1,r2,r3,r4;
    TextView t1;
    static int k=Nineth.score;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleven);
        b23=(Button)findViewById(R.id.button23);
        r1=(RadioButton)findViewById(R.id.radioButton9);
        r2=(RadioButton)findViewById(R.id.radioButton10);
        r3=(RadioButton)findViewById(R.id.radioButton11);
        r4=(RadioButton)findViewById(R.id.radioButton12);
        t1=(TextView)findViewById(R.id.textView5);
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b23.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Nineth.score=k;

                        if(r2.isChecked())
                        {
                            Nineth.score++;

                        }
                        else
                        {
                            Nineth.score--;
                        }
                        Intent j=new Intent(Eleven.this,Twele.class);
                        startActivity(j);
                        finish();
                    }
                });
            }
        });

            }


}



