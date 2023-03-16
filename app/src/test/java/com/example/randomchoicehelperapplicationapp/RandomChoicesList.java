package com.example.randomchoicehelperapplicationapp;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class RandomChoicesList implements RandomChoicesListGeneratorMachine {
    List<myReq> ArrayListExamples = new ArrayList();
    TreeSet<Integer> TreeSetExample = new TreeSet();
    TreeMap<Long,String> TreeMapExample = new TreeMap<>();

    @Override
    public void getRandomChoiceAnzahl() {

        ArrayListExamples.add(new myReq("name1",1));
        int sizeOfArrayList = ArrayListExamples.size();

        TreeMapExample.put(70000L, "derStringValueDazu");
        int sizeOfTreeMap = TreeMapExample.size();

        TreeSetExample.add(132);
        int sizeOfTreeSet = TreeSetExample.size();



    }

    @Override
    public void addToTreeSet(Integer generic) {
        TreeSetExample.add(generic);

    }

    @Override
    public void addToTreeMap(Long key, String value) {
        TreeMapExample.put(key,value);
    }

    @Override
    public void addToList(myReq req) {
        ArrayListExamples.add(req);
    }


}
