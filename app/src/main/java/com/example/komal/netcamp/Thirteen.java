package com.example.komal.netcamp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Thirteen extends AppCompatActivity {
    Button b;
    EditText e1;
    TextView t1;
    WebView w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteen);
        b=(Button)findViewById(R.id.button25);
        t1=(TextView)findViewById(R.id.textView7) ;
        e1=(EditText)findViewById(R.id.editText10);
        w=(WebView)findViewById(R.id.webView) ;
       // b2=(Button)findViewById(R.id.button26);
        String s=Integer.toString(Nineth.score);

        t1.setText("your score is"+s);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=e1.getText().toString();
                w.loadUrl(s);


            }
        });


    }
}
