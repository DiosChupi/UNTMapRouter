package com.example.untmaprouter;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Button;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

public class Navigation extends AppCompatActivity {
    Button aboutButton;
    private Button calculateActivity1;
    private String srcInput;
    private String destInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_navigation);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Button logic when clicked goes to About Us activity/page/screen
        aboutButton = findViewById(R.id.aboutButton);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Navigation.this, AboutUs.class);
                startActivity(intent);
            }
        });

        // Get picked src and destination and send to next page
        // Button logic when clicked on goes to MapSolution activity/page/screen
        MaterialAutoCompleteTextView sendSrcToNext = findViewById(R.id.inputTV);
        MaterialAutoCompleteTextView sendDestToNext = findViewById(R.id.inputTV2);

        calculateActivity1 = findViewById(R.id.Calculate);

        calculateActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Important: sends users picked data and convert to string
                srcInput = sendSrcToNext.getText().toString();
                destInput = sendDestToNext.getText().toString();

                // Intent is used to pass data and move from one activity to another
                Intent intent = new Intent(Navigation.this, MapSolution.class);
                intent.putExtra("keysrc", srcInput);
                intent.putExtra("keydest", destInput);
                startActivity(intent);
            }
        });
    }
}