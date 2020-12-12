package com.phuoctruong.myapplication;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

public class PhoBienFragment extends Fragment {

    private GridView gridview1,gridView2,gridView3,gridView4;
    private SanPhamAdapter spadap1,spadap2,spadap3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_noibat, container, false);

        //nhóm 1
        gridview1 = r.findViewById(R.id.grid1);
        spadap1 = new SanPhamAdapter(PhoBienFragment.this.getActivity(), R.layout.item);
        gridview1.setAdapter(spadap1);
        registerForContextMenu(gridview1);
        //nhóm 2
        gridView2 = r.findViewById(R.id.grid2);
        spadap2 = new SanPhamAdapter(PhoBienFragment.this.getActivity(), R.layout.item);
        gridView2.setAdapter(spadap2);
        registerForContextMenu(gridView2);
        //nhóm 3
        gridView3 = r.findViewById(R.id.grid3);
        spadap3 = new SanPhamAdapter(PhoBienFragment.this.getActivity(), R.layout.item);
        gridView3.setAdapter(spadap3);
        registerForContextMenu(gridView3);

        addData();
        addEvents();
        return r;
    }

    private void addData() {
        spadap1.add(new DoUong(R.drawable.cafesua, "Cà phê Caramel", "45.000"));
        spadap1.add(new DoUong(R.drawable.luamach, "Caccpuchino", "47.000"));
        spadap1.add(new DoUong(R.drawable.luamachnong, "Cà phê Sữa", "35.000"));
        spadap1.add(new DoUong(R.drawable.maphuscl, "Latte", "37.000"));

        spadap2.add(new DoUong(R.drawable.maccatranchau, "Trà mật ong", "45.000"));

        spadap3.add(new DoUong(R.drawable.tradaocamxa, "Trà sữa Macca", "45.000"));
        spadap3.add(new DoUong(R.drawable.traden, "Trà lài", "47.000"));


    }

    private void addEvents() {
        gridview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Dialog dialog = new Dialog(PhoBienFragment.this.getActivity());
                dialog.setContentView(R.layout.diaglog_dathang);
                dialog.show();
            }
        });
        gridview1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog = new Dialog(PhoBienFragment.this.getActivity());
                dialog.setContentView(R.layout.dialog_danhgia);
                dialog.show();

                return true;
            }
        });
    }
}