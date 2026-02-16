package com.kc.project1.jdbc;


import com.kc.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author: arun.kc
 * @version: 1.0
 * @description: There are 3 ways to establish the connection
 *                 1. By using DriverManager.getConnection(url,userName,pass);
 *                 2. By using DriverManger.getConnection() using properties file
 *                 3. By using factory method and factory class
 *
 *                 We will be using approach 3.
 *                 Reason:
 *                  -> Most frequently used in industry
 *                  -> In multiple jdbc application,if we want to share connection, this is best approac, as we can re-use same connection
 *                     No need to create multiple connection multiple times.
 *
 *                     Steps:
 *                          1. Prepare factory class with factor method
 *                          2. Get Connection from Factory class and Factory Method in jdbc application whenever required.
 *
 */

public class Project07 {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try{
            System.out.println("Project07 started.....\n\n");
            con = ConnectionFactory.getConnection();
            st=con.createStatement();
            rs = st.executeQuery("select * from emp");
            System.out.println("EID\tENAME\tEADDR");
            System.out.println("----------------------------");
            while (rs.next()) {
                System.out.print(rs.getInt("eid") + "\t");
                System.out.print(rs.getString("ename") + "\t");
                System.out.print(rs.getString("eaddr") + "\n");
            }
            System.out.println();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                if(rs !=null) rs.close();
                if(st!=null) st.close();
                if(con!=null) ConnectionFactory.closeConnection();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Project07 Completed successfully.....");
    }
}
