package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewId);


        String[] abbreViations = getResources().getStringArray(R.array.abbreviations);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,R.layout.sample_view,R.id.textViewId, abbreViations);
        listView.setAdapter(adapter);
    }
}