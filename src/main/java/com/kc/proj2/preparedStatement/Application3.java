package com.kc.proj2.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;
import java.util.Scanner;

/**
 * @author arun.kc
 * @date 2024/6/17 18:01
 * @@version 1.0
 * @description Create a program to insert records into user_info table with columns:
 *                      uid,uname,pass,doj using PreparedStatement
 * @objective To insert date into db
 *              -> We can't insert java.util.Date into db directly, we need to convert it into java.sql.Date
 *              -> java.sql.Date is a subclass of java.util.Date, so we can create an object of java.sql.Date by passing the time in milliseconds to its constructor
 */

public class Application3 {
    public static void main(String[] args) {

        try(
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
                Scanner sc = new Scanner(System.in);
                ){
            PreparedStatement ps = con.prepareStatement("insert into user_info values(?,?,?,?)");
            while(true){
                System.out.println("Enter User Id: ");
                int uid = sc.nextInt();
                System.out.println("Enter User Name: ");
                String uname = sc.next();
                System.out.println("Enter Password: ");
                String pass = sc.next();
                Date date = new Date();
                java.sql.Date doj = new java.sql.Date(date.getTime());
                ps.setInt(1,uid);
                ps.setString(2,uname);
                ps.setString(3,pass);
                ps.setDate(4,doj);
                int x = ps.executeUpdate();
                if(x>0){
                    System.out.println("Record inserted successfully");
                } else {
                    System.out.println("Failed to insert the record");
                }
                System.out.println("Do you want to insert more records? (yes/no)");
                String choice = sc.next();
                if(choice.equalsIgnoreCase("no")) break;
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
