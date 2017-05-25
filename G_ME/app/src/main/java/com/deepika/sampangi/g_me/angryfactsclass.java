package com.deepika.sampangi.g_me;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ViewFlipper;

public class angryfactsclass extends AppCompatActivity implements View.OnClickListener {
    ViewFlipper flippy3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angryfactsclass);



            flippy3 = (ViewFlipper)findViewById(R.id.viewFlipper3);
            flippy3.setOnClickListener(this);
        }

    public void onClick(View arg0)
    {
        flippy3.showNext();
    }




    public void browserfacts1(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dailygood.org/story/312/10-life-changing-facts-about-anger/"));
        startActivity(browserIntent);
    }

    public void browserfacts2(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tipsywriter.com/blog/6-interesting-facts-about-anger/"));
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