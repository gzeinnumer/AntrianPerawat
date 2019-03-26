package com.gzeinnumer.antrianperawat;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import java.util.ArrayList;
import java.util.Collections;

public class PerawatActivity extends AppCompatActivity {

    RecyclerView rvAntrian;
    ArrayList<DataAntrian> mList;
    AdapterPerawat adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perawat_main);
        rvAntrian= findViewById(R.id.rvAntrian);

        initData();
    }

    private void initData() {
        mList = new ArrayList<>();
        for (int i=0; i<10; i++){
            mList.add(new DataAntrian(i, "Nama Antrian "+i, "Alamat Antrian "+i));
        }

        initToRecycler();
    }

    private void initToRecycler() {
        adapter = new AdapterPerawat(this, mList);
        rvAntrian.setHasFixedSize(true);
        rvAntrian.setLayoutManager(new LinearLayoutManager(this));
        rvAntrian.setAdapter(adapter);

        setDragRecycler();
    }

    private void setDragRecycler() {
        RecyclerView.ItemDecoration divider = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        rvAntrian.addItemDecoration(divider);

        ItemTouchHelper helper = new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(
                ItemTouchHelper.UP | ItemTouchHelper.DOWN, 0) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView,
                                  @NonNull RecyclerView.ViewHolder drag,
                                  @NonNull RecyclerView.ViewHolder drop) {
                int dragged = drag.getAdapterPosition();
                int droped = drop.getAdapterPosition();
                Collections.swap(mList, dragged, droped);
                adapter.notifyItemMoved(dragged,droped);
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

            }
        });

        helper.attachToRecyclerView(rvAntrian);
    }
}
