package com.kc.project4.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * @author arun.kc
 * @date 2024/6/17 18:01
 * @@version 1.0
 * @description PreparedStatement demo
 *              Create a program to fetch employee details using PreparedStatement
 */

public class Application1 {
    public static void main(String[] args) {

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root")){
            PreparedStatement ps = con.prepareStatement("select * From employee where eid=?");
            System.out.println("Enter Employee id: ");
            Scanner sc = new Scanner(System.in);
            int eid = sc.nextInt();
            ps.setInt(1,eid);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("EID: "+rs.getInt(1));
                System.out.println("EName: "+rs.getString(2));
                System.out.println("ESal: "+rs.getFloat(3));
                System.out.println("Eaddress: "+rs.getString(4));
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
