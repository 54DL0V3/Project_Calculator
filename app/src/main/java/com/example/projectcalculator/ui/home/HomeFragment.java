package com.example.projectcalculator.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.projectcalculator.MainActivity;
import com.example.projectcalculator.R;

public class HomeFragment extends Fragment {


    private TextView tvHistory;
    private Bundle bundle;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);

        tvHistory = root.findViewById(R.id.tv_history);
        bundle = getArguments();
        tvHistory.setText(bundle.getString("history"));
        return root;
    }
}