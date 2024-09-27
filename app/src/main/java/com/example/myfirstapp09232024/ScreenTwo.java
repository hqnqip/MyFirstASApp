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
    //Make sure to import as widgets beforehand.
    //Ex: import android.widget.Button; OR import android.widget.ImageView;


    //These are initializing the variables.
    //You take the widgets and turn them into Java-oriented objects,
    //so that they can be used in Java.
    //ImageView imageView;
    //Button revealOne;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //This is just establishing the screen.
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_screen_two);

        //??? : I am not sure what this is.
        //Maybe establishing the basic GUI of the screen, like scroll bars, etc..
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //This is assigning the widgets to the respective variables.
        ImageView oneAnimal = findViewById(R.id.oneAnimal);
        Button oneBtn = findViewById(R.id.oneBtn);
        TextView oneCap = findViewById(R.id.oneCap);

        ImageView twoAnimal = findViewById(R.id.twoAnimal);
        Button twoBtn = findViewById(R.id.twoBtn);
        TextView twoCap = findViewById(R.id.twoCap);

        ImageView threeAnimal = findViewById(R.id.threeAnimal);
        Button threeBtn = findViewById(R.id.threeBtn);
        TextView threeCap = findViewById(R.id.threeCap);

        //This is to assign a function to the button.
        //Have to override onClick() to make a custom function for the button.
        //setOnClickListener --> Waits for User Input.
        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oneAnimal.setImageResource(R.drawable.dog);
                oneCap.setText("1st Place : Dog");
                Log.i("Reveal", "1st Animal is Revealed!");
                Toast.makeText(ScreenTwo.this, "Woof woof!", Toast.LENGTH_SHORT).show();
            }
        });

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twoAnimal.setImageResource(R.drawable.cat);
                twoCap.setText("2nd Place : Cat");
                Log.i("Reveal", "2nd Animal is Revealed!");
                Toast.makeText(ScreenTwo.this, "Meooowww!", Toast.LENGTH_SHORT).show();
            }
        });

        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                threeAnimal.setImageResource(R.drawable.chicken);
                threeCap.setText("3rd Place : Chicken");
                Log.i("Reveal", "3rd Animal is Revealed!");
                Toast.makeText(ScreenTwo.this, "Bawk-! Wait! What happened to our eagle!?", Toast.LENGTH_SHORT).show();
            }
        });

        /*
      //Supposed to be an OnEvent kind of thing.
      //Assigns the button a role when clicked on.
      revealOne.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view)
          //The "View view" refers to itself. Remember, void means the method is called on itself.
          {
              //Basically, a console.log() thing.
              Log.i("MyFirstApp", "You clicked!!!!!!");
              //Feedback to users!
              Toast.makeText(ScreenTwo.this, "Yay! Good work!", Toast.LENGTH_LONG).show();
              //The R stands for "Resources."
              //drawable refers to the folder of images.
              imageView.setImageResource(R.drawable.dog);
          }
      }); //This is interesting. This is like the OnEvents.
      */

    }

    /*
      Supposed to be an OnEvent kind of thing. Did NOT work.
      public void revealOneHandler(View v)
      {
          Toast.makeText(this, "Ta-da! Is your guess correct?", Toast.LENGTH_LONG).show();
          ImageView i = findViewById(R.id.animalOneImg);
          i.setImageResource(R.drawable.dog);
      }
    */
}

//Cat Image: https://upload.wikimedia.org/wikipedia/commons/c/c7/Tabby_cat_with_blue_eyes-3336579.jpg
//Dog Image: https://images.pexels.com/photos/1108099/pexels-photo-1108099.jpeg
//Chicken Image: https://upload.wikimedia.org/wikipedia/commons/f/f2/Feral_rooster_on_Kaua%CA%BBi.jpg