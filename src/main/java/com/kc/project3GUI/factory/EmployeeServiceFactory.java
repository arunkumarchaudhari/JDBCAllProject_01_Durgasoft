package com.kc.project3GUI.factory;

import com.kc.project3GUI.service.EmployeeSearviceImpl;
import com.kc.project3GUI.service.EmployeeService;

public class EmployeeServiceFactory {
    private static EmployeeService employeeService;
    static{
        employeeService = new EmployeeSearviceImpl();
    }
    public static EmployeeService getEmployeeService(){
        return employeeService;
    }
}
