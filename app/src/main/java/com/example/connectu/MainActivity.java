package com.example.connectu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageButton hamburgerButton;
    private ImageButton profileButton;
    private Button loveButton;
    private Button rejectButton;
    private Button reloadButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        hamburgerButton = findViewById(R.id.hamburgerButton);
        profileButton = findViewById(R.id.profileButton);
        loveButton = findViewById(R.id.loveButton);
        rejectButton = findViewById(R.id.rejectButton);
        reloadButton = findViewById(R.id.reloadButton);

        // Set click listeners for buttons
        hamburgerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click on hamburger button
                Toast.makeText(MainActivity.this, "Hamburger Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click on profile button
                Toast.makeText(MainActivity.this, "Profile Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        loveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click on love button
                Toast.makeText(MainActivity.this, "Love Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        rejectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click on reject button
                Toast.makeText(MainActivity.this, "Reject Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        reloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click on reload button
                Toast.makeText(MainActivity.this, "Reload Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
