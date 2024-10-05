package com.example.hellotoast;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // Charge le layout

    }

    // Méthode pour afficher le toast
    public void displayMessage(View view) {
        Toast.makeText(MainActivity.this, "Hello Toast", Toast.LENGTH_LONG).show();
    }

    // Méthode pour incrémenter le compteur
    public void increment(View view) {
        TextView output = findViewById(R.id.DisplayedValue);
        if (output != null) {
            try {
                int currentValue = Integer.parseInt(output.getText().toString());
                output.setText(String.valueOf(++currentValue));
            } catch (NumberFormatException e) {
                output.setText(String.valueOf(0));
            }
        }
    }
}
