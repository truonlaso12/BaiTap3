package com.phuoctruong.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;


public class Taikhoan extends Fragment implements View.OnClickListener {

    ImageView img;
    Button bt1, bt2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_navigation_taikhoan, container, false);

        img = r.findViewById(R.id.imageView);
        img.setOnClickListener(this);

        bt1 = r.findViewById(R.id.button2);
        bt1.setOnClickListener(this);

        bt2 = r.findViewById(R.id.button_DangXuat);
        bt2.setOnClickListener(this);
        return r;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageView) {
            Intent dsp = new Intent(Taikhoan.this.getActivity(), Information.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.button2) {
            Intent dsp = new Intent(Taikhoan.this.getActivity(), Information.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.button_DangXuat) {
            Intent dsp = new Intent(Taikhoan.this.getActivity(), dangnhap.class);
            startActivity(dsp);
        }
    }
}