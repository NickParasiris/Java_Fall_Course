package ca.ConcordiaCCE_Fall2021.Class_12;

import ca.ConcordiaCCE_Fall2021.Class_12.Entities.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class EmployeeApp {
    public static void main(String[] args) {


        List<Employee> employeeList = new ArrayList<>();

        SalaryEmployee se1 = new SalaryEmployee(1,"Nick",new BigDecimal("75000.00"));
        CommissionEmployee ce1 = new CommissionEmployee(2, "Gary",new BigDecimal("80000"),new BigDecimal("1.10"));
        HourlyEmployee he1 = new HourlyEmployee(3, "Sandra", new BigDecimal("65.00"));

        employeeList.add(se1);
        employeeList.add(ce1);
        employeeList.add(he1);

        he1.signIN();

        BigDecimal totalPay = new BigDecimal("0.00");

        for (Employee e : employeeList)
        {
            totalPay = totalPay.add(e.calculatePay());
        }

        System.out.println("The total pay for all employees is " + totalPay);


//        System.out.println(se1.calculatePay());
//        System.out.println(ce1.calculatePay());
//        System.out.println(he1.calculatePay());

    }
}
