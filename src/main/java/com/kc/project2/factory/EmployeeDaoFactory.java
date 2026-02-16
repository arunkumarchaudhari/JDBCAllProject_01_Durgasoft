package com.kc.project2.factory;

import com.kc.dao.EmployeeDao;
import com.kc.dao.EmployeeDaoImpl;

public class EmployeeDaoFactory {
    private static EmployeeDao employeeDao;
    static{
        employeeDao = new EmployeeDaoImpl();
    }
    public static EmployeeDao getEmployeeDao(){
        return employeeDao;
    }

}
