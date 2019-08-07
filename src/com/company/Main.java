package com.company;

public class Main {

    public enum Continents { Asia, Africa, Australia, Antarctica, Europea, NorthAmerica, SouthAmerica }

    public static void main(String[] args) {
        //1
        Continents continent = Continents.Europea;
        switch (continent) {
            case Asia:
                System.out.println("Thailand, " + "Cambodia, " + "Vietnam");
                break;
            case Africa:
                System.out.println("Egypt, " + "Botswana, " + "Angola");
                break;
            case Australia:
                System.out.println("Australia");
                break;
            case Antarctica:
                System.out.println(":)");
            case Europea:
                System.out.println("Ukraine, " + "France, " + "Germany");
                break;
            case NorthAmerica:
                System.out.println("Canada, " + "U.S.A., " +  "Mexico");
                break;
            case SouthAmerica:
                System.out.println("Bolivia, " + "Chili, " + "Argentina");
                break;
        }
        //2
        int array[] = {4, 7, 8, -5,-2, 9, 0, 13, 7, 17};
        System.out.print("The biggest: ");
        int max = array[0];
        for (int i = 0; i < 10; i++) {
            if (max < array[i])
                max = array[i];
        }
        System.out.println(max);

        System.out.print("Summ of positive: ");
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);

        int amountP = 0, amountN = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] > 0) {
                amountP ++;
            } else if (array[i] < 0) {
                amountN ++;
            }
        }
        System.out.println("Amount of positive: " + amountP + "\nAmount of negative: " + amountN);

        if (amountN > amountP) {
            System.out.println("It's more negative numbers in array");
        } else  System.out.println("It's more positive numbers in array");
    }
}
