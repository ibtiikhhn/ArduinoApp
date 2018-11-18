package com.example.arduinoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button onbutton;
    Button offButton;
    Repository repository;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        repository = new Repository();

        onbutton = findViewById(R.id.onBT);
        offButton = findViewById(R.id.offBT);

        onbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                repository.onBulb();
            }
        });

        offButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                repository.offBulb();
            }
        });

    }
}
