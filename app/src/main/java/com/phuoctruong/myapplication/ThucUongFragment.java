package com.phuoctruong.myapplication;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

public class ThucUongFragment extends Fragment {

    private GridView gridview1,gridView2,gridView3,gridView4;
    private SanPhamAdapter spadap1,spadap2,spadap3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_noibat, container, false);

        //nhóm 1
        gridview1 = r.findViewById(R.id.grid1);
        spadap1 = new SanPhamAdapter(ThucUongFragment.this.getActivity(), R.layout.item);
        gridview1.setAdapter(spadap1);
        registerForContextMenu(gridview1);
        //nhóm 2
        gridView2 = r.findViewById(R.id.grid2);
        spadap2 = new SanPhamAdapter(ThucUongFragment.this.getActivity(), R.layout.item);
        gridView2.setAdapter(spadap2);
        registerForContextMenu(gridView2);
        //nhóm 3
        gridView3 = r.findViewById(R.id.grid3);
        spadap3 = new SanPhamAdapter(ThucUongFragment.this.getActivity(), R.layout.item);
        gridView3.setAdapter(spadap3);
        registerForContextMenu(gridView3);

        addData();
        addEvents();
        return r;
    }


    private void addData() {
        spadap1.add(new DoUong(R.drawable.caramel, "Cà phê Caramel", "45.000"));
        spadap1.add(new DoUong(R.drawable.cappuchino, "Caccpuchino", "47.000"));
        spadap1.add(new DoUong(R.drawable.cafesua, "Cà phê Sữa", "35.000"));
        spadap1.add(new DoUong(R.drawable.latte, "Latte", "37.000"));

        spadap2.add(new DoUong(R.drawable.matong, "Trà mật ong", "45.000"));
        spadap2.add(new DoUong(R.drawable.olonghatsen, "Trà ô long hạt sen", "47.000"));
        spadap2.add(new DoUong(R.drawable.tradaocamxa, "Trà đào cam xả", "45.000"));
        spadap2.add(new DoUong(R.drawable.traden, "Trà đen", "47.000"));

        spadap3.add(new DoUong(R.drawable.maccatranchau, "Trà sữa Macca", "45.000"));
        spadap3.add(new DoUong(R.drawable.tralai, "Trà lài", "47.000"));
        spadap3.add(new DoUong(R.drawable.traxoai, "Trà sửa xoài", "45.000"));

    }
    private void addEvents() {
        gridview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Dialog dialog = new Dialog(ThucUongFragment.this.getActivity());
                dialog.setContentView(R.layout.diaglog_dathang);
                dialog.show();
            }
        });
        gridview1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog = new Dialog(ThucUongFragment.this.getActivity());
                dialog.setContentView(R.layout.dialog_danhgia);
                dialog.show();
                return true;
            }
        });
        gridView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Dialog dialog2 = new Dialog(ThucUongFragment.this.getActivity());
                dialog2.setContentView(R.layout.diaglog_dathang);
                dialog2.show();
            }
        });
        gridView2.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog2 = new Dialog(ThucUongFragment.this.getActivity());
                dialog2.setContentView(R.layout.dialog_danhgia);
                dialog2.show();
                return true;
            }
        });
        gridView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Dialog dialog3 = new Dialog(ThucUongFragment.this.getActivity());
                dialog3.setContentView(R.layout.diaglog_dathang);
                dialog3.show();
            }
        });
        gridView3.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog3 = new Dialog(ThucUongFragment.this.getActivity());
                dialog3.setContentView(R.layout.dialog_danhgia);
                dialog3.show();
                return true;
            }
        });
    }
}