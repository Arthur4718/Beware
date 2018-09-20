package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button topButton, bottomButton;
    private TextView storyTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        topButton = (Button) findViewById(R.id.buttonTop);
        bottomButton = (Button) findViewById(R.id.buttonBottom);
        storyTextView = (TextView) findViewById(R.id.storyTextView);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}
