package com.example.komal.netcamp;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Second extends AppCompatActivity {
    Button b4;
    EditText e3,e4,e5,e6,e7;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        e3=(EditText)findViewById(R.id.editText3);
        e4=(EditText)findViewById(R.id.editText4);
        e5=(EditText)findViewById(R.id.editText5);
        e6=(EditText)findViewById(R.id.editText6);
        e7=(EditText)findViewById(R.id.editText7);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s3 = e3.getText().toString();
                String s4 = e4.getText().toString();
                String s5 = e5.getText().toString();
                String s6 = e6.getText().toString();
                String s7 = e7.getText().toString();

                if (s3.equals("") || s4.equals("") || s5.equals("") || s6.equals("") || s7.equals("")) {
                    Toast.makeText(Second.this, "plz fill all", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    SQLiteDatabase data = openOrCreateDatabase("gh", MODE_PRIVATE, null);
                    data.execSQL("create table if not exists student (name varchar,password varchar,email varchar,city varchar,phone varchar)");
                    String s = "select * from student where name='"+s3+"' and password='"+s4+"'";
                    Cursor c = data.rawQuery(s, null);
                    if (c.getCount() > 0) {
                    Toast.makeText(Second.this, "plese choose another usename or password", Toast.LENGTH_SHORT).show();
                    }
                    else {
                    data.execSQL("insert into student values ('"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"')");
                    Toast.makeText(Second.this, "u have regesterd correctly u can login now", Toast.LENGTH_SHORT).show();
                }
            }

            }
        });



    }
}
