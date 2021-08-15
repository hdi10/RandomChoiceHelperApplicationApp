package com.example.End2EndTests;

import androidx.test.core.app.ActivityScenario;

import com.example.randomchoicehelperapplicationapp.MainActivity;
import com.example.shortcutEngine.Shortcut;
import com.example.shortcutEngine.ShortcutGenerator;

import org.junit.Before;
import org.junit.Test;

public class E2ETests {

    @Before
    public void launchActivity() {
        ActivityScenario.launch(MainActivity.class);
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

        String s1c = "Kino";
        String s2c = "Theater";
        String s3c = "Park";
        String s4c = "Netflix";

        String s1d = "Bus";
        String s2d = "Bahn";
        String s3d = "Flugzeug";
        String s4d = "Schiff";

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
        sc.pressHardwareButtonBack();

        sc.useChooseRandomlyString(s1c,s2c,s3c,s4c);
        sc.pressHardwareButtonBack();

        sc.useChooseRandomlyString(s1d,s2d,s3d,s4d);
    }

}
