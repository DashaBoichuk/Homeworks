package com.company.homework.task2;

import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Olya", 3));
        students.add(new Student("Vanya", 3));
        students.add(new Student("Vitya", 2));
        students.add(new Student("Anya", 5));
        students.add(new Student("Anya", 4));

        System.out.println(students);

        students.sort((o1, o2) -> {
            if (!o1.getName().equals(o2.getName()))
                return (o1.getName().compareTo(o2.getName()));
            else return Integer.compare(o1.getCourse(), o2.getCourse());
        });

        System.out.println(students);

        students.sort((o2, o1) -> {
            if (!o1.getName().equals(o2.getName()))
                return (o1.getName().compareTo(o2.getName()));
            else return Integer.compare(o1.getCourse(), o2.getCourse());
        });

        System.out.println(students);
    }
}
