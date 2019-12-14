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

public class FragmentMemory extends Fragment {
    EditText edtByte,edtKB,edtGB;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_memory,container,false);
        edtByte = view.findViewById(R.id.edt_byte);
        edtKB = view.findViewById(R.id.edt_kb);
        edtGB = view.findViewById(R.id.edt_gb);
        edtByte.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                if(keyEvent.getAction()== KeyEvent.ACTION_DOWN)
                {
                    if(i == KeyEvent.KEYCODE_0)
                    {
                        edtByte.append("0");
                        double Byte = Double.parseDouble(edtByte.getText().toString());
                        edtKB.setText(Byte/1024+"");
                        edtGB.setText(Byte/1048576+"");
                    }
                    if(i == KeyEvent.KEYCODE_1)
                    {

                        edtByte.append("1");
                        double Byte = Double.parseDouble(edtByte.getText().toString());
                        edtKB.setText(Byte/1024+"");
                        edtGB.setText(Byte/1048576+"");
                    }
                    if(i == KeyEvent.KEYCODE_2)
                    {
                        edtByte.append("2");
                        double Byte = Double.parseDouble(edtByte.getText().toString());
                        edtKB.setText(Byte/1024+"");
                        edtGB.setText(Byte/1048576+"");
                    }
                    if(i == KeyEvent.KEYCODE_3)
                    {

                        edtByte.append("3");
                        double Byte= Double.parseDouble(edtByte.getText().toString());
                        edtKB.setText(Byte/1024+"");
                        edtGB.setText(Byte/1048576+"");
                    }
                    if(i == KeyEvent.KEYCODE_4)
                    {
                        edtByte.append("4");
                        double Byte = Double.parseDouble(edtByte.getText().toString());
                        edtKB.setText(Byte/1024+"");
                        edtGB.setText(Byte/1048576+"");
                    }
                    if(i == KeyEvent.KEYCODE_5)
                    {

                        edtByte.append("5");
                        double Byte = Double.parseDouble(edtByte.getText().toString());
                        edtKB.setText(Byte/1024+"");
                        edtGB.setText(Byte/1048576+"");
                    }
                    if(i == KeyEvent.KEYCODE_6)
                    {

                        edtByte.append("6");
                        double Byte = Double.parseDouble(edtByte.getText().toString());
                        edtKB.setText(Byte/1024+"");
                        edtGB.setText(Byte/1048576+"");
                    }
                    if(i == KeyEvent.KEYCODE_7)
                    {

                        edtByte.append("7");
                        double Byte = Double.parseDouble(edtByte.getText().toString());
                        edtKB.setText(Byte/1024+"");
                        edtGB.setText(Byte/1048576+"");
                    }
                    if(i == KeyEvent.KEYCODE_8)
                    {

                        edtByte.append("8");
                        double Byte = Double.parseDouble(edtByte.getText().toString());
                        edtKB.setText(Byte/1024+"");
                        edtGB.setText(Byte/1048576+"");
                    }
                    if(i == KeyEvent.KEYCODE_9)
                    {

                        edtByte.append("9");
                        double Byte = Double.parseDouble(edtByte.getText().toString());
                        edtKB.setText(Byte/1024+"");
                        edtGB.setText(Byte/1048576+"");
                    }
                    return true;
                }
                return false;
            }
        });
        edtKB.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                if(keyEvent.getAction()== KeyEvent.ACTION_DOWN)
                {
                    if(i == KeyEvent.KEYCODE_0)
                    {
                        edtKB.append("0");
                        double KB = Double.parseDouble(edtKB.getText().toString());
                        edtByte.setText(KB*1024+"");
                        edtGB.setText(KB/1024+"");
                    }
                    if(i == KeyEvent.KEYCODE_1)
                    {

                        edtKB.append("1");
                        double KB = Double.parseDouble(edtKB.getText().toString());
                        edtByte.setText(KB*1024+"");
                        edtGB.setText(KB/1024+"");
                    }
                    if(i == KeyEvent.KEYCODE_2)
                    {

                        edtKB.append("2");
                        double KB = Double.parseDouble(edtKB.getText().toString());
                        edtByte.setText(KB*1024+"");
                        edtGB.setText(KB/1024+"");
                    }
                    if(i == KeyEvent.KEYCODE_3)
                    {
                        edtKB.append("3");
                        double KB = Double.parseDouble(edtKB.getText().toString());
                        edtByte.setText(KB*1024+"");
                        edtGB.setText(KB/1024+"");
                    }
                    if(i == KeyEvent.KEYCODE_4)
                    {
                        edtKB.append("4");
                        double KB = Double.parseDouble(edtKB.getText().toString());
                        edtByte.setText(KB*1024+"");
                        edtGB.setText(KB/1024+"");
                    }
                    if(i == KeyEvent.KEYCODE_5)
                    {
                        edtKB.append("5");
                        double KB = Double.parseDouble(edtKB.getText().toString());
                        edtByte.setText(KB*1024+"");
                        edtGB.setText(KB/1024+"");
                    }
                    if(i == KeyEvent.KEYCODE_6)
                    {
                        edtKB.append("6");
                        double KB = Double.parseDouble(edtKB.getText().toString());
                        edtByte.setText(KB*1024+"");
                        edtGB.setText(KB/1024+"");
                    }
                    if(i == KeyEvent.KEYCODE_7)
                    {

                        edtKB.append("7");
                        double KB = Double.parseDouble(edtKB.getText().toString());
                        edtByte.setText(KB*1024+"");
                        edtGB.setText(KB/1024+"");
                    }
                    if(i == KeyEvent.KEYCODE_8)
                    {
                        edtKB.append("8");
                        double KB = Double.parseDouble(edtKB.getText().toString());
                        edtByte.setText(KB*1024+"");
                        edtGB.setText(KB/1024+"");
                    }
                    if(i == KeyEvent.KEYCODE_9)
                    {
                        edtKB.append("9");
                        double KB = Double.parseDouble(edtKB.getText().toString());
                        edtByte.setText(KB*1024+"");
                        edtGB.setText(KB/1024+"");
                    }
                    return true;
                }
                return false;
            }
        });
        edtGB.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                if(keyEvent.getAction()== KeyEvent.ACTION_DOWN)
                {
                    if(i == KeyEvent.KEYCODE_0)
                    {
                        edtGB.append("0");
                        double GB = Double.parseDouble(edtGB.getText().toString());
                        edtByte.setText(GB*1048576+"");
                        edtKB.setText(GB*1024+"");
                    }
                    if(i == KeyEvent.KEYCODE_1)
                    {
                        edtGB.append("1");
                        double GB = Double.parseDouble(edtGB.getText().toString());
                        edtByte.setText(GB*1048576+"");
                        edtKB.setText(GB*1024+"");
                    }
                    if(i == KeyEvent.KEYCODE_2)
                    {
                        edtGB.append("2");
                        double GB = Double.parseDouble(edtGB.getText().toString());
                        edtByte.setText(GB*1048576+"");
                        edtKB.setText(GB*1024+"");
                    }
                    if(i == KeyEvent.KEYCODE_3)
                    {
                        edtGB.append("3");
                        double GB = Double.parseDouble(edtGB.getText().toString());
                        edtByte.setText(GB*1048576+"");
                        edtKB.setText(GB*1024+"");
                    }
                    if(i == KeyEvent.KEYCODE_4)
                    {
                        edtGB.append("4");
                        double GB = Double.parseDouble(edtGB.getText().toString());
                        edtByte.setText(GB*1048576+"");
                        edtKB.setText(GB*1024+"");
                    }
                    if(i == KeyEvent.KEYCODE_5)
                    {
                        edtGB.append("5");
                        double GB = Double.parseDouble(edtGB.getText().toString());
                        edtByte.setText(GB*1048576+"");
                        edtKB.setText(GB*1024+"");
                    }
                    if(i == KeyEvent.KEYCODE_6)
                    {
                        edtGB.append("6");
                        double GB = Double.parseDouble(edtGB.getText().toString());
                        edtByte.setText(GB*1048576+"");
                        edtKB.setText(GB*1024+"");
                    }
                    if(i == KeyEvent.KEYCODE_7)
                    {
                        edtGB.append("7");
                        double GB = Double.parseDouble(edtGB.getText().toString());
                        edtByte.setText(GB*1048576+"");
                        edtKB.setText(GB*1024+"");
                    }
                    if(i == KeyEvent.KEYCODE_8)
                    {
                        edtGB.append("8");
                        double GB = Double.parseDouble(edtGB.getText().toString());
                        edtByte.setText(GB*1048576+"");
                        edtKB.setText(GB*1024+"");
                    }
                    if(i == KeyEvent.KEYCODE_9)
                    {
                        edtGB.append("9");
                        double GB = Double.parseDouble(edtGB.getText().toString());
                        edtByte.setText(GB*1048576+"");
                        edtKB.setText(GB*1024+"");
                    }
                    return true;
                }
                return false;
            }
        });
        return view;
    }
}