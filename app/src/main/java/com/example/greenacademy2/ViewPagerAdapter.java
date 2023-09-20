package com.example.greenacademy2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:return new Ssc_noticeFragment();
            case 1:return new Hsc_noticeFragment();
            case 2:return new Admission_noticeFragment();
            default:return new Ssc_noticeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
