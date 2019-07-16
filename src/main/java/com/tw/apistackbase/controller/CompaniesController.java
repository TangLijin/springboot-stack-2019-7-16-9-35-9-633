package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Company;
import com.tw.apistackbase.model.Emplyee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class CompaniesController {
    private static List<Company> companyList ;

    @GetMapping(value = "/1")
    public Emplyee getAnEmployee(@RequestParam int index) {
        return companyList.get(index).getEmployees().get(index);
    }

}
