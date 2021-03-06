package com.deepika.sampangi.g_me;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ViewFlipper;

public class SelfTime extends AppCompatActivity implements View.OnClickListener {
ViewFlipper flipH;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_time);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        flipH=(ViewFlipper) findViewById(R.id.flipperH);
        flipH.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        flipH.showNext();
    }
    public void youtube(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Y3QpubKy8_s"));
        startActivity(browserIntent);
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
