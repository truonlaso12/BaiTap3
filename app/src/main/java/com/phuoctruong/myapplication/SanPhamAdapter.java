package com.phuoctruong.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SanPhamAdapter extends ArrayAdapter<DoUong> {
    Activity context;
    int resource;

    public SanPhamAdapter(@NonNull Activity context, int resource) {
        super(context, resource);
        this.context = context;
        this.resource = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View customView = inflater.inflate(this.resource, null);
        ImageView hinh = customView.findViewById(R.id.hinh);
        TextView ten     = customView.findViewById(R.id.ten);
        TextView gia = customView.findViewById(R.id.gia);

        DoUong sp = getItem(position);
        hinh.setImageResource(sp.getHinh());
        ten.setText(sp.getTen());
        gia.setText(sp.getGia() + "đ");

        return customView;


    }
}