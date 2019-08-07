package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Tasks
        //1
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n;
        if(m > 0) {
            n = 1;
        } else if(m == 0) {
            n = 0;
        } else {
            n = -1;
        }
        System.out.println("n = " + n);
        //2
        int number = scanner.nextInt();
        if( number % 2 == 0) {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
        //3
        number = scanner.nextInt();
        if( number > 0) {
            System.out.println("Number is positive");
        } else if( number < 0) {
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is zero");
        }
        //4
        int sum = 0;
        int product = 1;

        for(int i = 0; i < 10; i++) {
            sum += i;
            product *= i;
        }
        System.out.println("Sum = " + sum + "\nProduct = " + product);
        //5
        System.out.println("Input count of rows");
        int size = scanner.nextInt();
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        //Homework
        //1
        System.out.println("Enter the year: ");
        int x = scanner.nextInt();
        if (((x % 4 == 0) && (x % 100 != 0)) || (x % 400 == 0))
            System.out.println("The year is leap");
            else System.out.println("This year is not leap");
        //2
        System.out.println("  *  \n *** \n*****");
        //3
        System.out.println("Input the number of terms: ");

        x = scanner.nextInt();

		int num = 0;
		int result = 0;
		for (int i = 0; i < x; i++) {
			num = num * 10 + 1;
			result += num;
			if (i == x - 1) {
				System.out.print(num);
				break;
			}
			System.out.print(num + " + ");
		}
		System.out.println("\nResult: " + result);
    }
}
