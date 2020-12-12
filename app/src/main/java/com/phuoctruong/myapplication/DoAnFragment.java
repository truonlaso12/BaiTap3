package com.phuoctruong.myapplication;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

public class DoAnFragment extends Fragment {

    private GridView gridView1;
    private SanPhamAdapter spadap1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_do_an, container, false);

        gridView1 = r.findViewById(R.id.grid1);
        spadap1 = new SanPhamAdapter(DoAnFragment.this.getActivity(), R.layout.item);
        gridView1.setAdapter(spadap1);
        registerForContextMenu(gridView1);
        addData();
        addEvents();
        return r;
    }
    private void addData() {
        spadap1.add(new DoUong(R.drawable.banhmi, "Bánh mì chăn bông", "29.000"));
        spadap1.add(new DoUong(R.drawable.banhmique, "Bánh mì que", "12.000"));
        spadap1.add(new DoUong(R.drawable.bonglan, "Bánh bông lan trứng muối", "45.000"));
        spadap1.add(new DoUong(R.drawable.camsay, "Cam sấy", "30.000"));
        spadap1.add(new DoUong(R.drawable.gaxe, "Gà xé", "45.000"));
        spadap1.add(new DoUong(R.drawable.dieuvangmatong, "Điều vàng mật ong", "45.000"));
        spadap1.add(new DoUong(R.drawable.mochi, "Bánh mochi", "47.000"));
        spadap1.add(new DoUong(R.drawable.mousegau, "Bánh mouse gấu", "47.000"));
    }
    private void addEvents() {
        gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Dialog dialog = new Dialog(DoAnFragment.this.getActivity());
                dialog.setContentView(R.layout.diaglog_dathang);
                dialog.show();
            }
        });
        gridView1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog = new Dialog(DoAnFragment.this.getActivity());
                dialog.setContentView(R.layout.dialog_danhgia);
                dialog.show();

                return true;
            }
        });
    }
}