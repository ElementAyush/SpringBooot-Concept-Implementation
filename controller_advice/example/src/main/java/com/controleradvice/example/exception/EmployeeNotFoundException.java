package com.controleradvice.example.exception;

import com.controleradvice.example.exceptionmodel.UserNotFound;

public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException(String userNotFound){
        super(userNotFound) ;
    }
}
