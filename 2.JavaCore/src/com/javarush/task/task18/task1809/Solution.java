package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(name1);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (fileInputStream.available() > 0){
            arrayList.add(fileInputStream.read());
        }
        FileOutputStream fileOutputStream = new FileOutputStream(name2);
        for(int i = arrayList.size() - 1; i >= 0; i--){
            fileOutputStream.write(arrayList.get(i));
        }
        fileInputStream.close();
        fileOutputStream.close();

    }
}