package com.java.practice.collections;

import java.util.HashMap;
import java.util.Map;

public class EmployeeTester {
    public static void main(String[] args) {
        // Creating five employee objects
        Employee employeeOne = new Employee("a1234", "Steve Jobs", 50000);
        Employee employeeTwo = new Employee("a1235", "Scott McNealy", 40000);
        Employee employeeThree = new Employee("a1236", "Jeff Bezos", 60000);
        Employee employeeFour = new Employee("a1237", "Larry Ellison", 70000);
        Employee employeeFive = new Employee("a1238", "Bill Gates", 80000);
        
        // Declaration and initialization of employees map of key type String and value type Employee.
        Map<String, Employee> employees = new HashMap<String, Employee>();
        
        // Putting the employee objects in the map with their ids as keys.
        employees.put(employeeOne.getId(), employeeOne);
        employees.put(employeeTwo.getId(), employeeTwo);
        employees.put(employeeThree.getId(), employeeThree);
        employees.put(employeeFour.getId(), employeeFour);
        employees.put(employeeFive.getId(), employeeFive);
        
        // Printing the id and name of each employee in employees map.
        for (String employeeId: employees.keySet()) {
            Employee.printEmployee(employeeId, employees);
        }
        
        System.out.println("\nPrinting the employee when the id is A1234");
        Employee.printEmployeeWithUppercaseId("A1234", employees);
    }
}
