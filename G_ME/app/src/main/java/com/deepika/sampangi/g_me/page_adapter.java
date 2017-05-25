package com.deepika.sampangi.g_me;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.Locale;
public class page_adapter extends FragmentPagerAdapter {
    public page_adapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                goalTab1 t1 = new goalTab1();
                return t1;
            case 1:
                goalTab2 t2 = new goalTab2();
                return t2;
            case 2:
                goalTab3 t3 = new goalTab3();
                return t3;

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }//set the number of tabs

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return "Motivate yourself";
            case 1:

                return "follow the steps";
            case 2:

                return "Get set go";

        }
        return null;
    }



}


