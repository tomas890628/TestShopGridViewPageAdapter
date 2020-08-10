package com.example.testshopv30;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    private  int NumofTabs;


    public PagerAdapter(FragmentManager fm ,int NumofTabs){

        super(fm);

        this.NumofTabs = NumofTabs;
    }
//    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                return  new Hotfood_Fragment();
            case 1:
                return  new Snack_Fragment();
            case 2:
                return  new Drink_Fragment();
            case 3:
                return  new Dessert_Fragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {



        return NumofTabs;
    }
}
