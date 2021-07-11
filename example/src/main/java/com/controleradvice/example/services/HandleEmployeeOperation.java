package com.controleradvice.example.services;

import com.controleradvice.example.exception.EmployeeNotFoundException;
import com.controleradvice.example.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HandleEmployeeOperation {

    List<Employee> employeeData = new ArrayList<>() ;


    public List<Employee> getEmployeeData(){

        return employeeData ;
    }

    public void addToemployeeData(Employee employee){

        employeeData.add(employee) ;
    }

    public Employee searchEmployeeById(long id){

        return employeeData.stream().filter(x -> x.getId() == id)
                .findAny()
                .get();
    }
}
