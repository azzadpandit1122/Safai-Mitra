package com.example.safai_mitra;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    ArrayList<itemModel> arrayList;

    public Adapter(Context context, ArrayList<itemModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position) {
        holder.rowImage.setImageResource(arrayList.get(position).getImage());
        holder.rowName.setText(arrayList.get(position).getName());
        holder.rowDescription.setText(arrayList.get(position).getDecription());
        holder.rowLocation.setText(arrayList.get(position).getLocation());
        holder.rowprofileIcon.setImageResource(arrayList.get(position).getProfileIcon());
        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Deleted", Toast.LENGTH_SHORT).show();
                Log.d("delete", "Yes Clicked item is deleted ");
                arrayList.remove(position);
                notifyItemRemoved(position);
                notifyItemRangeChanged(position, arrayList.size());
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final Context context;
        ImageView delete, rowImage, rowprofileIcon;
        TextView rowName, rowLocation, rowDescription;

        public ViewHolder(View itemView) {
            super(itemView);
            rowName = itemView.findViewById(R.id.textView);
            rowprofileIcon = itemView.findViewById(R.id.imageView2);
            rowImage = itemView.findViewById(R.id.imageView);
            rowDescription = itemView.findViewById(R.id.textView2);
            rowLocation = itemView.findViewById(R.id.textView3);
            delete = itemView.findViewById(R.id.imageButtonFireNumberDelete);
            context = itemView.getContext();
        }
    }
}

