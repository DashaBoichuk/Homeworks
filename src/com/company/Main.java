package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1
        System.out.println("Enter radius");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        double perimeter = radius * 2 * Math.PI;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("perimeter = " + perimeter + "\narea = " + area);
        //2
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}
