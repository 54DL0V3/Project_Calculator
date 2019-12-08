package com.example.projectcalculator.ui.doidonvi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.transition.FragmentTransitionSupport;

public class AdapterTabDonVi extends FragmentStatePagerAdapter{
    private String ListTab[] = {"Chieu dai","Bo nho"," Thoi gian","Toc do"};
    private FragmentMemory memory;
    private FragmentChieuDai chieuDai;
    private FragmentTime time;
    private FragmentTocDo tocDo;


    public AdapterTabDonVi(@NonNull FragmentManager fm) {
        super(fm);
        chieuDai= new FragmentChieuDai();
        time = new FragmentTime();
        tocDo = new FragmentTocDo();
        memory = new FragmentMemory();
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0) return chieuDai;
        else if ( position==1 )return memory;
        else if (position== 2) return time;
        else if(position==3 )return  tocDo;
        else{
            //to do something
        }
        return null;
    }

    @Override
    public int getCount() {
        return ListTab.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return ListTab[position];
    }
}
