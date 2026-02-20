/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.polban.employee.model;

/**
 *
 * @author ghevira
 */
public class Employee {
    
    private static int counter = 0;

    private int id;
    private String name;
    private Department department;
    private EmploymentType type;
    private double salary;

    public Employee(String name, Department department, 
                EmploymentType type, double salary) {
    counter++;
    this.id = counter;
    this.name = name;
    this.department = department;
    this.type = type;
    this.salary = salary;
}
   
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public EmploymentType getType() {
        return type;
    }

    public double getSalary() {
        return salary;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setType(EmploymentType type) {
        this.type = type;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getTotalEmployee() {
    return counter;
}

}
