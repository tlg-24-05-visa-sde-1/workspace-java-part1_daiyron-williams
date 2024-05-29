/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import java.time.LocalDate;

/** Application main-class. */
class HRClient {

  public static void main(String[] args) {
    // create Department object
    Department dept = new Department("Sales", "Seattle");
    System.out.println(dept); // toString() auto called

    // add Employees to it
    dept.addEmployee(new SalariedEmployee("Kami", LocalDate.of(1976, 11, 27), 2500.0));
    dept.addEmployee(new HourlyEmployee("Kira", LocalDate.of(1995, 9, 15), 75.0, 20.0));
    dept.addEmployee(new SalariedEmployee("Deaizsha", LocalDate.of(2000, 11, 11), 100_000));
    dept.addEmployee(new HourlyEmployee("Daiyron", LocalDate.of(1997, 6, 3), 25.50, 30));

    // list its Employees
    System.out.println("\nList employees:");
    dept.listEmployees();

    // make its Employees work
    System.out.println("\nMake employees work:");
    dept.workEmployees();

    // pay its Employees
    System.out.println("\nPay employees:");
    dept.payEmployees();

    // send SalariedEmployees on vacation
    System.out.println("\nSend SalariedEmployees on vacation:");
    dept.holidayBreak();
  }
}
