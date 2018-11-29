package com.javarush.task.task22.task2212;

import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Проверка номера телефона
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null || "".equals(telNumber))
            return false;
        int numberCount = telNumber.replaceAll("\\D", "").length();

        if(telNumber.matches("\\+\\d+?(\\(\\d{3}\\))?(\\d+-){0,2}?\\d+$") && numberCount == 12){
            return true;
        }
        if(telNumber.matches("\\d?(\\(\\d{3}\\))?(\\d+-){0,2}?\\d+$") && numberCount == 10){
            return true;
        }

        return false;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {


    }
}
