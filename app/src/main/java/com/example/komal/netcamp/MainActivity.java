package com.example.komal.netcamp;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.strictmode.SqliteObjectLeakedViolation;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        e1=(EditText)findViewById(R.id.editText);-
        e2=(EditText)findViewById(R.id.editText2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Second.class);
                startActivity(i);
                //finish();

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase data=openOrCreateDatabase("gh",MODE_PRIVATE,null);
                data.execSQL("create table if not exists student (name varchar ,password varchar,email varchar,city varchar,phone varchar)");

                String s1= e1.getText().toString();
                String s2=e2.getText().toString();

                String s4="select * from student where name ='"+s1+"'and password='"+s2+"'";
                Cursor cursor;
                cursor=data.rawQuery(s4,null);
                if(cursor.getCount()>0)
                {
                    Intent j=new Intent(MainActivity.this,Third.class);
                    startActivity(j);
                   // finish();

                }
                else
                {
                    Toast.makeText(MainActivity.this, "regersterd first u havent regesterd", Toast.LENGTH_SHORT).show();
                }




            }
        });



    }
}
