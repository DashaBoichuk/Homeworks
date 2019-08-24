package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new ContractEmployee(1, "Cont 1", "fedTaxIdMem1", 5000));
        employees.add(new SalariedEmployee(2, "Sal 1", "SocSecNum1", 70, 80));
        employees.add(new SalariedEmployee(3, "Sal 2", "SocSecNum2", 60, 70));

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("After sorting ascending: ");

        Collections.sort(employees, (o1, o2) -> {
            if ( ((ICalculatePay)o1).calculatePay() != ((ICalculatePay)o2).calculatePay() )
                return Double.compare(((ICalculatePay)o1).calculatePay(), ((ICalculatePay)o2).calculatePay());
            else
                return o1.getName().compareTo(o2.getName());
        });

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("After sorting descending: ");

        Collections.sort(employees, (o2, o1) -> {
            if ( ((ICalculatePay)o1).calculatePay() != ((ICalculatePay)o2).calculatePay() )
                return Double.compare(((ICalculatePay)o1).calculatePay(), ((ICalculatePay)o2).calculatePay());
            else
                return o1.getName().compareTo(o2.getName());
        });

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
