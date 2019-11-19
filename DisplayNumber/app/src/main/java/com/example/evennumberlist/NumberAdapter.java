package com.example.recyclerviewhomework;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.NumberViewHolder> {
    List<Integer> numbers;

    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemnumber, parent, false);
        return new NumberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {
        holder.tvNumber.setText("Number: " + numbers.get(position)+"\n");
    }

    @Override
    public int getItemCount() {
        return numbers.size();
    }

    class NumberViewHolder extends RecyclerView.ViewHolder {

        TextView tvNumber;

        public NumberViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNumber = itemView.findViewById(R.id.textNumber);
        }
    }
}