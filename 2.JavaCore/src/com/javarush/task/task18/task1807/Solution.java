package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileReader = new FileInputStream(bufferedReader.readLine());
        int countChar = 0;
        while (fileReader.available() > 0){
            if(fileReader.read() == ','){
                countChar++;
            }
        }
        bufferedReader.close();
        fileReader.close();
        System.out.println(countChar);
    }
}
