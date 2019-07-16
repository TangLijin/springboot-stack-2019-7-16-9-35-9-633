package com.tw.apistackbase.model;

import java.util.ArrayList;
import java.util.List;

public class Emplyee {
    private int id;
    private String name;
    private String gender;
    private int age;


//    public static List<Emplyee> createTestEmplpyees() {
//        List<Emplyee> employees = new ArrayList<>();
//        Emplyee emplyee = new Emplyee();
//        emplyee.setName("Xiaoming");
//        emplyee.setId(0);
//        emplyee.setAge(20);
//        emplyee.setGender("Male");
//        employees.add(emplyee);
//        return employees;
//    }

    public Emplyee(String name,int id, int age,String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public static List<Emplyee> createEmployeeList(){
        List<Emplyee> emplyeeList = new ArrayList<>();
        Emplyee emplyee = new Emplyee("Xiaoming",0,20,"Male");
        emplyeeList.add(emplyee);
        emplyee = new Emplyee("Xiaohong",1,19,"Female");
        emplyeeList.add(emplyee);
        emplyee = new Emplyee("Xiaozhi",2,15,"Male");
        emplyeeList.add(emplyee);
        emplyee = new Emplyee("Xiaogang",3,16,"Male");
        emplyeeList.add(emplyee);
        emplyee = new Emplyee("Xiaoxia",4,15,"Female");
        emplyeeList.add(emplyee);
        return emplyeeList;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
