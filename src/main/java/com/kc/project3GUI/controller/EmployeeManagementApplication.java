package com.kc.project3GUI.controller;

import com.kc.dto.Employee;
import com.kc.factory.ConnectionFactory;
import com.kc.factory.EmployeeServiceFactory;
import com.kc.service.EmployeeService;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author: arun.kc
 * @version: 1.0
 * @description: Performing all the CRUD operation in a single application
 *                  C : create
 *                  R : Read
 *                  U : Update
 *                  D : Delete
 *              => In this application we will be using MVC architecture
 */

public class EmployeeManagementApplication {
    private static BufferedReader br = null;
    private static Connection con = null;
    private static Statement st = null;
    private static ResultSet rs = null;
    private static ResultSetMetaData md = null;
    private void  addEmp(String eid, String ename, String eaddr){
        try{
            String query = "insert into emp values("+eid+" , "+ename+" , "+eaddr+")";
            int rowUpdated = st.executeUpdate(query);
            System.out.println("Records added successfully....");
        } catch (Exception e){
            System.out.println("error inside addEmp()");
            e.printStackTrace();
        }
    }
    private void getEmp(int eId){
        try{
            String query = "select * from emp where eid="+eId;
            rs = st.executeQuery(query);
            md= rs.getMetaData();
            int count = md.getColumnCount();
            if(count<1){
                System.out.println("No records found for EID::: "+eId);
            } else{
                System.out.println("EID\tENAME\tEADDR");
                System.out.println("-------------------------");
                while(rs.next()){
                    System.out.print(rs.getInt("eid")+"\t");
                    System.out.print(rs.getString("ename")+"\t");
                    System.out.print(rs.getString("eaddr")+"\n");
                }
                System.out.println("Records Fetch successfully....");
            }
        } catch (Exception e){
            System.out.println("error inside getEmp()");
            e.printStackTrace();
        }
    }
    private void updateSal(int increment, int empSal){
        try{
            String query = "update emp set esal=esal + "+increment+" where esal<"+empSal;
            int rowUpdated= st.executeUpdate(query);
            System.out.println("Total row updated:: "+rowUpdated);
        } catch (Exception e){
            System.out.println("Error inside updateEmp()");
            e.printStackTrace();
        }
    }
    private void delEmp(int empId){
        try{
            String query = "delete from emp where eid="+empId;
            int rowUpdated = st.executeUpdate(query);
            if(rowUpdated>=1){
                System.out.println("Emp deleted with eid::: "+empId);
            } else{
                System.out.println("No records found to delete for eid::: "+empId);
            }
        } catch (Exception e){
            System.out.println("error inside delEmp()");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Management Application");
        String eid=null, ename=null, esal=null,  eaddr=null;
        String status = null;
        Employee employee =null;
        EmployeeService employeeService = EmployeeServiceFactory.getEmployeeService();
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            while(true){
                System.out.println("1. Add Emp");
                System.out.println("2. Search Emp");
                System.out.println("3. Update Emp");
                System.out.println("4. Delete Emp");
                System.out.println("5. Close");
                System.out.print("Enter Option::: ");
                int option = Integer.parseInt(br.readLine());
                switch(option){
                    case 1:
                        System.out.println("Selected Option::: Add Emp");
                        System.out.println("Enter Employee Id::: ");
                        eid = br.readLine();
                        System.out.println("Enter Employee Name::: ");
                        ename = br.readLine();
                        System.out.println("Enter Employee Salary::: ");
                        esal = br.readLine();
                        System.out.println("Enter Employee Address::: ");
                        eaddr = br.readLine();
                        employee = new Employee();
                        employee.setEid(eid);
                        employee.setEname(ename);
                        employee.setEsal(esal);
                        employee.setEaddr(eaddr);
                        status = employeeService.addEmployee(employee);
                        if(status.equalsIgnoreCase("success")){
                            System.out.println("Employee added successfully....");
                        }else if(status.equalsIgnoreCase("existed")){
                            System.out.println("Employee already exist with eid::: "+eid);
                        }else{
                            System.out.println("Failed to add employee...");
                        }
                        break;
                    case 2:
                        System.out.println("Selected Option::: Search Emp");
                        System.out.println("Enter Employee Id::: ");
                        eid = br.readLine();
                        employee = employeeService.searchEmployee(eid);
                        if(employee ==null){
                            System.out.println("No records found for EID::: "+eid);
                        } else{
                            System.out.println("Employee details for EID::: "+eid);
                            System.out.println("EID\tENAME\tESAL\tEADDR");
                            System.out.println("----------------------------------");
                            System.out.print(employee.getEid()+"\t");
                            System.out.print(employee.getEname()+"\t");
                            System.out.print(employee.getEsal()+"\t");
                            System.out.print(employee.getEaddr()+"\n");
                        }
                        break;
                    case 3:
                        System.out.println("Selected Option::: Update Emp");
                        System.out.println("Enter Employee ID:: ");
                        eid = br.readLine();
                        employee = employeeService.searchEmployee(eid);
                        if(employee ==null ){
                            System.out.println("No records found for EID::: "+eid);
                        } else{
                            System.out.println("Employee Name [Old: "+employee.getEname()+"] New ?");
                            ename = br.readLine();
                            System.out.println("Employee Salary [Old: "+employee.getEsal()+"] New ?");
                            esal = br.readLine();
                            System.out.println("Employee Address [Old: "+employee.getEaddr()+"] New ?");
                            eaddr = br.readLine();

                            Employee emp = new Employee();
                            emp.setEid(eid);
                            emp.setEname(ename);
                            emp.setEsal(esal);
                            emp.setEaddr(eaddr);
                            status = employeeService.updateEmployee(emp);
                            if(status.equalsIgnoreCase("success")){
                                System.out.println("Employee updated successfully....");
                            } else {
                                System.out.println("Failed to update employee...");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Selected Option::: Delete Emp");
                        System.out.println("Enter Employee ID:: ");
                        eid = br.readLine();
                        employee = employeeService.searchEmployee(eid);
                        if(employee ==null ){
                            System.out.println("No records found for EID::: "+eid);
                        } else{
                            status = employeeService.deleteEmployee(eid);
                            if(status.equalsIgnoreCase("success")){
                                System.out.println("Employee deleted successfully....");
                            } else {
                                System.out.println("Failed to delete employee...");
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Thanks for using Employee Management Application");
                        if(br!=null) br.close();
                        ConnectionFactory.closeConnection();
                        System.exit(0);
                    default:
                        System.out.println("Enter valid input");
                }
                System.out.println();
            }



        } catch (Exception e){
            System.out.println("Error inside Project08");
            e.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection();
        }
        System.out.println("Employee Management Application closed successfully");
    }
}
