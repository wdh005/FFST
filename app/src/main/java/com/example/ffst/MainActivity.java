package com.example.ffst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;


import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private ContentPagerAdapter mContentPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (ViewPager) findViewById(R.id.vp_pager);
        mTabLayout = (TabLayout) findViewById(R.id.tl_tabs);

        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.home));
        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.note));
        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.camera));
        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.chat));
        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.user));
        mTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        mContentPagerAdapter = new ContentPagerAdapter(
                getSupportFragmentManager(), mTabLayout.getTabCount());
        mViewPager.setAdapter(mContentPagerAdapter);
        mViewPager.addOnPageChangeListener(
                new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
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
