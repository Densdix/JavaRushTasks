package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        SortedSet<Integer> set = new TreeSet<>();

        while(fileInputStream.available() > 0) {
            set.add(fileInputStream.read());
        }
        for(Integer s : set)
            System.out.print(s + " ");
        //set.stream().forEachOrdered(x -> System.out.print(x+" "));
        bufferedReader.close();
        fileInputStream.close();
    }
}
