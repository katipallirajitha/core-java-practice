package com.java.practice.collections;

import java.util.Map;

/**
 * @author Rajitha Katipalli
 *
 *         Employee class holds details of an employee.
 */
public class Employee {
    /**
     * Instance Variables for Employee class.
     */
    private String id;
    private String name;
    private double salary;

    /**
     * Parameterized Constructor for Employee class.
     * 
     * @param id
     * @param name
     * @param salary
     */
    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * Getter method for id of the employee.
     * 
     * @return ID of the employee
     */
    public String getId() {
        return id;
    }

    /**
     * Setter method for id of the employee.
     * 
     * @param id
     *            ID of the employee
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter method for name of the employee.
     * 
     * @return name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name of the employee.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for salary of the employee.
     * 
     * @return salary of the employee
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Setter method for salary of the employee.
     * 
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * This method prints the id and name of an employee by looking up the employee by id in an employees map.
     * 
     * @param id
     *            ID of the employee whose details are to be printed
     * @param employees
     *            Map of Employees having id as the key and Employee object as value
     */
    static void printEmployee(String id, Map<String, Employee> employees) {
        System.out.println("Employee ID: " + id + ", Employee Name: " + employees.get(id).getName());
    }

    /**
     * This method prints the id and name of an employee by looking up the employee by id in an employees map (Ignores
     * the case of alphabets in the id).
     * 
     * @param id
     *            ID of the employee whose details are to be printed
     * @param employees
     *            employees Map of Employees having id as the key and Employee object as value
     */
    static void printEmployeeWithUppercaseId(String id, Map<String, Employee> employees) {
        System.out.println("Employee ID: " + id.toLowerCase() + ", Employee Name: " + employees.get(id.toLowerCase()).getName());
    }
}
