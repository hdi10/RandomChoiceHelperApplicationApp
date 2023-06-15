package com.example.randomchoicehelperapplicationapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;


import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

public class FindTheBestChoice extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_the_best_choice);

        tabLayout =findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);

        tabLayout.setupWithViewPager(viewPager);

        Log.d("","huier");

        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new Fragment1(),"BCKLG");
        vpAdapter.addFragment(new Fragment2(),"In Progress");
        vpAdapter.addFragment(new Fragment3(),"Done");
        viewPager.setAdapter(vpAdapter);

    }
}