package com.tw.apistackbase.controller;


import com.tw.apistackbase.model.Emplyee;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/employees")
public class EmployeesController {

//    private  static List<Emplyee> emplyeeList = new ArrayList<>();
    private  static List<Emplyee> emplyeeList = Emplyee.createEmployeeList();

//    public EmployeesController() {
//        emplyeeList = Emplyee.createEmployeeList();
//    }

//    public static void getEmployeeList(){
//        emplyeeList = Emplyee.createEmployeeList();
//    }


    @GetMapping
    public List<Emplyee> getAllEmployees(){
//        return Emplyee.createEmployeeList();
        return emplyeeList;
    }


    @PostMapping
    public List<Emplyee> addEmproyee(@RequestBody Emplyee emplyee){

        emplyeeList.add(emplyee);
        return emplyeeList;

    }

    @DeleteMapping
    public List<Emplyee> deleteEmproyee(@RequestParam int index){
        emplyeeList.remove(index);
        return emplyeeList;
    }

    @PutMapping
    public List<Emplyee> alterEmproyee(@RequestBody Emplyee emplyee){
        return emplyeeList.stream().map(e -> e.getId() == emplyee.getId() ? e : emplyee).collect(Collectors.toList());
    }


}
