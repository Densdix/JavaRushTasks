package com.javarush.task.task22.task2210;

import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {

    }
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        String s[] = new String[stringTokenizer.countTokens()];
        for(int i = 0; stringTokenizer.hasMoreTokens(); i++){
            s[i] = stringTokenizer.nextToken();
        }
        return s;
    }
}
