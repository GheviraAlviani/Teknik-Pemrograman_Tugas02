
/*s
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ghevira
 */
package id.ac.polban.employee.main;

import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.*;

public class MainApp {

    public static void main(String[] args) {

        Department it = new Department("IT");
        EmploymentType fulltime = new EmploymentType("Fulltime");

        Employee emp1 = new Employee("Andi", it, fulltime, 5000000);

        EmployeeService service = new EmployeeService();
        service.addEmployee(emp1);

        System.out.println("Total Employee: " + Employee.getTotalEmployee());
    }
}
