package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Tasks
        //1
        System.out.println("Hello world");
        //2
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("a + b = " + (a + b) + "\na - b = " + (a - b) + "\na * b = " + (a * b) + "\na / b = " + (a / b));
        //3
        System.out.println("How are you?");
        String answer = scanner.next();
        System.out.println("I am " + answer);
        //4
        int x = scanner.nextInt();
        System.out.println("pow x = " + Math.pow(x, 2) + "\nsqrt x = " + Math.sqrt(x));
        //Homework
        //1
        System.out.println("Enter radius");
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
