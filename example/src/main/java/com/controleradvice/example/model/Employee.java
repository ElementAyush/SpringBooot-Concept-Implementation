package com.controleradvice.example.model;

import org.springframework.validation.annotation.Validated;

@Validated
public class Employee {

    Integer id ;
    String name ;
    char[] password ;

    public Employee(Integer id, String name, char[] password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }
}
