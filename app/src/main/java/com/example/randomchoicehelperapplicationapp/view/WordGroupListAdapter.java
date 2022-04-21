package com.example.randomchoicehelperapplicationapp.view;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.example.randomchoicehelperapplicationapp.model.wordgroup.WordGroup;

public class WordGroupListAdapter extends ListAdapter<WordGroup, WordGroupViewHolder> {

    public WordGroupListAdapter(@NonNull DiffUtil.ItemCallback<WordGroup> diffCallback) {
        super(diffCallback);
    }

    @Override
    public WordGroupViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return WordGroupViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull WordGroupViewHolder holder, int position) {
    WordGroup current = getItem(position);
    holder.bind(current.getWordGroup());
    }

    public static  class WordGroupDiff extends DiffUtil.ItemCallback<WordGroup> {

        @Override
        public boolean areItemsTheSame(@NonNull WordGroup oldItem, @NonNull WordGroup newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull WordGroup oldItem, @NonNull WordGroup newItem) {
            return oldItem.getWordGroup().contentEquals(newItem.getWordGroup());
        }
    }
}
