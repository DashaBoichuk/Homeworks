package com.company;

import sun.management.Agent;

import java.util.Calendar;

public class Person {

    private String name;
    private int birthYear;

    public Person () {}

    public Person (String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public int Age () {
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int age = year - this.birthYear;
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
