package com.javarush.task.task21.task2103;

/* 
Все гениальное - просто!
*/
public class Solution {
    public static boolean calculate(boolean a, boolean b, boolean c, boolean d) {
        //return (a && b && c && !d) || (!a && c) || (!b && c) || (c && d);
        //c* (a*b*!d + !a + !b + d)
        // && - умножение
        // || - сложение
        //return c && ((a && b && !d) || !a || !b || d);
        return c;
    }

    public static void main(String[] args) {

    }
}
