package com.hr.client;

import com.hr.Employee;
import com.hr.WorkException;
import com.transportation.DestinationUnreachableException;

public class EmployeeClient {

    public static void main(String[] args) {
        // create an instance of Employee
        Employee emp = new Employee("Dai");

        // call goToWork() on the Employee object
        try {
            emp.goToWork();
        } catch (WorkException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());   //  extracts the nested 'cause'
            System.out.println();
            e.printStackTrace();
        }
    }
}