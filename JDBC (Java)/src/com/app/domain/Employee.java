package com.app.domain;

public class Employee {
    private int emplId;
    private String emplName;
    private String department;
    
    public Employee(){
        super();
    }

    public Employee(int emplId, String emplName, String department) {
        this.emplId = emplId;
        this.emplName = emplName;
        this.department = department;
    }

    public int getEmplId() {
        return emplId;
    }

    public void setEmplId(int emplId) {
        this.emplId = emplId;
    }

    public String getEmplName() {
        return emplName;
    }

    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" + "emplId=" + emplId + ", emplName=" + emplName + ", department=" + department + '}';
    }
    
}
