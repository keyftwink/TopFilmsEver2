package com.example.shpargalka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView filmList = findViewById(R.id.filmList);
        String[] film = getResources().getStringArray(R.array.Films);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, film);
        filmList.setAdapter(adapter);
        filmList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                String selectedItem = (String)parent.getItemAtPosition(position);
                createIntent(selectedItem);
            }
        });

    }
    private void createIntent(String item){
        Intent intent = new Intent(this, window_in.class);
        intent.putExtra("film", item.toString());
        startActivity(intent);
    }
}