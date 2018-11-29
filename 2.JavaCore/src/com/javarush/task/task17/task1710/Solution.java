package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    public static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        Person p = null;
        String buffer = null;
        String name = null;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        try {
            buffer = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] data = buffer.split(" ");
        if (data[0].equals("-c")) {
            name = data[1];
            if (data[2].equals("м")) {
                p = Person.createMale(name, format.parse(data[3]));
                allPeople.add(p);
            } else if (data[2].equals("ж")) {
                p = Person.createFemale(name, format.parse(data[3]));
                allPeople.add(p);
            }
            System.out.println(allPeople.indexOf(p));

        } else if (data[0].equals("-u")) {
            int id = Integer.parseInt(data[1]);
            name = data[2];
            if (data[3].equals("м")) {
                allPeople.set(id, Person.createMale(name, format.parse(data[4])));
            }
            if (data[3].equals("ж")) {
                allPeople.set(id, Person.createFemale(name, format.parse(data[4])));
            }
        } else if (data[0].equals("-d")) {
            int id = Integer.parseInt(data[1]);
            allPeople.remove(id);
        } else if (data[0].equals("-i")) {
            int id = Integer.parseInt(data[1]);
            name = allPeople.get(id).getName();

            if (allPeople.get(id).getSex().equals(Sex.MALE)) {
                System.out.println(name + " м " + format.format(allPeople.get(id).getBirthDate()));
            }
            if (allPeople.get(id).getSex().equals(Sex.FEMALE)) {
                System.out.println(name + " ж " + format.format(allPeople.get(id).getBirthDate()));
            }
        }
    }
}
