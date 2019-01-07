package com.example.komal.netcamp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fifth extends AppCompatActivity {
    Button b13,b14,b15,b16,b17;
    EditText e8,e9;
    TextView t1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        b13=(Button)findViewById(R.id.button13);
        b14=(Button)findViewById(R.id.button14);
        b15=(Button)findViewById(R.id.button15);
        b16=(Button)findViewById(R.id.button16);
        b17=(Button)findViewById(R.id.button17);
       // b18=(Button)findViewById(R.id.button18);
        e8=(EditText)findViewById(R.id.editText8);
        e9=(EditText)findViewById(R.id.editText9);
        t1=(TextView)findViewById(R.id.textView);



        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e8.getText().toString();
                String s2=e9.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1+f2;
                String s=Float.toString(f3);
                t1.setText(s);



            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e8.getText().toString();
                String s2=e9.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1-f2;
                String s=Float.toString(f3);
                t1.setText(s);



            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e8.getText().toString();
                String s2=e9.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1*f2;
                String s=Float.toString(f3);
                t1.setText(s);



            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e8.getText().toString();
                String s2=e9.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1/f2;
                String s=Float.toString(f3);
                t1.setText(s);



            }
        });

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              e8.setText("");
                e9.setText("");



            }
        });

    }
}
