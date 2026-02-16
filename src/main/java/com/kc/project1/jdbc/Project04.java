package com.kc.project1.jdbc;

import java.sql.*;
import java.util.Scanner;

/**
 * @author: arun.kc
 * @version: 1.0
 * @description: Create a program to give user to execute query dymanically
 *                  -> here we will use execute method as we are not sure about query user will enter(either select or non-select)
 */

public class Project04 {
    public static void main(String[] args) {
        Connection con = null;
        Statement st= null;
        Scanner sc = null;
        ResultSet rs = null;
        ResultSetMetaData md = null;

        try{
            sc = new Scanner(System.in);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
            st = con.createStatement();
            System.out.print("Enter query:::");
            String query = sc.nextLine();
            boolean executeQuery = st.execute(query);
            if(executeQuery){
                rs = st.getResultSet();
                md = rs.getMetaData();
                int columnCount = md.getColumnCount();
                for(int i=1;i<=columnCount;i++){
                    System.out.print(md.getColumnName(i)+"\t");
                }
                System.out.println();
                System.out.println("-------------------------------");
                while(rs.next()){
                    for(int i=1;i<=columnCount;i++){
                        System.out.print(rs.getString(i)+"\t");
                    }
                    System.out.println();
                }
            } else{
                int updateRowCount=st.getUpdateCount();
                System.out.println("Total rows updated:: "+updateRowCount);
            }

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                if(sc!=null) sc.close();
                if(con!=null) con.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
