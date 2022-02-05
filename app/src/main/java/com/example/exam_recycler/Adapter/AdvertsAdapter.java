package com.example.exam_recycler.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exam_recycler.Model.Adverts;
import com.example.exam_recycler.R;

import java.util.List;

public class AdvertsAdapter extends RecyclerView.Adapter<AdvertsAdapter.AdvertsHolder> {

    private List<Adverts> advertsList;

    public AdvertsAdapter(List<Adverts> advertsList) {
        this.advertsList = advertsList;
    }

    @NonNull
    @Override
    public AdvertsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adverts_itim, parent, false);
        return new AdvertsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdvertsHolder holder, int position) {
        holder.adverts_text.setText(advertsList.get(position).getAdv());
        holder.adverts_img.setImageResource(advertsList.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return advertsList.size();
    }

    public class AdvertsHolder extends RecyclerView.ViewHolder {

        private TextView adverts_text;
        private ImageView adverts_img;

        public AdvertsHolder(@NonNull View itemView) {
            super(itemView);

            adverts_text = itemView.findViewById(R.id.adverts_text);
            adverts_img = itemView.findViewById(R.id.adverts_img);

        }
    }
}
