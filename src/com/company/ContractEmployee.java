package com.company;

public class ContractEmployee extends Employee implements ICalculatePay {
    @Override
    public double CalculatePay() {
        return 0;
    }
}
