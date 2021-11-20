package com.example.textsearchingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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
                new AlertDialog.Builder(MainActivity2.this)
                        .setTitle("Delete Entry")
                        .setMessage("Are you sure you want to delete it?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                stringArrayList.remove(position);
                                Toast.makeText(getApplicationContext(), "Deleted", Toast.LENGTH_SHORT).show();
                                adapter.notifyDataSetChanged();
                            }
                        })
                        .setNegativeButton(android.R.string.no, null)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();
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