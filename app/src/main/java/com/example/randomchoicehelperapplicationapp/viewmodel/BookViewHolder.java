package com.example.randomchoicehelperapplicationapp.viewmodel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.randomchoicehelperapplicationapp.R;

public class BookViewHolder extends RecyclerView.ViewHolder {
    private final TextView BookItemView;

    private BookViewHolder(View itemView) {
        super(itemView);
        BookItemView = itemView.findViewById(R.id.textView);
    }

    public void bind(String text) {
        BookItemView.setText(text);
    }

    static BookViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new BookViewHolder(view);
    }

}
