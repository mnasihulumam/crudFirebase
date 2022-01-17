package com.example.firabasedosen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.recyclerview.widget.RecyclerView;

import java.security.PublicKey;
import java.util.ArrayList;

public class AdapterDosenRecyclerView extends
        RecyclerView.Adapter<AdapterDosenRecyclerView.ViewHolder> {
    private ArrayList<Dosen> daftarDosen;
    private Context context;

    public AdapterDosenRecyclerView(ArrayList<Dosen> dosens, Context ctx){
        daftarDosen = dosens;
        context = ctx;
    }
    class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvTitle;
        ViewHolder(View v){
            super(v);
            tvTitle = (TextView) v.findViewById(R.id.tv_namadosen);
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dosen, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }
   @Override
   public  void onBindViewHolder(ViewHolder holder, @SuppressLint("RecyclerView") final int position){
        final String name = daftarDosen.get(position).getNik();
        holder.tvTitle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // 
            }
        });
        holder.tvTitle.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View view){
                // update & delete
                return true;
            }
        });
        holder.tvTitle.setText(name);
   }
   @Override
    public int getItemCount(){
        return daftarDosen.size();
   }
}
