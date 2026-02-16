package com.kc.project1.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author: aruna.kc
 * @version: 1.0
 * @description: A simple resultSet program to fetch all the records from customers table and display the output in console.
 */

public class Project01 {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try{
            //Load the driver
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
            //Create statement
            st = con.createStatement();
            //Execute query
            rs = st.executeQuery("select * from customers");
            System.out.println("Cid\tFName\tLName");
            System.out.println("-----------------------------");
            while(rs.next()){
                System.out.print(+rs.getInt(1)+"\t");
                System.out.print(rs.getString(2)+"\t");
                System.out.println(rs.getString(3));
            }
        } catch (Exception e){
            System.out.println("error while fetching data from database");
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (Exception e) {
                System.out.println("error while closing the resources");
                e.printStackTrace();
            }
        }
    }
}
