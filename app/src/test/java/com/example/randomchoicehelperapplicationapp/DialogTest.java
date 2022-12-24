/**
 * Testklasse für eine Liste. Versuch und vergleich einer TreeMap mit einem TreeSet
 * Quellen Prog3 bei Fr. Prof. Dr. Hubrich
 */
package com.example.randomchoicehelperapplicationapp;

import android.util.Log;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class DialogTest {

    @Ignore
    @Test
    public void GutTest1(){


        RandomChoicesListGeneratorMachine RGBTQ = new RandomChoicesList();
        RGBTQ.getRandomChoiceAnzahl();

    }

    @Test
    public void GutTest2(){
        List<myReq> ArrayListExamples = new ArrayList();
        TreeSet<Integer> TreeSetExample = new TreeSet();
        TreeMap<Long,String> TreeMapExample = new TreeMap<>();


        ArrayListExamples.add(new myReq("name1",1));
        int sizeOfArrayList = ArrayListExamples.size();

        TreeMapExample.put(70000L, "derStringValueDazu");
        int sizeOfTreeMap = TreeMapExample.size();

        TreeSetExample.add(132);
        int sizeOfTreeSet = TreeSetExample.size();



        Assert.assertEquals(2,sizeOfArrayList,0.0);
        Assert.assertEquals(1,sizeOfTreeMap,0.0);
        Assert.assertEquals(1,sizeOfTreeSet,0.0);
    }
}
