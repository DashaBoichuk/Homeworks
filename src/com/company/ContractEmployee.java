package com.company;

public class ContractEmployee extends Employee implements ICalculatePay {
    private String federalTaxIdmember;
    private int fixedMonthlyPayment;

    public ContractEmployee(int employeeID, String name, String federalTaxIdmember, int fixedMonthlyPayment) {
        super(employeeID, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return getFixedMonthlyPayment();
    }

    public int getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdmember='" + federalTaxIdmember + '\'' +
                ", fixedMonthlyPayment=" + fixedMonthlyPayment +
                ", employeeID=" + employeeID +
                ", name='" + name + '\'' +
                '}';
    }
}

