package com.kc.proj3.sqlinjection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Scanner;

/**
 * @author arun.kc
 * @version 1.0
 * Description SQL injection prevention with prepared statement
 */

public class Application2 {
    public static void main(String[] args) {
        try(
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
                Scanner sc= new Scanner(System.in);
                ){
            PreparedStatement ps = con.prepareStatement("select * From user_info where uname=? and pass=?");
            System.out.print("Enter userName:: ");
            String uName=sc.nextLine();
            System.out.print("Enter password:: ");
            String password = sc.nextLine();
            ps.setString(1,uName);
            ps.setString(2,password);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                System.out.println("Valid credentials");
            } else{
                System.out.println("Invalid Credentials");
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
