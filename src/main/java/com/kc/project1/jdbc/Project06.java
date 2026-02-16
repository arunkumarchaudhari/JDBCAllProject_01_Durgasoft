package com.kc.project1.jdbc;


import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author: arun.kc
 * @version: 1.0
 * @description: There are 3 ways to establish the connection
 *                 1. By using DriverManager.getConnection(url,userName,pass);
 *                 2. By using DriverManger.getConnection() using properties file
 *                 3. By using factory method and factory class
 *
 *                 NOTE: Till now, we are using Method 1 to establish the connection
 *                 Here we will be using method 2 to establish the connection
 */

public class Project06 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        Properties p;
        Connection con =null;
        Statement st;
        ResultSet rs;
        try{
            fis = new FileInputStream("/home/arunkc/Desktop/Courses/Adv Java/JDBCProj01/src/main/resources/db.properties");
             p = new Properties();
            p.load(fis);
            String driverClass = p.getProperty("driverClass");
            con = DriverManager.getConnection(p.getProperty("url"),p.getProperty("user"),p.getProperty("password"));
            st = con.createStatement();
            rs = st.executeQuery("select * from emp");
            System.out.println("EID\tENAME\tEADDR");
            System.out.println("----------------------------");
                while (rs.next()) {
                    System.out.print(rs.getInt("eid") + "\t");
                    System.out.print(rs.getString("ename") + "\t");
                    System.out.print(rs.getString("eaddr") + "\n");
                }
            System.out.println();
            System.out.println("Program06 Completed successfully.....");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                if(fis!=null) fis.close();
                if(con !=null) con.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
