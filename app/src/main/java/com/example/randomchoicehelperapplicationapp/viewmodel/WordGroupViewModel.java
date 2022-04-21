package com.example.randomchoicehelperapplicationapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.randomchoicehelperapplicationapp.model.wordgroup.WordGroup;
import com.example.randomchoicehelperapplicationapp.model.wordgroup.WordGroupRepository;

import java.util.List;

public class WordGroupViewModel extends AndroidViewModel {

    private WordGroupRepository mRepo;

    private final LiveData<List<WordGroup>> mAllWordGroups;

    public WordGroupViewModel(Application application) {
        super(application);
        mRepo = new WordGroupRepository(application);
        mAllWordGroups = mRepo.getAllWordGroups();
    }

    public LiveData<List<WordGroup>> getAllWordGroups() { return mAllWordGroups;}

    public void insert(WordGroup wordGroup) {mRepo.insert(wordGroup);}
}
