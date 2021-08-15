package com.example.End2EndTests;


import androidx.test.core.app.ActivityScenario;

import com.example.randomchoicehelperapplicationapp.MainActivity;
import com.example.shortcutEngine.Shortcut;
import com.example.shortcutEngine.ShortcutGenerator;

import org.junit.Before;
import org.junit.Test;


public class ComponentTests {

    @Before
    public void launchActivity() {
        ActivityScenario.launch(MainActivity.class);
    }

    /////////////////////////////////////////////////////////////////////////////
    //                          GENERATOR INT                                  ///
    //////////////////////////////////////////////////////////////////////////////


    @Test
    public void NumberGeneratorTest1(){
        ShortcutGenerator sc = new Shortcut();
        sc.useRandomNumberGenerator();
    }

    @Test
    public void NumberGeneratorTest2(){
        ShortcutGenerator sc = new Shortcut();
        sc.useRandomNumberGenerator(20);
    }

    /////////////////////////////////////////////////////////////////////////////
    //                          GENERATOR STRING                                  ///
    //////////////////////////////////////////////////////////////////////////////

    @Test
    public void StringGeneratorTest1(){
        ShortcutGenerator sc = new Shortcut();
        sc.useRandomStringGenerator();
    }

    @Test
    public void StringGeneratorTest2(){
        ShortcutGenerator sc = new Shortcut();
        sc.useRandomStringGenerator(10);
    }

    /////////////////////////////////////////////////////////////////////////////
    //                          CHOOSER STRING                                  ///
    //////////////////////////////////////////////////////////////////////////////


    @Test
    public void StringArrayChooserBiggerTest1(){
        ShortcutGenerator sc = new Shortcut();
        sc.useChooseRandomlyString();

    }

    @Test
    public void StringArrayChooserBiggerTest2(){
        String s1 = "Predestination";
        String s2 = "Memento";
        String s3 = "Triangle";
        String s4 = "Matrix";

        ShortcutGenerator sc = new Shortcut();
        sc.useChooseRandomlyString(s1,s2,s3,s4);

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

    /////////////////////////////////////////////////////////////////////////////
    //                          Biggest Test                                  ///
    //////////////////////////////////////////////////////////////////////////////

    @Test
    public void BiggusDickusTest(){
        String s1 = "Predestination";
        String s2 = "Memento";
        String s3 = "Triangle";
        String s4 = "Matrix";

        String s1a = "Eis";
        String s2a = "Pizza";
        String s3a = "Spaghetti";
        String s4a = "Doener";

        String s1b = "Monopoly";
        String s2b = "Risiko";
        String s3b = "Catan";
        String s4b = "Vier gewinnt";

        ShortcutGenerator sc = new Shortcut();
        sc.useChooseRandomlyString(s1,s2,s3,s4);

        sc.pressHardwareButtonBack();

        sc.useRandomNumberGenerator(10);

        sc.useRandomStringGenerator(10);

        sc.useChooseRandomlyString();

        sc.pressHardwareButtonBack();

        sc.useChooseRandomlyString(s1a,s2a,s3a,s4a);

        sc.pressHardwareButtonBack();

        sc.useChooseRandomlyString(s1b,s2b,s3b,s4b);
    }



}
