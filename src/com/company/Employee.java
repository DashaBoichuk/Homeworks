package com.company;

public class Employee {
    private String name;
    private double rate;
    private int hours;
    private static int totalHours;

    public Employee () {}

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalHours += hours;
    }

    public double Salary() {
        return rate * hours;
    }

    public void changeRate(double rate) {
        this.rate = rate;
    }

    public double Bonuses (double bonus) {
        return Salary() * bonus;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        totalHours = totalHours - this.hours + hours;
        this.hours = hours;
    }

    public static int getTotalHours() {
        return totalHours;
    }
}
