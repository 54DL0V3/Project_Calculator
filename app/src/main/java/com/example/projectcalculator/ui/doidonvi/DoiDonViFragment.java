package com.example.projectcalculator.ui.doidonvi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.projectcalculator.R;
import com.google.android.material.tabs.TabLayout;

public class DoiDonViFragment extends Fragment {
    private View rootView;
    private ViewPager vpDoiDonVi;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_doidonvi,container,false);
        vpDoiDonVi = rootView.findViewById(R.id.vp_tablayout);
        vpDoiDonVi.setAdapter(new AdapterTabDonVi(getFragmentManager()));
        TabLayout tabLayout = rootView.findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(vpDoiDonVi);
        return rootView;
    }
}