package com.company;

public class Main {

    public static void main(String[] args) {
        Employee em1 = new Employee("Maria", "Java", 50);
        Employee em2 = new Employee("Igor", ".Net", 70);
        Employee em3 = new Employee("Maria", "Java", 50);
        Employee em4 = new Employee("Anna", ".Net", 50);
        Employee em5 = new Employee("Sergiy", "Java", 20);

        //1
        Employee emWithMaxSalary = em1;
        Employee emWithMinSalary = em1;

        Employee[] allEm = {em1, em2, em3, em4, em5};
        for ( Employee employee : allEm) {
            if (employee.getSalary() < emWithMinSalary.getSalary())
                emWithMinSalary = employee;
            if (employee.getSalary() > emWithMaxSalary.getSalary())
                emWithMaxSalary = employee;
        }

        System.out.println("Employee with min salary: " + emWithMinSalary.toString());
        System.out.println("Employee with max salary: " + emWithMaxSalary.toString());
        //2
        System.out.println("Descending: ");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (allEm[i].compareTo(allEm[j]) == 1) {
                    Employee temp = allEm[i];
                    allEm[i] = allEm[j];
                    allEm[j] = temp;
                }
            }
        }
        for ( Employee employee : allEm) {
            System.out.println(employee.toString());
        }
        System.out.println("Ascending: ");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (allEm[i].compareTo(allEm[j]) == -1) {
                    Employee temp = allEm[i];
                    allEm[i] = allEm[j];
                    allEm[j] = temp;
                }
            }
        }
        for ( Employee employee : allEm) {
            System.out.println(employee.toString());
        }
        //3
        boolean exist = false;
        for ( Employee employee : allEm) {
            for ( Employee employee2 : allEm) {
                if (employee.equals(employee2)) {
                    exist = true;
                    break;
                }
            }
        }
        if (exist)
            System.out.println("There is two or more identical employeers");
        else System.out.println("There isn't two or more identical employeers");

    }
}
