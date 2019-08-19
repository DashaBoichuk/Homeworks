package com.company.homework.task2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println(readNumber(4, 15));
    }

    public static int readNumber(int start, int end) {
        Scanner scanner = new Scanner(System.in);
        int currentNum = 0;
        String currentNumS = scanner.next();
        try {
            currentNum = Integer.parseInt(currentNumS);
        } catch (NumberFormatException e) {
            System.out.println("Wrong number");
        }
        if ((currentNum > start) && (currentNum < end))
            return currentNum;
        return 0;
    }
}
