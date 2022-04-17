package com.example.shpargalka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class window_in extends AppCompatActivity {
    String film;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window_in);
        Intent intent = getIntent();
        film = intent.getStringExtra("film");

        switch (film){
            case("Назови меня своим именем"):
                TextView text = findViewById(R.id.text);
                text.setText(getResources().getString(R.string.Film1));
                break;
            case("Горбатая гора"):
                text = findViewById(R.id.text);
                text.setText(getResources().getString(R.string.Film2));
                break;
            case("С любовью, Саймон"):
                text = findViewById(R.id.text);
                text.setText(getResources().getString(R.string.Film3));
                break;
            case("Мальчики"):
                text = findViewById(R.id.text);
                text.setText(getResources().getString(R.string.Film4));
                break;
            case("Близкие друзья"):
                text = findViewById(R.id.text);
                text.setText(getResources().getString(R.string.Film5));
                break;
        }
    }
}