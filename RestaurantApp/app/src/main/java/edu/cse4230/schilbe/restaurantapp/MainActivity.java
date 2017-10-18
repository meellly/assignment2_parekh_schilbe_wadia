package edu.cse4230.schilbe.restaurantapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button s1 = null, s2 = null, s3 = null, s4 = null, s5 = null, s6 = null, s7 = null, s8 = null, s9 = null, s10 = null, s11 = null, s12 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        s1 = (Button) findViewById(R.id.s1);
        s2 = (Button) findViewById(R.id.s2);
        s3 = (Button) findViewById(R.id.s3);
        s4 = (Button) findViewById(R.id.s4);
        s5 = (Button) findViewById(R.id.s5);
        s6 = (Button) findViewById(R.id.s6);
        s7 = (Button) findViewById(R.id.s7);
        s8 = (Button) findViewById(R.id.s8);
        s9 = (Button) findViewById(R.id.s9);
        s10 = (Button) findViewById(R.id.s10);
        s11 = (Button) findViewById(R.id.s11);
        s12 = (Button) findViewById(R.id.s12);

        // Button listener
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), LoadingPageActivity.class);
                startActivity(i);
            }
        });
        // Button listener
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), MainMenuActivity.class);
                startActivity(i);
            }
        });

        // Button listener
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), FoodMenuActivity.class);
                startActivity(i);
            }
        });

        // Button listener
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SaladListActivity.class);
                startActivity(i);
            }
        });

        // Button listener
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SaladPageActivity.class);
                startActivity(i);
            }
        });

        // Button listener
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), NewsListActivity.class);
                startActivity(i);
            }
        });

        // Button listener
        s7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), NewsOpenActivity.class);
                startActivity(i);
            }
        });

        // Button listener
        s8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), WineListActivity.class);
                startActivity(i);
            }
        });

        // Button listener
        s9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), WinePageActivity.class);
                startActivity(i);
            }
        });

        // Button listener
        s10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), BookingActivity.class);
                startActivity(i);
            }
        });

        // Button listener
        s11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), FeedbackActivity.class);
                startActivity(i);
            }
        });

        // Button listener
        s12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), ContactActivity.class);
                startActivity(i);
            }
        });

    }
}
