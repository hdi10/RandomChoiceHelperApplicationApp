package com.example.randomchoicehelperapplicationapp;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.core.app.ActivityScenario;

import com.example.randomchoicehelperapplicationapp.randomclass.RandomChoice;
import com.example.randomchoicehelperapplicationapp.randomclass.RandomChoiceGenerator;
import com.example.shortcutEngine.Shortcut;
import com.example.shortcutEngine.ShortcutGenerator;

import org.junit.Before;
import org.junit.Test;

public class ChooseRandomNumberTests {

    private static final long WAIT = 1000;

    @Before
    public void launchActivity() {
        ActivityScenario.launch(MainActivity.class);
    }

    /////////////////////////////////////////////////////////////////////////////
    //                          CHOOSER INT                                  ///
    //////////////////////////////////////////////////////////////////////////////

    @Test
    public void NumberArrayChooserBiggerTest1(){
        ShortcutGenerator sc = new Shortcut();
        sc.useChooseRandomNumber();
    }

    @Test
    public void NumberArrayChooserBiggerTest2(){
        int i1 = 1981;
        int i2 = 1972;
        int i3 = 1955;
        int i4 = 2006;

        ShortcutGenerator sc = new Shortcut();
        sc.useChooseRandomNumber(i1,i2,i3,i4);
    }

    @Test
    public void NumberArrayChooserBiggerTest3(){
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

    @Test
    public void NumberArrayChooserBiggerTest4(){


        int i1 = 1981;
        int i2 = 1972;
        int i3 = 1955;
        int i4 = 2006;

        onView(withId(R.id.buttonChooseRandomNumber)).perform(click());

        onView(withId(R.id.editNumber))
                .perform(typeText(String.valueOf(i1)), closeSoftKeyboard());

        onView(withId(R.id.editNumber2))
                .perform(typeText(String.valueOf(i2)), closeSoftKeyboard());

        onView(withId(R.id.editNumber3))
                .perform(typeText(String.valueOf(i3)), closeSoftKeyboard());

        onView(withId(R.id.editNumber4))
                .perform(typeText(String.valueOf(4)), closeSoftKeyboard());

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


}
