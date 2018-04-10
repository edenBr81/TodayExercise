
package com.example.classexercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Organization newOrganization;
        boolean employeeform = false;
        boolean organizationform = false;
        Employee newemployee;
        String organizationanswer = "";
        String employeeanswer = "";

        ArrayList<Organization> organizations = new ArrayList<>();
        do {
            System.out.println("Enter Name of Organization");
            newOrganization = new Organization(keyboard.nextLine());

            System.out.println("Your Organization is called:" + newOrganization.getName());


            do {
                newemployee = new Employee();
                System.out.println("Enter Employee First Name:");
                newemployee.setEmployeeFirstName(keyboard.nextLine());

                System.out.println("Enter Employee Last Name:");
                newemployee.setEmployeeLastName(keyboard.nextLine());

                System.out.println("Enter Employee Number:");
                newemployee.setEmployeenumber(keyboard.nextLine());

                System.out.println("Your employee details:Employee First Name:" + newemployee.getEmployeeFirstName() + "Employee Last Name:" + newemployee.getEmployeeLastName() + "Employee Number:" + newemployee.getEmployeenumber());

                newOrganization.addEmployee(newemployee);

                System.out.println("Do you want Enter Another Employee?");
                employeeanswer=keyboard.nextLine();

                if (employeeanswer.equalsIgnoreCase("no") || employeeanswer.equalsIgnoreCase("n"))

                employeeform = true;
                System.out.println("You Responded:" + (employeeform ? "Its Fine" : "not yet"));

            } while(!employeeform);

            organizations.add(newOrganization);

            System.out.println("Do you want enter Another Organization?");
            organizationanswer = keyboard.nextLine();

            if (organizationanswer.equalsIgnoreCase("no") || organizationanswer.equalsIgnoreCase("n")) {
            organizationform = true;
        }
        } while (!organizationform);
        for (Organization eachorganization:organizations) {
            System.out.println("These are employees for:" + eachorganization.getName());
            for (Employee eachEmployee:eachorganization.getTheEmployees())
            {
                System.out.println(" These are the details of employee: First Name:" + eachEmployee.getEmployeeFirstName() + " Last Name:" + eachEmployee.getEmployeeLastName() + " Number:" + eachEmployee.getEmployeenumber());

            }
        }
    }
}
