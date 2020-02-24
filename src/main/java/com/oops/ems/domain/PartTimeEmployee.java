package com.oops.ems.domain;

public class PartTimeEmployee extends Employee {

    @Override
    public double getSalary() {
        return super.getSalary() - 4000L;
    }
}
