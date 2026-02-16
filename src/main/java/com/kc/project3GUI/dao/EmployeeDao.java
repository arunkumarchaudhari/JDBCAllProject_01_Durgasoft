package com.kc.project3GUI.dao;

import com.kc.dto.Employee;

public interface EmployeeDao {
    public String addEmployee(Employee employee);
    public Employee searchEmployee(String eid);
    public String updateEmployee(Employee employee);
    public String deleteEmployee(String eid);
}
