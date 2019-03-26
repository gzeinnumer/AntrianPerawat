package com.gzeinnumer.antrianperawat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdapterPerawat extends RecyclerView.Adapter<AdapterPerawat.MyHolder> {
    private Context context;
    private ArrayList<DataAntrian> list;

    public AdapterPerawat(Context context, ArrayList<DataAntrian> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_antrian, viewGroup, false);
        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        myHolder.itemNo.setText(String.valueOf(list.get(i).getAntrianNo()));
        myHolder.itemNama.setText(String.valueOf(list.get(i).getAntrianNama()));
        myHolder.itemAlamat.setText(String.valueOf(list.get(i).getAntrianAalamat()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.itemNo)
        TextView itemNo;
        @BindView(R.id.itemNama)
        TextView itemNama;
        @BindView(R.id.itemAlamat)
        TextView itemAlamat;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


}
