package com.example.tablayoutdemo;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import javax.xml.parsers.FactoryConfigurationError;

public class FragmentAdapter extends FragmentStatePagerAdapter {

   // private Context context;

    public FragmentAdapter(@NonNull FragmentManager fm, Context context, int tabCount) {
        super(fm);
     //   this.context = context;
        tabCount = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:
                return new ChatFragment();

            case 1:
                return new StatusFragment();

            case 2:
                return new CallFragment();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
