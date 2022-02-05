package com.example.exam_recycler.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exam_recycler.R;

import java.util.List;

public class ServicesAdapter_2 extends RecyclerView.Adapter<ServicesAdapter_2.Services2Holder> {

    private List<Integer> imageList;

    public ServicesAdapter_2(List<Integer> imageList) {
        this.imageList = imageList;
    }

    @NonNull
    @Override
    public Services2Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.services_2, parent, false);
        return new Services2Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Services2Holder holder, int position) {
        holder.services2_img.setImageResource(imageList.get(position));
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    public class Services2Holder extends RecyclerView.ViewHolder {

        private ImageView services2_img;

        public Services2Holder(@NonNull View itemView) {
            super(itemView);
            services2_img = itemView.findViewById(R.id.services2_img);
        }
    }
}
