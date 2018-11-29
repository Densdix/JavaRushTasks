package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    public static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) {
        ArrayList<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Arrow", 3, 0));
        horses.add(new Horse("Flash", 3, 0));
        horses.add(new Horse("Atom", 3, 0));
        game = new Hippodrome(horses);
        game.getHorses();
        game.run();
        game.printWinner();
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() {
        for(int i = 0; i < 100; i++){
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void move() {
        for(Horse horse : horses){
            horse.move();
        }
    }

    public void print() {
        for(Horse horse : horses){
            horse.print();
        }
        for(int i = 0; i < 10; i++){
            System.out.println();
        }
    }
    public Horse getWinner(){
        return horses.stream().max(Comparator.comparing(Horse::getDistance)).get();
    }

    public void printWinner(){
        System.out.println("Winner is "+getWinner().getName()+"!");
    }
}
