package com.example.mark.simpleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtView = (TextView) findViewById(R.id.text1);
                txtView.setText("Marcus Barnes");
                txtView.setTextColor(0xFF000000);
            }

        });

        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtView = (TextView) findViewById(R.id.text1);
                txtView.setText("Hello World!!");
                txtView.setTextColor(0xFF669900);

            }

        });

        Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtView = (TextView) findViewById(R.id.text1);
                EditText nText = (EditText) findViewById(R.id.nameText);
                String message = nText.getText().toString();
                txtView.setText(message);
                txtView.setTextColor(0xFFFF4444);


            }

        });


    }

}
