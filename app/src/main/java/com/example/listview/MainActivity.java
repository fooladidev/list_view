package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    Button button1;
    ListView listView1;
    ArrayList<String> names ;
    ArrayAdapter<String> adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.ed1);
        listView1=findViewById(R.id.lv1);
        button1=findViewById(R.id.btn1);

        names = new ArrayList<>();


        names.add("ali");
        names.add("hss");
        names.add("mmd");
        names.add("fld");
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText1.getText().toString();
                names.add(name);
                adapter.notifyDataSetChanged();

            }
        });

        adapter= new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,names);
        listView1.setAdapter(adapter);



    }

}