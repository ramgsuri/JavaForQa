package com.oops.ems.domain;

public class FullTimeEmployee extends Employee {

    @Override
    public double getSalary() {
        System.out.println("Fetch Salary of a full time employee");
        return super.getSalary();
    }
}
