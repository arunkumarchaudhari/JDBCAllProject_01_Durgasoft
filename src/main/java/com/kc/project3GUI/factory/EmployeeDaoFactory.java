package com.kc.project3GUI.factory;

import com.kc.project3GUI.dao.EmployeeDao;
import com.kc.project3GUI.dao.EmployeeDaoImpl;

public class EmployeeDaoFactory {
    private static EmployeeDao employeeDao;
    static{
        employeeDao = new EmployeeDaoImpl();
    }
    public static EmployeeDao getEmployeeDao(){
        return employeeDao;
    }

}
