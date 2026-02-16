package com.kc.project3GUI.service;

import com.kc.project3GUI.dao.EmployeeDao;
import com.kc.project3GUI.dto.Employee;
import com.kc.project3GUI.factory.EmployeeDaoFactory;

public class EmployeeSearviceImpl implements  EmployeeService{
    @Override
    public String addEmployee(Employee employee) {
        EmployeeDao employeeDao = EmployeeDaoFactory.getEmployeeDao();
        return employeeDao.addEmployee(employee);
    }

    @Override
    public Employee searchEmployee(String eid) {
        EmployeeDao employeeDao = EmployeeDaoFactory.getEmployeeDao();
        return employeeDao.searchEmployee(eid);
    }

    @Override
    public String updateEmployee(Employee employee) {
        EmployeeDao employeeDao = EmployeeDaoFactory.getEmployeeDao();
        return employeeDao.updateEmployee(employee);
    }

    @Override
    public String deleteEmployee(String eid) {
        EmployeeDao employeeDao = EmployeeDaoFactory.getEmployeeDao();
        return employeeDao.deleteEmployee(eid);
    }
}
