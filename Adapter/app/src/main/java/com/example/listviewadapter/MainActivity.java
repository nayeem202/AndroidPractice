package com.example.listviewadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //List view


    ListView listView;
    String[] mobile_types = {
      "Xiaomi", "Samsung Galaxy", "Vivo" , "Walton", "IPhone", "hauwei"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =  findViewById(R.id.listviewy);

        //Array Adapter
        ArrayAdapter adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                mobile_types


        );

        listView.setAdapter(adapter);

    }
}