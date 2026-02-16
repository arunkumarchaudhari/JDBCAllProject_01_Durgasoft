package com.kc.project4.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Scanner;

/**
 * @author arun.kc
 * @date 2024/6/17 18:01
 * @@version 1.0
 * @description Read date values from Database
 */

public class Application4 {
    public static void main(String[] args) {
        try(
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
                Scanner sc = new Scanner(System.in);
                ){
            PreparedStatement ps = con.prepareStatement("select * From user_info");
            ResultSet rs = ps.executeQuery();
            System.out.println("---------------------------------------------");
            System.out.println("UID\tUNAME\tPASS\t\tDOJ");
            System.out.println("---------------------------------------------");
            while(rs.next()){
                System.out.print(rs.getInt("uid") +"\t");
                System.out.print(rs.getString("uname") +"\t");
                System.out.print(rs.getString("pass") +"\t");
                System.out.println(rs.getDate("doj"));
                System.out.println("---------------------------------------------");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
