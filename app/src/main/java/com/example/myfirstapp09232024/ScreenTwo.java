package com.example.myfirstapp09232024;

import android.os.Bundle;

import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class ScreenTwo extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_screen_two);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView oneAnimal = findViewById(R.id.oneAnimal);
        Button oneBtn = findViewById(R.id.oneBtn);
        TextView oneCap = findViewById(R.id.oneCap);

        ImageView twoAnimal = findViewById(R.id.twoAnimal);
        Button twoBtn = findViewById(R.id.twoBtn);
        TextView twoCap = findViewById(R.id.twoCap);

        ImageView threeAnimal = findViewById(R.id.threeAnimal);
        Button threeBtn = findViewById(R.id.threeBtn);
        TextView threeCap = findViewById(R.id.threeCap);

        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oneAnimal.setImageResource(R.drawable.dog);
                oneCap.setText("1st Place : Dog");
                Log.i("Reveal", "1st Animal is Revealed!");
                Toast.makeText(ScreenTwo.this, "Woof woof!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}