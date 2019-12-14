package com.example.projectcalculator.ui.doidonvi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.projectcalculator.R;

import java.security.Key;

public class FragmentChieuDai extends Fragment {
    EditText edtMM,edtM,edtKM;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chieudai,container,false);
        edtMM = view.findViewById(R.id.edt_mm);
        edtM = view.findViewById(R.id.edt_m);
        edtKM = view.findViewById(R.id.edt_km);
        edtMM.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                if(keyEvent.getAction()== KeyEvent.ACTION_DOWN)
                {
                    if(i == KeyEvent.KEYCODE_0)
                    {
                        edtMM.append("0");
                        double milimet = Double.parseDouble(edtMM.getText().toString());
                        edtM.setText(milimet/1000+"");
                        edtKM.setText(milimet/1000000+"");
                    }
                    if(i == KeyEvent.KEYCODE_1)
                    {

                        edtMM.append("1");
                        double milimet = Double.parseDouble(edtMM.getText().toString());
                        edtM.setText(milimet/1000+"");
                        edtKM.setText(milimet/1000000+"");
                    }
                    if(i == KeyEvent.KEYCODE_2)
                    {

                        edtMM.append("2");
                        double milimet = Double.parseDouble(edtMM.getText().toString());
                        edtM.setText(milimet/1000+"");
                        edtKM.setText(milimet/1000000+"");
                    }
                    if(i == KeyEvent.KEYCODE_3)
                    {

                        edtMM.append("3");
                        double milimet = Double.parseDouble(edtMM.getText().toString());
                        edtM.setText(milimet/1000+"");
                        edtKM.setText(milimet/1000000+"");
                    }
                    if(i == KeyEvent.KEYCODE_4)
                    {
                        edtMM.append("0");
                        double milimet = Double.parseDouble(edtMM.getText().toString());
                        edtM.setText(milimet/1000+"");
                        edtKM.setText(milimet/1000000+"");
                    }
                    if(i == KeyEvent.KEYCODE_5)
                    {

                        edtMM.append("5");
                        double milimet = Double.parseDouble(edtMM.getText().toString());
                        edtM.setText(milimet/1000+"");
                        edtKM.setText(milimet/1000000+"");
                    }
                    if(i == KeyEvent.KEYCODE_6)
                    {

                        edtMM.append("6");
                        double milimet = Double.parseDouble(edtMM.getText().toString());
                        edtM.setText(milimet/1000+"");
                        edtKM.setText(milimet/1000000+"");
                    }
                    if(i == KeyEvent.KEYCODE_7)
                    {

                        edtMM.append("7");
                        double milimet = Double.parseDouble(edtMM.getText().toString());
                        edtM.setText(milimet/1000+"");
                        edtKM.setText(milimet/1000000+"");
                    }
                    if(i == KeyEvent.KEYCODE_8)
                    {

                        edtMM.append("8");
                        double milimet = Double.parseDouble(edtMM.getText().toString());
                        edtM.setText(milimet/1000+"");
                        edtKM.setText(milimet/1000000+"");
                    }
                    if(i == KeyEvent.KEYCODE_9)
                    {

                        edtMM.append("9");
                        double milimet = Double.parseDouble(edtMM.getText().toString());
                        edtM.setText(milimet/1000+"");
                        edtKM.setText(milimet/1000000+"");
                    }
                    return true;
                }
                return false;
            }
        });
        edtM.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                if(keyEvent.getAction()== KeyEvent.ACTION_DOWN)
                {
                    if(i == KeyEvent.KEYCODE_0)
                    {
                        edtM.append("0");
                        double met = Double.parseDouble(edtM.getText().toString());
                        edtMM.setText(met*1000+"");
                        edtKM.setText(met/1000+"");
                    }
                    if(i == KeyEvent.KEYCODE_1)
                    {

                        edtM.append("1");
                        double met = Double.parseDouble(edtM.getText().toString());
                        edtMM.setText(met*1000+"");
                        edtKM.setText(met/1000+"");
                    }
                    if(i == KeyEvent.KEYCODE_2)
                    {

                        edtM.append("2");
                        double met = Double.parseDouble(edtM.getText().toString());
                        edtMM.setText(met*1000+"");
                        edtKM.setText(met/1000+"");
                    }
                    if(i == KeyEvent.KEYCODE_3)
                    {
                        edtM.append("3");
                        double met = Double.parseDouble(edtM.getText().toString());
                        edtMM.setText(met*1000+"");
                        edtKM.setText(met/1000+"");
                    }
                    if(i == KeyEvent.KEYCODE_4)
                    {
                        edtM.append("4");
                        double met = Double.parseDouble(edtM.getText().toString());
                        edtMM.setText(met*1000+"");
                        edtKM.setText(met/1000+"");
                    }
                    if(i == KeyEvent.KEYCODE_5)
                    {
                        edtM.append("5");
                        double met = Double.parseDouble(edtM.getText().toString());
                        edtMM.setText(met*1000+"");
                        edtKM.setText(met/1000+"");
                    }
                    if(i == KeyEvent.KEYCODE_6)
                    {
                        edtMM.append("6");
                        double met = Double.parseDouble(edtM.getText().toString());
                        edtMM.setText(met*1000+"");
                        edtKM.setText(met/1000+"");
                    }
                    if(i == KeyEvent.KEYCODE_7)
                    {

                        edtM.append("7");
                        double met = Double.parseDouble(edtM.getText().toString());
                        edtMM.setText(met*1000+"");
                        edtKM.setText(met/1000+"");
                    }
                    if(i == KeyEvent.KEYCODE_8)
                    {

                        edtM.append("8");
                        double met = Double.parseDouble(edtM.getText().toString());
                        edtMM.setText(met*1000+"");
                        edtKM.setText(met/1000+"");
                    }
                    if(i == KeyEvent.KEYCODE_9)
                    {

                        edtMM.append("9");
                        double met = Double.parseDouble(edtMM.getText().toString());
                        edtM.setText(met/1000+"");
                        edtKM.setText(met/1000+"");
                    }
                    return true;
                }
                return false;
            }
        });
        edtKM.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                if(keyEvent.getAction()== KeyEvent.ACTION_DOWN)
                {
                    if(i == KeyEvent.KEYCODE_0)
                    {
                        edtKM.append("0");
                        double kilomet = Double.parseDouble(edtKM.getText().toString());
                        edtMM.setText(kilomet*1000000+"");
                        edtM.setText(kilomet*1000+"");
                    }
                    if(i == KeyEvent.KEYCODE_1)
                    {

                        edtKM.append("1");
                        double kilomet = Double.parseDouble(edtKM.getText().toString());
                        edtMM.setText(kilomet*1000000+"");
                        edtM.setText(kilomet*1000+"");
                    }
                    if(i == KeyEvent.KEYCODE_2)
                    {

                        edtKM.append("2");
                        double kilomet = Double.parseDouble(edtKM.getText().toString());
                        edtM.setText(kilomet*1000+"");
                        edtMM.setText(kilomet*1000000+"");
                    }
                    if(i == KeyEvent.KEYCODE_3)
                    {
                        edtKM.append("3");
                        double kilomet = Double.parseDouble(edtKM.getText().toString());
                        edtMM.setText(kilomet*1000000+"");
                        edtM.setText(kilomet*1000+"");
                    }
                    if(i == KeyEvent.KEYCODE_4)
                    {
                        edtKM.append("4");
                        double kilomet = Double.parseDouble(edtKM.getText().toString());
                        edtM.setText(kilomet*1000+"");
                        edtMM.setText(kilomet*1000000+"");
                    }
                    if(i == KeyEvent.KEYCODE_5)
                    {

                        edtKM.append("5");
                        double kilomet = Double.parseDouble(edtKM.getText().toString());
                        edtM.setText(kilomet*1000+"");
                        edtMM.setText(kilomet*1000000+"");
                    }
                    if(i == KeyEvent.KEYCODE_6)
                    {

                        edtKM.append("6");
                        double kilomet = Double.parseDouble(edtKM.getText().toString());
                        edtM.setText(kilomet*1000+"");
                        edtMM.setText(kilomet*1000000+"");
                    }
                    if(i == KeyEvent.KEYCODE_7)
                    {

                        edtKM.append("7");
                        double kilomet = Double.parseDouble(edtKM.getText().toString());
                        edtM.setText(kilomet*1000+"");
                        edtMM.setText(kilomet*1000000+"");
                    }
                    if(i == KeyEvent.KEYCODE_8)
                    {

                        edtKM.append("8");
                        double kilomet = Double.parseDouble(edtKM.getText().toString());
                        edtM.setText(kilomet*1000+"");
                        edtMM.setText(kilomet*1000000+"");
                    }
                    if(i == KeyEvent.KEYCODE_9)
                    {

                        edtKM.append("9");
                        double kilomet = Double.parseDouble(edtKM.getText().toString());
                        edtM.setText(kilomet*1000+"");
                        edtMM.setText(kilomet*1000000+"");
                    }
                    return true;
                }
                return false;
            }
        });
        return view;
    }
}