package com.phuoctruong.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new PhoBienFragment();
            case 1:
                return new ThucUongFragment();
            case 2:
                return new DoAnFragment();
            default:
                return new PhoBienFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = "Nổi Bật";
                break;
            case 1:
                title = "Thức uống" ;
                break;
            case 2:
                title  = "Bánh Và Snack";
                break;
        }

        return title;
    }
}
