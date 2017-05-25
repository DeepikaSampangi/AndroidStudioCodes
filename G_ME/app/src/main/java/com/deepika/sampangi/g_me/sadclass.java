package com.deepika.sampangi.g_me;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class sadclass extends AppCompatActivity {

    ImageButton sadhelp,sadfactsbtn,hangoutbtn,musicbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sadclass);



        sadhelp = (ImageButton) findViewById(R.id.sadhelp);


        sadhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sadclass.this, sadhelpclass.class);
                startActivity(intent);
            }
        });

        sadfactsbtn = (ImageButton) findViewById(R.id.sadfactsbtn);


        sadfactsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sadclass.this, sadfactsclass.class);
                startActivity(intent);
            }
        });

        hangoutbtn = (ImageButton) findViewById(R.id.hangoutbtn);


        hangoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sadclass.this, Hangout.class);
                startActivity(intent);
            }
        });

        musicbtn = (ImageButton) findViewById(R.id.musicbtn);
        musicbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sadclass.this,Music.class);
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
