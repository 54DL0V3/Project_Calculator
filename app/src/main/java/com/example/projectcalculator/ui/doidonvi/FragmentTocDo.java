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

public class FragmentTocDo extends Fragment {
    EditText edtkmph,edtmps;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tocdo,container,false);
        edtkmph = view.findViewById(R.id.edt_kmph);
        edtmps = view.findViewById(R.id.edt_mps);
        edtkmph.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                if(keyEvent.getAction()== KeyEvent.ACTION_DOWN)
                {
                    if(i == KeyEvent.KEYCODE_0)
                    {
                        edtkmph.append("0");
                        double kmph = Double.parseDouble(edtkmph.getText().toString());
                        edtmps.setText(kmph/3.6+"");
                    }
                    if(i == KeyEvent.KEYCODE_1)
                    {

                        edtkmph.append("1");
                        double kmph = Double.parseDouble(edtkmph.getText().toString());
                        edtmps.setText(kmph/3.6+"");
                    }
                    if(i == KeyEvent.KEYCODE_2)
                    {
                        edtkmph.append("2");
                        double kmph = Double.parseDouble(edtkmph.getText().toString());
                        edtmps.setText(kmph/3.6+"");
                    }
                    if(i == KeyEvent.KEYCODE_3)
                    {

                        edtkmph.append("3");
                        double kmph = Double.parseDouble(edtkmph.getText().toString());
                        edtmps.setText(kmph/3.6+"");
                    }
                    if(i == KeyEvent.KEYCODE_4)
                    {
                        edtkmph.append("4");
                        double kmph = Double.parseDouble(edtkmph.getText().toString());
                        edtmps.setText(kmph/3.6+"");
                    }
                    if(i == KeyEvent.KEYCODE_5)
                    {
                        edtkmph.append("5");
                        double kmph = Double.parseDouble(edtkmph.getText().toString());
                        edtmps.setText(kmph/3.6+"");
                    }
                    if(i == KeyEvent.KEYCODE_6)
                    {
                        edtkmph.append("6");
                        double kmph = Double.parseDouble(edtkmph.getText().toString());
                        edtmps.setText(kmph/3.6+"");
                    }
                    if(i == KeyEvent.KEYCODE_7)
                    {
                        edtkmph.append("7");
                        double kmph = Double.parseDouble(edtkmph.getText().toString());
                        edtmps.setText(kmph/3.6+"");
                    }
                    if(i == KeyEvent.KEYCODE_8)
                    {
                        edtkmph.append("8");
                        double kmph = Double.parseDouble(edtkmph.getText().toString());
                        edtmps.setText(kmph/3.6+"");
                    }
                    if(i == KeyEvent.KEYCODE_9)
                    {
                        edtkmph.append("9");
                        double kmph = Double.parseDouble(edtkmph.getText().toString());
                        edtmps.setText(kmph/3.6+"");
                    }
                    return true;
                }
                return false;
            }
        });
        edtmps.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                if(keyEvent.getAction()== KeyEvent.ACTION_DOWN)
                {
                    if(i == KeyEvent.KEYCODE_0)
                    {
                        edtmps.append("0");
                        double mps = Double.parseDouble(edtmps.getText().toString());
                        edtkmph.setText(mps*3.6+"");
                    }
                    if(i == KeyEvent.KEYCODE_1)
                    {
                        edtmps.append("1");
                        double mps = Double.parseDouble(edtmps.getText().toString());
                        edtkmph.setText(mps*3.6+"");
                    }
                    if(i == KeyEvent.KEYCODE_2)
                    {
                        edtmps.append("2");
                        double mps = Double.parseDouble(edtmps.getText().toString());
                        edtkmph.setText(mps*3.6+"");
                    }
                    if(i == KeyEvent.KEYCODE_3)
                    {
                        edtmps.append("3");
                        double mps = Double.parseDouble(edtmps.getText().toString());
                        edtkmph.setText(mps*3.6+"");
                    }
                    if(i == KeyEvent.KEYCODE_4)
                    {
                        edtmps.append("4");
                        double mps = Double.parseDouble(edtmps.getText().toString());
                        edtkmph.setText(mps*3.6+"");
                    }
                    if(i == KeyEvent.KEYCODE_5)
                    {
                        edtmps.append("5");
                        double mps = Double.parseDouble(edtmps.getText().toString());
                        edtkmph.setText(mps*3.6+"");
                    }
                    if(i == KeyEvent.KEYCODE_6)
                    {
                        edtmps.append("6");
                        double mps = Double.parseDouble(edtmps.getText().toString());
                        edtkmph.setText(mps*3.6+"");
                    }
                    if(i == KeyEvent.KEYCODE_7)
                    {
                        edtmps.append("7");
                        double mps = Double.parseDouble(edtmps.getText().toString());
                        edtkmph.setText(mps*3.6+"");
                    }
                    if(i == KeyEvent.KEYCODE_8)
                    {
                        edtmps.append("8");
                        double mps = Double.parseDouble(edtmps.getText().toString());
                        edtkmph.setText(mps*3.6+"");
                    }
                    if(i == KeyEvent.KEYCODE_9)
                    {
                        edtmps.append("9");
                        double mps = Double.parseDouble(edtmps.getText().toString());
                        edtkmph.setText(mps*3.6+"");
                    }
                    return true;
                }
                return false;
            }
        });
        return view;
    }
}