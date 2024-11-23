package com.example.btl_android.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.btl_android.Activity.ChiTietChinhSach;
import com.example.btl_android.Model.ModelChinhSach;
import com.example.btl_android.R;

import java.util.List;

public class AdapterChinhSach extends RecyclerView.Adapter<AdapterChinhSach.StoryViewHolder> {

    private List<ModelChinhSach> chinhSachList;
    // Lưu Context để dễ dàng truy cập
    private Context mContext;

    public AdapterChinhSach(List<ModelChinhSach> storyList, Context mContext) {
        this.chinhSachList = storyList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public StoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.model_chinh_sach, parent, false);
        return new StoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryViewHolder holder, int position) {
        ModelChinhSach model = (ModelChinhSach) chinhSachList.get(position);
        holder.nameChinhSach.setText(model.getNameChinhSach());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ChiTietChinhSach.class);
                intent.putExtra("storyDetail", model.getDetailChinhSach());
                intent.putExtra("storyName",model.getNameChinhSach());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return chinhSachList.size();
    }

    class StoryViewHolder extends RecyclerView.ViewHolder {
        public TextView nameChinhSach;
        public StoryViewHolder(@NonNull View itemView) {
            super(itemView);
            nameChinhSach = itemView.findViewById(R.id.nameChinhSach);
        }
    }
}