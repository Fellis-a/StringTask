package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {
   @Test
    void LettersPercent() {
        String text = "hm...";
        float result = Logic.Percent(text);

        assertEquals(40, result);

    }
    @Test
    void BigLettersPercent() {
        String text = "HM...";
        float result = Logic.Percent(text);

        assertEquals(40, result);

    }
    @Test
    void NumLettersPercent() {
        String text = "25-07-45";
        float result = Logic.Percent(text);

        assertEquals(0, result);

    }
    @Test
    void DifferentLettersPercent() {
        String text = "он сказал Hi ^_^";
        float result = Logic.Percent(text);

        assertEquals(62.5, result);

    }
}
