package com.example.shortcutEngine;

import android.view.View;

import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.action.ViewActions;

import androidx.test.espresso.matcher.ViewMatchers;

import com.example.randomchoicehelperapplicationapp.R;
import com.example.randomchoicehelperapplicationapp.RandomClass.RandomChoice;
import com.example.randomchoicehelperapplicationapp.RandomClass.RandomChoiceGenerator;


import org.hamcrest.Matcher;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.pressBack;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.hasDescendant;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static com.example.shortcutEngine.WaitFunction.waitId;

import java.util.concurrent.TimeUnit;

public class Shortcut implements ShortcutGenerator{
    private static final long WAIT = 500;



    @Override
    public void useRandomNumberGenerator() {
        onView(withId(R.id.buttonGenerateRandomNumber)).perform(click());
    }

    @Override
    public void useRandomNumberGenerator(int times) {
        for (int i = 0; i <= times; i++) {
            onView(withId(R.id.buttonGenerateRandomNumber)).perform(click());
        }
    }

    @Override
    public void useRandomStringGenerator() {
        onView(withId(R.id.buttonGenerateRandomString)).perform(click());
    }

    @Override
    public void useRandomStringGenerator(int times) {
        for (int i = 0; i <= times; i++) {
            onView(withId(R.id.buttonGenerateRandomString)).perform(click());
        }
    }

    @Override
    public void useChooseRandomlyString() {
        RandomChoiceGenerator rcg = new RandomChoice();


        onView(withId(R.id.buttonChooseRandomWord)).perform(click());

        onView(withId(R.id.editText))
                .perform(typeText(rcg.generateRandomString()), closeSoftKeyboard());

        onView(withId(R.id.editText2))
                .perform(typeText(rcg.generateRandomString()), closeSoftKeyboard());

        onView(withId(R.id.editText3))
                .perform(typeText(rcg.generateRandomString()), closeSoftKeyboard());

        onView(withId(R.id.editText4))
                .perform(typeText(rcg.generateRandomString()), closeSoftKeyboard());

        onView(withId(R.id.goRandomString)).perform(click());


    }

    @Override
    public void useChooseRandomlyString(String string1, String string2, String string3, String string4) {

        onView(withId(R.id.buttonChooseRandomWord)).perform(click());

        onView(withId(R.id.editText))
                .perform(typeText(string1), closeSoftKeyboard());

        onView(withId(R.id.editText2))
                .perform(typeText(string2), closeSoftKeyboard());

        onView(withId(R.id.editText3))
                .perform(typeText(string3), closeSoftKeyboard());

        onView(withId(R.id.editText4))
                .perform(typeText(string4), closeSoftKeyboard());

        onView(withId(R.id.goRandomString)).perform(click());

        try {
            Thread.sleep(WAIT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        onView(withId(R.id.goRandomString)).perform(click());
        onView(withId(R.id.goRandomString)).perform(click());
        onView(withId(R.id.goRandomString)).perform(click());

        try {
            Thread.sleep(WAIT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.goRandomString)).perform(click());

        try {
            Thread.sleep(WAIT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void useChooseRandomNumber() {
        RandomChoiceGenerator rcg = new RandomChoice();

        onView(withId(R.id.buttonChooseRandomNumber)).perform(click());

        onView(withId(R.id.editNumber))
                .perform(typeText(String.valueOf(rcg.generateRandomInteger())), closeSoftKeyboard());

        onView(withId(R.id.editNumber2))
                .perform(typeText(String.valueOf(rcg.generateRandomInteger())), closeSoftKeyboard());

        onView(withId(R.id.editNumber3))
                .perform(typeText(String.valueOf(rcg.generateRandomInteger())), closeSoftKeyboard());

        onView(withId(R.id.editNumber4))
                .perform(typeText(String.valueOf(rcg.generateRandomInteger())), closeSoftKeyboard());

        onView(withId(R.id.goRandomNumber)).perform(click());
    }

    @Override
    public void useChooseRandomNumber(int number1, int number2, int number3, int number4) {
        RandomChoiceGenerator rcg = new RandomChoice();

        onView(withId(R.id.buttonChooseRandomNumber)).perform(click());

        onView(withId(R.id.editNumber))
                .perform(typeText(String.valueOf(number1)), closeSoftKeyboard());

        onView(withId(R.id.editNumber2))
                .perform(typeText(String.valueOf(number2)), closeSoftKeyboard());

        onView(withId(R.id.editNumber3))
                .perform(typeText(String.valueOf(number3)), closeSoftKeyboard());

        onView(withId(R.id.editNumber4))
                .perform(typeText(String.valueOf(number4)), closeSoftKeyboard());

        onView(withId(R.id.goRandomNumber)).perform(click());

        try {
            Thread.sleep(WAIT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        onView(withId(R.id.goRandomNumber)).perform(click());

        onView(withId(R.id.goRandomNumber)).perform(click());

        try {
            Thread.sleep(WAIT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        onView(withId(R.id.goRandomNumber)).perform(click());
    }

    @Override
    public void pressHardwareButtonBack(){
        onView(isRoot()).perform(pressBack());
    }
}
