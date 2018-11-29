package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        bufferedReader.close();
        FileReader fileReader = new FileReader(name);
        String text = "";

        int temp;
        while((temp = fileReader.read())!=-1){
            text = text + (String.valueOf((char)temp));
        }
        fileReader.close();
        String[] splitName = text.split("\\W");
        int count = 0;
        for(String currentName : splitName){
            if(currentName.equals("world")){
                count++;
            }
        }
        System.out.println(count);
    }
}
