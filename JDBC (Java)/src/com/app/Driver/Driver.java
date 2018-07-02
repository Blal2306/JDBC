/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.Driver;

import com.app.domain.Employee;
import com.app.service.EmployeeService;
import com.app.service.EmployeeServiceImpl;

public class Driver {

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeServiceImpl();
        for(int i = 900; i <=910; i++){
            Employee e1 = new Employee(i,"A"+i,"B"+i);
            employeeService.insertEmployee(e1);
        }
        
//        for(int i = 1; i <=20; i++){
//            employeeService.removeEmployee(i);
//        }
//        
    }
    
}
