package com.example.randomchoicehelperapplicationapp.randomclass;

import java.util.List;
import java.util.Random;

public class RandomChoice implements RandomChoiceGenerator {

    @Override
    public String generateRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 5;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (
                int i = 0;
                i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

    @Override
    public int generateRandomInteger() {
        int leftLimit = 1;
        int rightLimit = 9;
        int dezimal = 1;
        Random random = new Random();

        int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit-leftLimit+1));

        return randomLimitedInt*dezimal;
    }


    @Override
    public int generateRandomInteger(int leftLimit,int rightLimit) {
        int dezimal = 10;
        Random random = new Random();

        int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit-leftLimit+1));

        return randomLimitedInt*dezimal;
    }

    @Override
    public String chooseRandomlyString(String[] possibleChoices) {

        while (true){

            int randomIterations = generateRandomInteger();
            String stoppedHere = null;

            for (int i = 1; i < randomIterations; i++) {

                if (i == possibleChoices.length) {
                    i=0;
                }

                stoppedHere = possibleChoices[i];


                if(randomIterations > possibleChoices.length){
                    randomIterations =randomIterations/10;
                }
            }
            return stoppedHere;

        }


    }

    @Override
    public String chooseRandomlyString2(String[] possibleChoices) {
        Random r=new Random();
        int randomNumber=r.nextInt(possibleChoices.length);
        return possibleChoices[randomNumber];
    }

    @Override
    public int chooseRandomNumber(int[] possibleChoices) {

        int randomIntBetweenOneAnd1000 = generateRandomInteger();
        int stoppedHere = 0;

        for (int i = 1; i < randomIntBetweenOneAnd1000; i++) {

            if (i == possibleChoices.length) {
                i=0;
            }

            stoppedHere = possibleChoices[i];


            if(randomIntBetweenOneAnd1000 > possibleChoices.length){
                randomIntBetweenOneAnd1000 =randomIntBetweenOneAnd1000/10;
            }
        }
        //stoppedHere = randomIntBetweenOneAnd1000;
        return stoppedHere;

    }

    @Override
    public int chooseRandomNumber2(int[] possibleChoices) {

        Random r=new Random();
        int randomNumber=r.nextInt(possibleChoices.length);
        return possibleChoices[randomNumber];

    }

    @Override
    public String chooseRandomlyString(List<String> possibleChoices) {
        return null;
    }

    @Override
    public int chooseRandomNumber(List<Integer> possibleChoices) {
        return 0;
    }

    @Override
    public String[] getRankedString() {
        return new String[0];
    }

    @Override
    public int[] getRankedInteger() {
        return new int[0];
    }

    @Override
    public List<String> getRankedStringList() {
        return null;
    }

    @Override
    public List<Integer> getRankedIntegerList() {
        return null;
    }

    @Override
    public void setPriorities() {

    }

}
