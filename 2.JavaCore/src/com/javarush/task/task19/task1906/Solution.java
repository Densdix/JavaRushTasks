package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        bufferedReader.close();
        FileReader fileReader = new FileReader(name1);
        FileWriter fileWriter = new FileWriter(name2);

        int currentByte;
        for(int i = 1; fileReader.ready(); i++){
            currentByte = fileReader.read();
            if(i % 2 == 0){
                fileWriter.write(currentByte);
            }
        }

        fileReader.close();
        fileWriter.close();
    }
}
