package com.example.randomchoicehelperapplicationapp.randomclass;

import java.util.List;

public interface RandomChoiceGenerator {

    /**
     * Generate a random string and return
     * //TODO specific return length? specific Range?
     * @return - Random generated string with length? of range?
     */
    String generateRandomString();

    /**
     * Generate a random integer in a specific range?
     * //TODO specific range?
     * @return - Random generated integer in a specific range?
     */
    int generateRandomInteger();

    /**
     * Generate a random integer in a specified range
     * @param leftLimit - specify leftLimit
     * @param rightLimit - specify rightLimit
     * @return - Random generated integer in a specific range?
     */
    int generateRandomInteger(int leftLimit, int rightLimit);

    /**
     * Choose a string out of an array of strings
     * @param possibleChoices - Array of strings
     * @return - One chosen string
     */
    String chooseRandomlyString(String[] possibleChoices);

    String chooseRandomlyString2(String[] possibleChoices);

    /**
     * Choose an integer out of an array of integer
     * @param possibleChoices - Array of integer
     * @return - One chosen integer
     */
    int chooseRandomNumber(int[] possibleChoices);

    int chooseRandomNumber2(int[] possibleChoices);

    /**
     * Choose a string out of a list of strings
     * @param possibleChoices - List of strings
     * @return - Chosen string
     */
    String chooseRandomlyString(List<String> possibleChoices);

    /**
     * Choose an integer out of a list of integer
     * @param possibleChoices - List of integer
     * @return - Chosen integer
     */
    int chooseRandomNumber(List<Integer> possibleChoices);

    /**
     * Get a ranked array of string
     * @return - ranked string array
     */
    String[] getRankedString();

    /**
     * Get a ranked array of integer
     * @return - ranked integer array
     */
    int[] getRankedInteger();

    /**
     * Get a ranked List of string
     * @return - ranked string list
     */
    List<String> getRankedStringList();

    /**
     * Get a ranked List of integer
     * @return - ranked string list
     */
    List<Integer> getRankedIntegerList();

    /**
     * set Priorities?
     */
    void setPriorities();

}
