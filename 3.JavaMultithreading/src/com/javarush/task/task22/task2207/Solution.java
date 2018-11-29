package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        BufferedReader reader = new BufferedReader(new FileReader(name));

        ArrayList<String> wordList = new ArrayList<>();
        LinkedHashSet<Pair> list = new LinkedHashSet<>();

        while (reader.ready()){
            String line = reader.readLine();
            String[] wordsArr = line.split(" ");
            wordList.addAll(Arrays.asList(wordsArr));
        }



        for(int i = 0; i < wordList.size() - 1; i ++){
            StringBuilder stringBuilder = new StringBuilder(wordList.get(i));
            String reverseString = stringBuilder.reverse().toString();
            if(reverseString.equals(wordList.get(i + 1)) || wordList.get(i).equals(wordList.get(i+1))) {
                    list.add(new Pair(wordList.get(i), wordList.get(i+1)));
                }
        }

        result.addAll(list);

        for(Pair pair : result){
            System.out.println(pair);
        }


    }


    public static class Pair {
        String first;
        String second;

        public Pair() {
        }

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
