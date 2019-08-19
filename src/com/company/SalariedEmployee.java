package com.company;

public class SalariedEmployee extends Employee implements ICalculatePay {
    private String socialSecurityNumber;
    @Override
    public double CalculatePay() {
        return 0;
    }
}
