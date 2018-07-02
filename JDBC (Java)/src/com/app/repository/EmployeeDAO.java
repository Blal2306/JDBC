package com.app.repository;

import com.app.domain.Employee;

public interface EmployeeDAO {
    public void insert(Employee employee);
    public int delete(int emplId);
}
