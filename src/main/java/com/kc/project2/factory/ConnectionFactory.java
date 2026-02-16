package com.kc.project2.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static Connection con = null;

    public static Connection getConnection(){
        try{
            System.out.println("Establishing db connection....");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
            System.out.println("Db connection established successfully......");
        } catch (Exception e){
            System.out.println("Error while establishing the connection::: ");
            e.printStackTrace();
        }
        return con;
    }
    public static void closeConnection(){
        try{
            System.out.println("Closing db connection....");
            if(con!=null) con.close();
            System.out.println("Db connection closed...");
        } catch (Exception e){
            System.out.println("Error while closing the connection");
            e.printStackTrace();
        }
    }
}
