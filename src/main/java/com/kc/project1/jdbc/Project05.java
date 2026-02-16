package com.kc.project1.jdbc;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author: arun.kc
 * @version: 1.0
 * @description: Write a jdbc application to get data from table and store it inside csv file, Use try-with-resources
 */

public class Project05 {
    public static void main(String[] args) {

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from emp");
                FileOutputStream fos = new FileOutputStream("/home/arunkc/Desktop/Courses/Adv Java/JDBC_Rough/emp.csv");){
            String data= "eid,ename,eaddr\n";
            while(rs.next()){
                data = data + rs.getInt("eid")+",";
                data = data + rs.getString("ename")+",";
                data = data + rs.getString("eaddr")+"\n";
            }
            byte[] b= data.getBytes();
            fos.write(b);
            System.out.println("Data send to file:: /home/arunkc/Desktop/Courses/Adv Java/JDBC_Rough/emp.csv");

        } catch (Exception e){
            System.out.println("Error inside Project05");
            e.printStackTrace();
        }
    }
}
