package com.company.homework.task1;

public class Task_1 {
    public static void main(String[] args) {
        int a = 0;
        double b = 45.6;
        double c = 86.4;
        try {
            System.out.println(div(b, a));
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        } catch (Exception e){
            System.out.println("Exception");
        }

    }

    public static double div(double a, double b) {
        return a/b;
    }
}
