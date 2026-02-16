package com.kc.project3GUI.service;

import com.kc.dto.Employee;

public interface EmployeeService {
    public String addEmployee(Employee employee);
    public Employee searchEmployee(String eid);
    public String updateEmployee(Employee employee);
    public String deleteEmployee(String eid);
}
