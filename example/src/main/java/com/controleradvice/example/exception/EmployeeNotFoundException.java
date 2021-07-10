package com.controleradvice.example.exception;

public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException(Long id){
        super(String.format("Employe with %d not found",id)) ;
    }
}
