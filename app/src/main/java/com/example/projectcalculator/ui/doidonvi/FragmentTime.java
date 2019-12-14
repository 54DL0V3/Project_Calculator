package com.example.projectcalculator.ui.doidonvi;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.projectcalculator.R;

public class FragmentTime extends Fragment {
    View view;
    EditText edtHour,edtMinute,edtSecond;
    Button btnHour,btnMinute,btnSecond;
    TextView tvResult;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_time,container,false);
        edtHour =view.findViewById(R.id.edt_hour);
        edtMinute=view.findViewById(R.id.edt_minute);
        edtSecond=view.findViewById(R.id.edt_second);
        btnHour=view.findViewById(R.id.btn_Hours);
        btnMinute=view.findViewById(R.id.btn_Minutes);
        btnSecond=view.findViewById(R.id.btn_seconds);
        tvResult = view.findViewById(R.id.tv_result);
        btnHour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    double result;
                   double  hour = Double.parseDouble(edtHour.getText().toString());
                   double  minute = Double.parseDouble(edtMinute.getText().toString());
                   double  second = Double.parseDouble(edtSecond.getText().toString());
                    result = hour + minute/60+second/3600;
                    tvResult.setText(result+" h");
                }
                catch (Exception e){ Toast.makeText(getActivity(),"khong duoc bo trong",Toast.LENGTH_LONG).show(); }
            }
        });
        btnMinute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double result;
                    double  hour = Double.parseDouble(edtHour.getText().toString());
                    double  minute = Double.parseDouble(edtMinute.getText().toString());
                    double  second = Double.parseDouble(edtSecond.getText().toString());
                    result = hour*60 +minute+second/60;
                    tvResult.setText(result+" m");
                }
                catch (Exception e){ Toast.makeText(getActivity(),"khong duoc bo trong",Toast.LENGTH_LONG).show(); }

            }
        });
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double result;
                    double  hour = Double.parseDouble(edtHour.getText().toString());
                    double  minute = Double.parseDouble(edtMinute.getText().toString());
                    double  second = Double.parseDouble(edtSecond.getText().toString());
                    result = hour*3600 + minute*60+second;
                    tvResult.setText(result+" s");
                }
                catch (Exception e){ Toast.makeText(getActivity(),"khong duoc bo trong",Toast.LENGTH_LONG).show(); }

            }
        });
        return view;
    }
}
