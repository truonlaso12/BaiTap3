package com.phuoctruong.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class Tintuc extends Fragment implements View.OnClickListener {

    ImageView img1, img2;
    RelativeLayout rl1, rl2, rl3;
    Fragment fragment;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.fragment_navigation_tintuc, container, false);


        img1 = root.findViewById(R.id.imageNotify);
        img1.setOnClickListener(this);
        img2 = root.findViewById(R.id.imageAdd);
        img2.setOnClickListener(this);


        rl1 = root.findViewById(R.id.relativeTichdiem);
        rl2 = root.findViewById(R.id.relativeDathang);
        rl3 = root.findViewById(R.id.relativeCoupon);
        rl1.setOnClickListener(this);
        rl2.setOnClickListener(this);
        rl3.setOnClickListener(this);



        return root;
    }



    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageNotify) {
            Intent dsp = new Intent(Tintuc.this.getActivity(), Notify.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.imageAdd) {
            Intent dsp = new Intent(Tintuc.this.getActivity(), Information.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.relativeTichdiem) {
            Toast.makeText(this.getActivity(), "Tích điểm", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.relativeDathang) {
            Toast.makeText(this.getActivity(), "Đặt hàng ", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.relativeCoupon) {
            Toast.makeText(this.getActivity(), "Coupon", Toast.LENGTH_SHORT).show();
        }
    }


}