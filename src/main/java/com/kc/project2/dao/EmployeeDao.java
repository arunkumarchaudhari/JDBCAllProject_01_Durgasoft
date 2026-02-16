package com.kc.project2.dao;

import com.kc.project2.dto.Employee;

public interface EmployeeDao {
    public String addEmployee(Employee employee);
    public Employee searchEmployee(String eid);
    public String updateEmployee(Employee employee);
    public String deleteEmployee(String eid);
}
