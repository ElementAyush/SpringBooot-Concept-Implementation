package com.controleradvice.example.controller;

import com.controleradvice.example.model.Employee;
import com.controleradvice.example.services.HandleEmployeeOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Validated
public class EmployeeController {

    @Autowired
    private HandleEmployeeOperation handleEmployeeOperation ;

    @GetMapping("/employee")
    public ResponseEntity<?> employeeList(){

        List<Employee> employeData = handleEmployeeOperation.getEmployeeData() ;
        return ResponseEntity.ok(employeData) ;
    }

    @PostMapping("/employee")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee addEmployee(@Valid @RequestBody Employee employeeData){

        handleEmployeeOperation.addToemployeeData(employeeData) ;
     return employeeData ;
    }

}
