package com.kc.project2.dao;

import com.kc.dto.Employee;
import com.kc.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public String addEmployee(Employee employee) {
        String status = null;
        try{
            Connection con = ConnectionFactory.getConnection();
            Statement st = con.createStatement();
            Employee emp = searchEmployee(employee.getEid());
            if(emp==null){
                String query = "insert into employee values('"+employee.getEid()+"' , '"+employee.getEname()+"' , '"+employee.getEsal()+"' , '"+employee.getEaddr()+"')";
                int rowUpdated = st.executeUpdate(query);
                if(rowUpdated>0){
                    status = "success";
                } else{
                    status = "failure";
                }
            } else{
                status="existed";
            }
        } catch (Exception e){
            status="failure";
            System.out.println("error inside addEmployee() method of EmployeeDaoImpl class");
            e.printStackTrace();
        } finally {
            try{
                ConnectionFactory.closeConnection();
            } catch (Exception e){
                System.out.println("error inside finally block of updateEmployee() method of EmployeeDaoImpl class");
                e.printStackTrace();
            }
        }
        return status;
    }

    @Override
    public Employee searchEmployee(String eid) {
        String query ="select * from employee where eid="+eid;
        Employee employee = null;
        try{
            Connection con = ConnectionFactory.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            boolean b = rs.next();
            if(b){
                employee = new Employee();
                employee.setEid(rs.getString("eid"));
                employee.setEname(rs.getString("ename"));
                employee.setEsal(rs.getString("esal"));
                employee.setEaddr(rs.getString("eaddr"));
                return employee;
            }

        } catch (Exception e){
            System.out.println("error inside searchEmployee() method of EmployeeDaoImpl class");
            e.printStackTrace();
        } finally {
            try{
                ConnectionFactory.closeConnection();
            } catch (Exception e){
                System.out.println("error inside finally block of updateEmployee() method of EmployeeDaoImpl class");
                e.printStackTrace();
            }
        }
        return employee;
    }

    @Override
    public String updateEmployee(Employee employee) {
        String status="failure";
        try{
            Connection con = ConnectionFactory.getConnection();
            Statement st = con.createStatement();
            int rowCount = st.executeUpdate("update employee set ename='"+employee.getEname()+"' , esal='"+employee.getEsal()+"' , eaddr='"+employee.getEaddr()+"' where eid="+employee.getEid());
            if(rowCount>0){
                status="success";
            }
        } catch (Exception e){
            System.out.println("error inside updateEmployee() method of EmployeeDaoImpl class");
            e.printStackTrace();
        } finally {
            try{
                ConnectionFactory.closeConnection();
            } catch (Exception e){
                System.out.println("error inside finally block of updateEmployee() method of EmployeeDaoImpl class");
                e.printStackTrace();
            }
        }
        return status;
    }

    @Override
    public String deleteEmployee(String eid) {
        String status="failure";
        try{
            Connection con = ConnectionFactory.getConnection();
            Statement st= con.createStatement();
            int rowCount = st.executeUpdate("delete from employee where eid="+eid);
            if(rowCount>0){
                status="success";
            }
        } catch (Exception e){
            System.out.println("error inside deleteEmployee() method of EmployeeDaoImpl class");
            e.printStackTrace();
        } finally {
            try{
                ConnectionFactory.closeConnection();
            } catch (Exception e){
                System.out.println("error inside finally block of deleteEmployee() method of EmployeeDaoImpl class");
                e.printStackTrace();
            }
        }
        return status;
    }
}
