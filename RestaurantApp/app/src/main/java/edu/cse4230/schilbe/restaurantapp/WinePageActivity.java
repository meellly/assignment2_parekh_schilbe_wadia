package edu.cse4230.schilbe.restaurantapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class WinePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wine_page);

        //get the action bar and display it
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.action_bar_cart);

        //remove the padding surrounding the action bar
        Toolbar parent = (Toolbar) getSupportActionBar().getCustomView().getParent();
        parent.setContentInsetsAbsolute(0, 0);

        //set the action bar text
        View myView = getSupportActionBar().getCustomView().findViewById(R.id.txtActionBar);
        TextView myTextView = myView.findViewById(R.id.txtActionBar);
        myTextView.setText("Wine name is here");
    }
}
