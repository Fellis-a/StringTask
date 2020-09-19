package com.company;

public class Logic {
    public static float Percent(String text){

        int before = text.length();//длина строки до изменений
        int after = text.replaceAll("[a-zA-Zа-яА-Я]", "").length();
        //замена букв вне зависмости от регистра на пробел при помощи регулярного выражения

        return (float)(before-after)/before*100;//процент букв, количество букв высчитывается разницей между до и после
    }
}
