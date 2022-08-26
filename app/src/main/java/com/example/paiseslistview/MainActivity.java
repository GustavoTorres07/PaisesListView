package com.example.paiseslistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;

    private String[] paises={"Argentina", "Chile","Paraguay","Bolivia","Peru","Ecuador","Brasil","Colombia","Venezuela","Uruguay"};

    private String[] habitantes={"4000000","17000000","65000000","10000000","30000000","14000000","18300000","44000000","29000000","35000000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView)findViewById(R.id.tv1);
        lv1=(ListView)findViewById(R.id.lv1);

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,paises);

        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                tv1.setText("La poblacion de "+lv1.getItemAtPosition(position)+ " es de: "+habitantes[position]);

            }
        });

    }
}