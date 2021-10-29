package ca.ConcordiaCCE_Fall2021.Class_12.Entities;

import java.math.BigDecimal;

public class HourlyEmployee extends Employee implements IAttendance {

    private BigDecimal hourlyRate;

    private boolean signedIn = false;

    public HourlyEmployee(int id, String name, BigDecimal hourlyRate) {
        super(id, name);
        this.hourlyRate = hourlyRate;
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public BigDecimal calculatePay()
    {
        BigDecimal monthlyPay = this.hourlyRate.multiply(new BigDecimal("160"));

        determineOnlinePay(monthlyPay);

        return monthlyPay;
    }

    @Override
    public void signIN() {
        System.out.println("The employee has signed in...");
        this.signedIn = true;
    }

    @Override
    public void signOut() {
        System.out.println("The employee has signed out...");
        this.signedIn = false;
    }

    @Override
    public boolean isSignedIn() {
        return false;
    }
}
