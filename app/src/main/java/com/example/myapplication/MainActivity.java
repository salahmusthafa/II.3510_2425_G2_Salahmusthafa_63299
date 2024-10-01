package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;  // Import for color changes

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;
    private TextView textView;
    private Button buttonColor;  // Button to change color
    private Button buttonSize;   // Button to change size

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Linking UI components
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        buttonColor = findViewById(R.id.buttonColor);  // Linking color button
        buttonSize = findViewById(R.id.buttonSize);    // Linking size button

        // Set button click listener to update TextView
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editText.getText().toString();
                textView.setText(inputText);
            }
        });

        // Set button click listener to change TextView color
        buttonColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the color to red
                textView.setTextColor(Color.RED);
            }
        });

        // Set button click listener to change TextView size
        buttonSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Increase the text size to 24sp
                textView.setTextSize(24);  // Change to your desired size
            }
        });
    }
}