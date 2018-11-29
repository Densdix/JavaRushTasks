package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        //String s = "D:/text2.txt";
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (fileInputStream.available() > 0){
            arrayList.add(fileInputStream.read());
        }
        bufferedReader.close();
        fileInputStream.close();

        //1 1 2 3 4 5 5 5 6 7 8 8 5 6 8 3 2 1
        int repeat = 0;
        int maxRepeat = 0;
        int maxNumber = -1;
        for (int i = 0; i < arrayList.size(); i++){
            for(int j = 0; j < arrayList.size(); j++){
                if(arrayList.get(i) == arrayList.get(j)){
                    repeat++;
                }
            }
            if(maxRepeat < repeat){
                maxRepeat = repeat;
                maxNumber = arrayList.get(i);
            }
            repeat = 0;
        }

        for(int number : arrayList){
            if(number == maxNumber){
                System.out.printf(number+" ");
            }
        }
    }
}
