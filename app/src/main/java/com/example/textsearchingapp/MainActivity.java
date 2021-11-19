package com.example.textsearchingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txt, txt1;
    String store;
    Button btn, btn2;
    Text text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.textView1);
        txt1 = findViewById(R.id.textView2);
        btn = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);

                //Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                //intent.putExtra("Message", store);
                //startActivity(intent);

                //Intent intent = new Intent();
                //intent.setAction(Intent.ACTION_SEND);
                //intent.putExtra(Intent.EXTRA_TEXT, store);
                //intent.setType("text/plain");

                //Intent shareIntent = Intent.createChooser(intent, null);
                //startActivity(shareIntent);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                store = txt1.getText().toString();
                txt.setText(store);

            }
        });
    }
}