package com.example.homeworke4.CONTINENT;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.homeworke4.OnItemClick;
import com.example.homeworke4.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<ContinentModel> continentList;
    private OnItemClick onClick;

    public ContinentAdapter(ArrayList<ContinentModel> continentList, OnItemClick onClick) {
        this.continentList = continentList;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(continentList.get(position));
        holder.itemView.setOnClickListener(v -> {
            onClick.onItemClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }
}

class ViewHolder extends RecyclerView.ViewHolder {
    private ItemContinentBinding binding;
    public ViewHolder(@NonNull ItemContinentBinding binding) {
        super(binding.getRoot());
        this.binding = binding;

    }

    public void onBind(ContinentModel continent){
        binding.tvContinentName.setText(continent.getName());
        Glide.with(binding.imgContinent).load(continent.getPoster()).into(binding.imgContinent);

    }
}
