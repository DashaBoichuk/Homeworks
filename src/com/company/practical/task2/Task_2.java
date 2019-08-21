package com.company.practical.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task_2 {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(32, "Mary");
        employeeMap.put(12, "Andriy");
        employeeMap.put(23, "Arsen");
        employeeMap.put(54, "Igor");
        employeeMap.put(20, "Olia");
        employeeMap.put(34, "Vlad");
        employeeMap.put(25, "Anna");

        System.out.println(employeeMap);

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if (employeeMap.containsKey(age))
            System.out.println(employeeMap.get(age));
        else
            System.out.println("There is not such key");

        String name = scanner.next();
        boolean enable = false;

        Set<Integer> kSet = employeeMap.keySet();
        for (Integer key : kSet) {
            if (employeeMap.get(key).equals(name)) {
                System.out.println(key);
                enable = true;
            }
        }
        if (!enable)
            System.out.println("There is not such key");
    }
}
