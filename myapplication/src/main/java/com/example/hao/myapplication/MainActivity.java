package com.example.hao.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {
    private LinearLayout ll_drawer;
    private DrawerLayout drawer_layout;
    private ViewPager viewPager;
    private List<Fragment> LSITS = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ll_drawer = (LinearLayout) findViewById(R.id.ll_drawer);
//        drawer_layout = (DrawerLayout) findViewById(R.id.drawer_layout);
//        viewPager = (ViewPager) findViewById(R.id.viewpage);
//        LSITS.add(new BlankFragment());
//        LSITS.add(new BlankFragment());
//        LSITS.add(new BlankFragment());
//        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager()));

//        Log.e()
    }

    class PageAdapter extends FragmentPagerAdapter {

        public PageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return LSITS.get(position);
        }


        @Override
        public int getCount() {
            return LSITS.size();
        }
    }
}
