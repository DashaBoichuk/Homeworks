package com.company.practical.tasks.task1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Task_1 task_1 = new Task_1();
        System.out.println(task_1.squareRectangle(a, b));
    }

    public int squareRectangle(int a, int b) throws ArithmeticException {
        if ((a < 0) || (b < 0)) throw new ArithmeticException("The value is negative");
        return a * b;
    }
}
