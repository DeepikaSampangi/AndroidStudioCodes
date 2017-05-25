package com.deepika.sampangi.g_me;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Lenovo on 25/02/2016.
 */
public class goalTab3 extends Fragment {

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.goaltab3,container,false);
        return view;
    }
    public void motyt(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=CIaRiqSej00&list=PL9XDPqN8lxBphPe-jqlu6cRejGpd54oqA"));
        startActivity(browserIntent);
    }

    public void ted(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=DudfBIxw6do&list=PLB1E709C7689FE1FF"));
        startActivity(browserIntent);
    }

    public void mot(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://inspirationalquotes.facts.co/mostinspirationalquotes.php"));
        startActivity(browserIntent);
    }
}
