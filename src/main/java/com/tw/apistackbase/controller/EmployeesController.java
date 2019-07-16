package com.tw.apistackbase.controller;


import com.tw.apistackbase.model.Emplyee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/employees")
public class EmployeesController {

    //    private  static List<Emplyee> emplyeeList = new ArrayList<>();
    private static List<Emplyee> emplyeeList = Emplyee.createEmployeeList();

//    public EmployeesController() {
//        emplyeeList = Emplyee.createEmployeeList();
//    }

//    public static void getEmployeeList(){
//        emplyeeList = Emplyee.createEmployeeList();
//    }


//    @GetMapping
//    public List<Emplyee> getAllEmployees(){
////        return Emplyee.createEmployeeList();
//        return emplyeeList;
//
//    }


    @GetMapping(value = "/1")
    public Emplyee getAnEmployee(@RequestParam int index) {
        return emplyeeList.get(index);
    }

    @GetMapping
    public List<Emplyee> getEmployeeOfSpecificGender(@RequestParam(value = "gender", required = false, defaultValue = "null") String gender,
                                                     @RequestParam(value = "page", required = false, defaultValue = "-1") Integer page,
                                                     @RequestParam(value = "pageSize", required = false, defaultValue = "-1") Integer pageSize) {
        if (gender != null) {
            List<Emplyee> result = new ArrayList<>();
            for (Emplyee emplyee : emplyeeList) {
                if (emplyee.getGender() == gender) {
                    result.add(emplyee);
                }
            }
            return result;
        } else if(page > -1){

            return emplyeeList;
        }else{
            return emplyeeList;
        }
    }


//    @GetMapping
//    public List<Emplyee> getEmployeeOfSpecificGender(@RequestParam String gender){
//        List<Emplyee> result = new ArrayList<>();
//        for(Emplyee emplyee : emplyeeList){
//            if(emplyee.getGender() == gender){
//                result.add(emplyee);
//            }
//        }
//        return result;
//    }



    @PostMapping
    public List<Emplyee> addEmproyee(@RequestBody Emplyee emplyee){

        emplyeeList.add(emplyee);
        return emplyeeList;

    }

//    @DeleteMapping
//    public List<Emplyee> deleteEmproyee(@RequestParam int index){
//        emplyeeList.remove(index);
//        return emplyeeList;
//    }

    @DeleteMapping(value = "/{id}")
    public List<Emplyee> deleteEmproyee(@PathVariable int id){
        Iterator<Emplyee> iterator = emplyeeList.iterator();
        while (iterator.hasNext()){
            if(iterator.next().getId() == id){
                iterator.remove();
                break;
            }
        }
        return emplyeeList;
    }

    @PutMapping
    public List<Emplyee> alterEmproyee(@RequestBody Emplyee emplyee){
        return emplyeeList.stream().map(e -> e.getId() == emplyee.getId() ? e : emplyee).collect(Collectors.toList());
    }


}
