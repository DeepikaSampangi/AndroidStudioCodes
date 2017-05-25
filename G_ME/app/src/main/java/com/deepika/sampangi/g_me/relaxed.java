package com.deepika.sampangi.g_me;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class relaxed extends AppCompatActivity {
    ImageButton rbtn1,rbtn2,rbtn3,todo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relaxed);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rbtn1 = (ImageButton) findViewById(R.id.rbtn1);


        rbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(relaxed.this, Shopping.class);
                startActivity(intent);
            }
        });
        rbtn2 = (ImageButton) findViewById(R.id.rbtn2);


        rbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(relaxed.this, SetGoals.class);
                startActivity(intent);
            }
        });
        rbtn3 = (ImageButton) findViewById(R.id.rbtn3);


        rbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(relaxed.this, RIntrstFacts.class);
                startActivity(intent);
            }
        });

        todo = (ImageButton) findViewById(R.id.todo);


        todo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(relaxed.this, To_do.class);
                startActivity(intent);
            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main_actions, menu);

        return super.onCreateOptionsMenu(menu);
    }

    /**
     * On selecting action bar icons
     * */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Take appropriate action for each action item click
        switch (item.getItemId()) {

            case R.id.action_location_found:
                // location found
                LocationFound();
                return true;
            case R.id.action_search:
                // search action
                return true;
            case R.id.action_check_updates:
                // check for updates action
                OpenAbout();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void OpenAbout() {
        Intent i = new Intent(this,About.class);
        startActivity(i);

    }

    /**
     * Launching new activity
     * */
    private void LocationFound() {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

}
