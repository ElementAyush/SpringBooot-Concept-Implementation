package com.controleradvice.example.exception;

public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException(long id){
        super(String.format("Employe with %d not found",id)) ;
    }
}
