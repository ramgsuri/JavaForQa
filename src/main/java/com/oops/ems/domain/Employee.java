package com.oops.ems.domain;

import java.util.Date;

public class Employee {

    private String       name;
    private Long         id;
    private String       address;
    private Organization org;
    private String       designation;
    private double       salary;

    public Employee() {
    }

    public Employee(String name, Long id, String address, Organization org, String designation, double salary) {
        this.setName(name);
        this.setId(id);
        this.setAddress(address);
        this.setOrg(org);
        this.setDesignation(designation);
        this.setSalary(salary);
    }

    public double getSalary() {
        System.out.println("Fetch Salary of an employee");
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void setOrg(Organization org) {
        this.org = org;
        try {
            org.setEmployeeDetails(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void join() {

    }

    public void join(Date date) {

    }

    public Organization getOrg() {
        return org;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void printEmployeeDetails(Employee employee) {

        System.out.println(employee.getSalary());


    }
}