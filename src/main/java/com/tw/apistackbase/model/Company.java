package com.tw.apistackbase.model;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String companyName;
    private int employeesNumber;
    private List<Emplyee> employees;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(int employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    public List<Emplyee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Emplyee> employees) {
        this.employees = employees;
    }

    public static List<Company> createCompanyList(){
        List<Emplyee> emplyeeList = Emplyee.createEmployeeList();
        Company company = new Company();
        company.setEmployees(emplyeeList);
        company.setCompanyName("alibaba");
        company.setEmployeesNumber(200);
        List<Company> companyList = new ArrayList<>();
        return companyList;
    }
}
