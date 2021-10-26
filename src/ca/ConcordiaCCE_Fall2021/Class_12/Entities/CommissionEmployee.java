package ca.ConcordiaCCE_Fall2021.Class_12.Entities;

import java.math.BigDecimal;

public class CommissionEmployee extends SalaryEmployee{

    private BigDecimal commissionRate;

    public CommissionEmployee(int id, String name, BigDecimal yearlyPay, BigDecimal commissionRate) {
        super(id, name, yearlyPay);
        this.commissionRate = commissionRate;
    }

    public BigDecimal getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(BigDecimal commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public BigDecimal calculatePay()
    {
        BigDecimal monthlyPay = super.calculatePay().multiply(this.commissionRate);

        determineOnlinePay(monthlyPay);

        return  monthlyPay;
    }
}
