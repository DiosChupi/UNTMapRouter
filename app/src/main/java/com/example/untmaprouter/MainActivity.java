package com.example.untmaprouter;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;               // Du was here
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;                           // Du was here
import android.widget.Button;                       // Du was here

public class MainActivity extends AppCompatActivity {
    Button startButton;             // Right click to import and use Button class

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Start Button logic when clicked on goes to Navigation activity/page/screen
        startButton = findViewById(R.id.startButton);   // Extract from xml and initialize
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Navigation.class);
                startActivity(intent);
                finish();                               // prevents back button
            }
        });
    }
}