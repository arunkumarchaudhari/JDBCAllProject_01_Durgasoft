package com.kc.proj2.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * @author arun.kc
 * @date 2024/6/17 18:01
 * @@version 1.0
 * @description PreparedStatement: Insert records into employee table using PreparedStatement
 */

public class Application2 {
    public static void main(String[] args) {

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");Scanner sc = new Scanner(System.in);){
            PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?)");
            while(true){
                System.out.println("Employee Id: ");
                int eid = sc.nextInt();
                System.out.println("Employee Name: ");
                String ename = sc.next();
                System.out.println("Employee Salary: ");
                float esal = sc.nextFloat();
                System.out.println("Employee Address: ");
                String eaddr = sc.next();
                ps.setInt(1,eid);
                ps.setString(2,ename);
                ps.setFloat(3,esal);
                ps.setString(4,eaddr);
                int x = ps.executeUpdate();
                if(x>0){
                    System.out.println("Record inserted successfully");
                } else {
                    System.out.println("Failed to insert the record");
                }
                System.out.println("Do you want to insert more records? (yes/no)");
                String choice = sc.next();
                if(choice.equalsIgnoreCase("no"))
                    break;
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
