package com.example.exam_recycler.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exam_recycler.Model.TopServices;
import com.example.exam_recycler.R;

import java.util.List;

public class TopServicesAdapter extends RecyclerView.Adapter<TopServicesAdapter.TopServicesHolder> {

    private List<TopServices> topServicesList;

    public TopServicesAdapter(List<TopServices> topServicesList) {
        this.topServicesList = topServicesList;
    }

    @NonNull
    @Override
    public TopServicesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.top_services, parent, false);
        return new TopServicesHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopServicesHolder holder, int position) {
        holder.top_services_text.setText(topServicesList.get(position).getTop());
        holder.top_services_img.setImageResource(topServicesList.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return topServicesList.size();
    }

    public class TopServicesHolder extends RecyclerView.ViewHolder {
        private TextView top_services_text;
        private ImageView top_services_img;

        public TopServicesHolder(@NonNull View itemView) {
            super(itemView);

            top_services_text = itemView.findViewById(R.id.top_services_text);
            top_services_img = itemView.findViewById(R.id.top_services_img);
        }
    }
}
