package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button pressButton;
        pressButton=(Button)findViewById(R.id.button);

        final ImageView ball=(ImageView)findViewById(R.id.ball);
        final int[] ballArray={R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};

        pressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomball=new Random();
                int number=randomball.nextInt(5);
                Log.d("Ball","Generated result is: "+number);
                ball.setImageResource(ballArray[number]);
            }
        });
    }
}
