package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the first_activity.xml layout file
        setContentView(R.layout.first_activity);

        // Find the View that shows the image from the first page of the application
        ImageView imageFirstScreen = (ImageView) findViewById(R.id.image_first_screen);

        // Set a click listener on that View
        imageFirstScreen.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the MainActivity
            public void onClick(View view) {
                // Start the MainActivity
                Intent imageFirstScreenIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(imageFirstScreenIntent);
            }
        });
    }
}
