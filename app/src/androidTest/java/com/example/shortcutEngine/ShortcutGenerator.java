package com.example.shortcutEngine;

public interface ShortcutGenerator {

    void useRandomNumberGenerator();

    void useRandomNumberGenerator(int times);

    void useRandomStringGenerator();

    void useRandomStringGenerator(int times);

    void useChooseRandomlyString();
    void useChooseRandomlyString(String string1, String string2, String string3, String string4);

    void useChooseRandomNumber();
    void useChooseRandomNumber(int number1, int number2, int number3, int number4);

    void pressHardwareButtonBack();

    void useCrudOperationsButton();
}
