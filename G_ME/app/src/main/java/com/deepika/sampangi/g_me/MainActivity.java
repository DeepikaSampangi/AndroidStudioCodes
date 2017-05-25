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

public class MainActivity extends AppCompatActivity {
ImageButton hbtn,rbtn,ebtn,playfulbtn,angrybtn,sadbtn;
    Button abtbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        hbtn = (ImageButton) findViewById(R.id.hbtn);
        hbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, happy.class);
                startActivity(intent);
            }
        });


        ebtn = (ImageButton) findViewById(R.id.ebtn);
        ebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, exhausted.class);
                startActivity(intent);
            }
        });


        rbtn = (ImageButton) findViewById(R.id.rbtn);
        rbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, relaxed.class);
                startActivity(intent);
            }
        });


        playfulbtn = (ImageButton) findViewById(R.id.playfulbtn);
        playfulbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, playfulclass.class);
                startActivity(intent);
            }
        });



        angrybtn = (ImageButton) findViewById(R.id.angrybtn);
        angrybtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, angryclass.class);
            startActivity(intent);
            }
        });


        sadbtn = (ImageButton) findViewById(R.id.sadbtn);
        sadbtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, sadclass.class);
            startActivity(intent);
        }
        });


        abtbtn = (Button) findViewById(R.id.abtbtn);
        abtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, About.class);
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
        Intent i = new Intent(MainActivity.this,About.class);
        startActivity(i);

    }

    /**
     * Launching new activity
     * */
    private void LocationFound() {
        Intent i = new Intent(MainActivity.this,MainActivity.class);
        startActivity(i);
    }



}