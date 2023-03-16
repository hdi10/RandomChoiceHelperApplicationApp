package com.example.randomchoicehelperapplicationapp;

public interface RandomChoicesListGeneratorMachine {
    void getRandomChoiceAnzahl();

    void addToTreeSet(Integer generic);

    void addToTreeMap(Long key, String value);

    void addToList(myReq req);
}
