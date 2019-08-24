package com.company;

public class SalariedEmployee extends Employee implements ICalculatePay {
    private String socialSecurityNumber;
    private int numberOfHoursWorked;
    private int hourlyRate;


    public SalariedEmployee(int employeeID, String name, String socialSecurityNumber, int hourlyRate, int numberOfHoursWorked) {
        super(employeeID, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    @Override
    public double calculatePay() {
        return (getHourlyRate() * getNumberOfHoursWorked());
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", numberOfHoursWorked=" + numberOfHoursWorked +
                ", hourlyRate=" + hourlyRate +
                ", employeeID=" + employeeID +
                ", name='" + name + '\'' +
                '}';
    }
}
