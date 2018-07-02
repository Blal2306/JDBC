package com.app.service;

import com.app.domain.Employee;

public interface EmployeeService {
    public void insertEmployee(Employee employee);
    public int removeEmployee(int emplId);
}
