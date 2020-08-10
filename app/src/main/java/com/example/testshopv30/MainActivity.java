package com.example.testshopv30;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager = null;
    List<Fragment> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TabLayout tabLayout = findViewById(R.id.TabBar);
        TabItem hotfood_tabitem=findViewById(R.id.HotFood_TabItem);
        TabItem snack_tabitem=findViewById(R.id.Snack_TabItem);
        TabItem drink_tabitem=findViewById(R.id.Drink_TabItem);
        TabItem dessert_tabitem=findViewById(R.id.Dessert_TabItem);
        final ViewPager viewPager = findViewById(R.id.ViewPager);

        Hotfood_Fragment hotfood= new Hotfood_Fragment();
        Snack_Fragment snack=new Snack_Fragment();
        Drink_Fragment drink=new Drink_Fragment();
        Dessert_Fragment dessert = new Dessert_Fragment();


        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());

        viewPager.setAdapter(pagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
