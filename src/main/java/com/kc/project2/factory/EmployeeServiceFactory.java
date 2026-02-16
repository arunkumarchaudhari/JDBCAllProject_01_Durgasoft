package com.kc.project2.factory;

import com.kc.project2.service.EmployeeSearviceImpl;
import com.kc.project2.service.EmployeeService;

public class EmployeeServiceFactory {
    private static EmployeeService employeeService;
    static{
        employeeService = new EmployeeSearviceImpl();
    }
    public static EmployeeService getEmployeeService(){
        return employeeService;
    }
}
