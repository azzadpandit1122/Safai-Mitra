package com.example.safai_mitra;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterAdvTable extends RecyclerView.Adapter<AdapterAdvTable.ViewHolder> {
    Context context;
    ArrayList<itemModel> arrayListadvTable;

    public AdapterAdvTable(Context context, ArrayList<itemModel> arrayListadvTable) {
        this.context = context;
        this.arrayListadvTable = arrayListadvTable;
    }

    @Override
    public AdapterAdvTable.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_adavancetable_a, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(AdapterAdvTable.ViewHolder holder, int position) {
        holder.productname.setText(arrayListadvTable.get(position).getProductname());
        holder.price.setText(arrayListadvTable.get(position).getPrice());
        holder.data.setText(arrayListadvTable.get(position).getData());


    }

    @Override
    public int getItemCount() {
        return arrayListadvTable.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView productname,price, data;

        public ViewHolder(View itemView) {
            super(itemView);
            productname = itemView.findViewById(R.id.textView5);
            price = itemView.findViewById(R.id.textView7);
            data = itemView.findViewById(R.id.textView6);
        }
    }
}


