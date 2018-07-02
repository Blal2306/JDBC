package com.app.repository;

import com.app.domain.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeDAOImpl implements EmployeeDAO{
    Connection connection = null;
    PreparedStatement ps = null;
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/employee_schema";
    String user = "root";
    String password = "pass";

    @Override
    public void insert(Employee employee) {
        try{
            Class.forName(driver);
            connection = DriverManager.getConnection(url, "root", "pass");
            String query = "insert into employee values (?,?,?)";
            ps = connection.prepareStatement(query);
            ps.setLong(1, employee.getEmplId());
            ps.setString(2, employee.getEmplName());
            ps.setString(3, employee.getDepartment());
            ps.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                ps.close();
                connection.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public int delete(int emplId) {
        int result = 1;
        try{
            Class.forName(driver);
            connection = DriverManager.getConnection(url,user, password);
            String query = "DELETE FROM employee WHERE EmpId = ?";
            ps = connection.prepareStatement(query);
            ps.setLong(1, emplId);
            result = ps.executeUpdate();
        }catch(Exception e){
            System.out.println("problem deleting from DB");
        }finally{
            try{
                ps.close();
                connection.close();
            }catch(Exception e){
                System.out.println("problem from DB deleting");
            }
        }
        return result;
    }
    
}
