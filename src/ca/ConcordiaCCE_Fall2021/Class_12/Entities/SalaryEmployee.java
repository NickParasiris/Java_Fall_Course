package ca.ConcordiaCCE_Fall2021.Class_12.Entities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SalaryEmployee extends Employee{

    private BigDecimal yearlyPay;

    public SalaryEmployee(int id, String name, BigDecimal yearlyPay) {
        super(id, name);
        this.yearlyPay = yearlyPay;
    }

    public BigDecimal getYearlyPay() {
        return yearlyPay;
    }

    public void setYearlyPay(BigDecimal yearlyPay) {
        this.yearlyPay = yearlyPay;
    }

    @Override
    public BigDecimal calculatePay()
    {
        BigDecimal monthlyPay = this.yearlyPay.divide(new BigDecimal("12"), RoundingMode.CEILING);

        determineOnlinePay(monthlyPay);

        return monthlyPay;
    }

}


