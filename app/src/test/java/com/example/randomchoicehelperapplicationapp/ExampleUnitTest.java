package com.example.randomchoicehelperapplicationapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.example.randomchoicehelperapplicationapp.randomclass.RandomChoice;
import com.example.randomchoicehelperapplicationapp.randomclass.RandomChoiceGenerator;

import java.util.Arrays;
import java.util.List;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private RandomChoiceGenerator machine;

    @Before
    void setup(){
        machine = new RandomChoice();
    }

    public static String messageTrueOrNot(boolean state){
        if ((!state)) {
            System.out.println("Does not contain!");
            return "Does not Contain";
        } else {
            System.out.println("Does Contain");
            return "Does Contain";
        }
    }

    public static boolean contains(final int[] array, final int v){
        return Arrays.stream(array).anyMatch(i->i==v);
    }

    @Test
    void happyPathFindChooseRandomString(){
        String[] words = {"green","blue","yellow"};
        String test = machine.chooseRandomlyString(words);

        List<String> list = Arrays.asList(words);


        assertTrue(list.contains(test));

    }

    @Test
    void happyPathChooseRandomIntOutOfIntArray(){

        int[] numbers = {123,45,23,7879,441,0,2233,114,77,66,44,11,33,77,9988};
        int test = machine.chooseRandomNumber(numbers);

        assertTrue(contains(numbers,test));
    }




}