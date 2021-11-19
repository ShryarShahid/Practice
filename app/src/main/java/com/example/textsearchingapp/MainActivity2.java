package com.example.textsearchingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    Button btn;
    TextView txt;

    ListView list;
    ArrayList<String> stringArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn = findViewById(R.id.button3);
        txt = findViewById(R.id.textView);
        list = findViewById(R.id.listView);

        stringArrayList.add("Bushra");
        stringArrayList.add("Mubashir");
        stringArrayList.add("Samia");
        stringArrayList.add("Kinza");
        stringArrayList.add("Zunaira");
        stringArrayList.add("Muzzamil");

        ArrayAdapter adapter = new ArrayAdapter <String>(this, android.R.layout.simple_list_item_1, stringArrayList);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                stringArrayList.remove(position);
                adapter.notifyDataSetChanged();
            }
        });

        Intent intent = getIntent();
        String recTxt= intent.getStringExtra("Message");
        txt.setText(recTxt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}