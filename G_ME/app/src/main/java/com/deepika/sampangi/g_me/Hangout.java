package com.deepika.sampangi.g_me;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Locale;

public class Hangout extends AppCompatActivity {
    ListView listView;
    EditText editsearch;
    public String place;
    public String addr;
    Button mapbtn;

    private ArrayList<String> mItems;
    PopupMenu popupMenu;
    MenuInflater menuInflater;
    public Editable add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hangout);






        editsearch = (EditText)findViewById(R.id.editText1);
        listView = (ListView) findViewById(R.id.listView1);

        mItems = new ArrayList<String>();
        mItems.add("Abids");
        mItems.add("Alwal");
        mItems.add("Ameerpet");
        mItems.add("Anandbagh");
        mItems.add("A S Roa Nagar");
        mItems.add("Attapur");
        mItems.add("Bachupally");
        mItems.add("Banjara Hills");
        mItems.add("Barkatpura");
        mItems.add("Basheerbagh");
        mItems.add("Begumpet");
        mItems.add("Bowenpally");
        mItems.add("Charminar");
        mItems.add("Cyberabad");
        mItems.add("DSNR");
        mItems.add("ECIL");
        mItems.add("Film Nagar");
        mItems.add("Gachibowli");
        mItems.add("Gandhi Nagar");
        mItems.add("Gandipet");
        mItems.add("Ghatkesar");
        mItems.add("Golconda");
        mItems.add("Habsiguda");
        mItems.add("Hayathnagar");
        mItems.add("Himayath nagar");
        mItems.add("Hi Tech City");
        mItems.add("Jubilee Hills");
        mItems.add("Kachiguda");
        mItems.add("Khairatabad");
        mItems.add("Koti");
        mItems.add("Kompally");
        mItems.add("Kondapur");
        mItems.add("Kothapet");
        mItems.add("KPHB");
        mItems.add("Kukatpally");
        mItems.add("L B Nagar");
        mItems.add("Lakdikapul");
        mItems.add("Madhapur");
        mItems.add("Malakpet");
        mItems.add("Malkajgiri");
        mItems.add("Mallapur");
        mItems.add("Manikonda");
        mItems.add("Marredpally");
        mItems.add("Masab Tank");
        mItems.add("Mehdipatnam");
        mItems.add("Mettuguda");
        mItems.add("Miyapur");
        mItems.add("Nallakunta");
        mItems.add("Narayanaguda");
        mItems.add("Necklace Road");
        mItems.add("Nizampet");
        mItems.add("Panjagutta");
        mItems.add("Safilguda");
        mItems.add("Sainikpuri");
        mItems.add("Secunderabad");
        mItems.add("Shaikpet");
        mItems.add("Shamirpet");
        mItems.add("Shamshabad");
        mItems.add("Somajiguda");
        mItems.add("Srinagar Colony");
        mItems.add("Tank Bund");
        mItems.add("Tarnaka");
        mItems.add("Tolichowki");
        mItems.add("Uppal");

        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mItems));


        listView.setAdapter(new ArrayAdapter<String>(Hangout.this, android.R.layout.simple_list_item_1, android.R.id.text1, mItems));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg70, int position, long arg10) {



               // place = mItems.get(position);
                switch (position) {
                    case 0:

                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu_hangout);

                        method();
                        break;

                    case 1:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu1);

                        method();
                        break;


                    case 2:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu2);

                        method();
                        break;

                    case 3:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu3);

                        method();
                        break;

                    case 4:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu4);

                        method();
                        break;


                    case 5:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu5);

                        method();
                        break;


                    case 6:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu6);

                        method();
                        break;


                    case 7:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu7);

                        method();
                        break;


                    case 8:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu8);

                        method();
                        break;


                    case 9:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu9);

                        method();
                        break;


                    case 10:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu10);

                        method();
                        break;


                    case 11:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu11);

                        method();
                        break;


                    case 12:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu12);

                        method();
                        break;


                    case 13:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu13);

                        method();
                        break;


                    case 14:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu14);

                        method();
                        break;


                    case 15:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu15);

                        method();
                        break;


                    case 16:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu16);

                        method();
                        break;


                    case 17:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu17);

                        method();
                        break;


                    case 18:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu18);

                        method();
                        break;


                    case 19:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu19);

                        method();
                        break;


                    case 20:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu20);

                        method();
                        break;


                    case 21:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu21);

                        method();
                        break;


                    case 22:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu22);

                        method();
                        break;


                    case 23:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu23);

                        method();
                        break;

                    case 24:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu24);

                        method();
                        break;


                    case 25:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu25);

                        method();
                        break;


                    case 26:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu26);

                        method();
                        break;


                    case 27:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu27);

                        method();
                        break;


                    case 28:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu28);

                        method();
                        break;


                    case 29:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu29);

                        method();
                        break;


                    case 30:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu30);

                        method();
                        break;


                    case 31:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu31);

                        method();
                        break;


                    case 32:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu32);

                        method();
                        break;

                    case 33:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu33);

                        method();
                        break;


                    case 34:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu34);

                        method();
                        break;

                    case 35:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu35);

                        method();
                        break;

                    case 36:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu36);

                        method();
                        break;


                    case 37:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu37);

                        method();
                        break;


                    case 38:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu38);

                        method();
                        break;


                    case 39:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu39);

                        method();
                        break;


                    case 40:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu40);

                        method();
                        break;


                    case 41:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu41);

                        method();
                        break;


                    case 42:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu42);

                        method();
                        break;


                    case 43:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu43);

                        method();
                        break;


                    case 44:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu44);

                        method();
                        break;


                    case 45:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu45);

                        method();
                        break;


                    case 46:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu46);

                        method();
                        break;


                    case 47:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu47);

                        method();
                        break;


                    case 48:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu48);

                        method();
                        break;


                    case 49:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu49);

                        method();
                        break;


                    case 50:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu50);

                        method();
                        break;


                    case 51:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu51);

                        method();
                        break;


                    case 52:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu52);

                        method();
                        break;


                    case 53:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu53);

                        method();
                        break;


                    case 54:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu54);

                        method();
                        break;


                    case 55:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu55);

                        method();
                        break;

                    case 56:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu56);

                        method();
                        break;


                    case 57:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu57);

                        method();
                        break;


                    case 58:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu58);

                        method();
                        break;


                    case 59:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu59);

                        method();
                        break;


                    case 60:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu60);

                        method();
                        break;


                    case 61:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu61);

                        method();
                        break;


                    case 62:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu62);

                        method();
                        break;


                    case 63:
                        popupMenu = new PopupMenu(getApplicationContext(), arg0);

                        menuInflater = popupMenu.getMenuInflater();

                        popupMenu.inflate(R.menu.menu63);

                        method();
                        break;


                }

            }
        });



        editsearch.addTextChangedListener(new TextWatcher() {
            //Event when changed word on EditTex
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                ArrayList<String> temp = new ArrayList<String>();
                int textlength = editsearch.getText().length();
                temp.clear();
                for (int i = 0; i < mItems.size(); i++) {
                    if (textlength <= mItems.get(i).length()) {
                        if (editsearch.getText().toString().equalsIgnoreCase(
                                (String)
                                        mItems.get(i).subSequence(0,
                                                textlength))) {
                            temp.add(mItems.get(i));
                        }
                    }
                }
                listView.setAdapter(new ArrayAdapter<String>(Hangout.this, android.R.layout.simple_list_item_1, temp));


            }


            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hangout, menu);
        return true;
    }




    void method()
    {
        popupMenu.show();

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(getApplicationContext(), item.toString(), Toast.LENGTH_SHORT).show();
                addr=item.toString();
                return false;
            }


        });
    }


    public void browse(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in/maps/search/" + addr + "/-/" + place + "/"));
        startActivity(browserIntent);
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



