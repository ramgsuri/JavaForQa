package com.oops.ems.domain;

public class PartTimeEmployee extends Employee {

    @Override
    public double getSalary() {
        System.out.println("Fetch Salary of a part time employee");
        return super.getSalary() - 4000L;
    }
}
