package com.company;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Anna", 1999);
        Person p2 = new Person("Karina", 1987);
        Person p3 = new Person("Sasha", 1959);
        Person p4 = new Person("Arsen", 1998);
        Person p5 = new Person("Andriy", 1995);

        Employee em1 = new Employee("Maria", 80, 50);
        Employee em2 = new Employee("Igor", 70);
        em2.setHours(45);
        Employee em3 = new Employee("Nazar", 90, 30);

        System.out.println("Total hours of all workers: " + Employee.getTotalHours());
    }
}
