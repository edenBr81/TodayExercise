
package com.example.classexercise;

import java.util.ArrayList;

public class Organization {
    private String name;

    private ArrayList<Employee> theEmployees;

    public void addEmployee(Employee employee){
        theEmployees.add(employee);
    }
    public Organization(){
        theEmployees = new ArrayList<>();
    }
    public Organization (String name){
        this.name=name;
        theEmployees = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getTheEmployees() {
        return theEmployees;
    }

    public void setTheEmployees(ArrayList<Employee> theEmployees) {
        this.theEmployees = theEmployees;
    }
}