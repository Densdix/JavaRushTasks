package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        BufferedReader reader = new BufferedReader(new FileReader(name1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(name2));
        String text = "";
        while(reader.ready()){
            text = text + reader.readLine();
        }
        text = text.replace(".", "!");
        writer.write(text);

        bufferedReader.close();
        reader.close();
        writer.close();
    }
}
