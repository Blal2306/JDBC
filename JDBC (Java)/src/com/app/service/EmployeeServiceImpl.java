package com.app.service;

import com.app.domain.Employee;
import com.app.repository.EmployeeDAO;
import com.app.repository.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {

    EmployeeDAO emplDAO = new EmployeeDAOImpl();
    @Override
    public void insertEmployee(Employee employee) {
        emplDAO.insert(employee);
    }

    @Override
    public int removeEmployee(int emplId) {
        return emplDAO.delete(emplId);
    }
    
}
