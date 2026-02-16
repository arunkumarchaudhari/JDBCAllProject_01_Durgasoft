package com.kc.project1.jdbc;

import java.sql.*;

/**
 * @author: arun.kc
 * @version: 1.0
 * @description: Display column data of the table along with columnName(with the help of resultSetMetaData)
 */

public class Project02 {
    private static final String query = "select * From emp";
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
            st= con.createStatement();
            rs=st.executeQuery(query);
            ResultSetMetaData md = rs.getMetaData();
            int columnCount= md.getColumnCount();
            for(int columnIndex=1;columnIndex<=columnCount;columnIndex++){
                System.out.print(md.getColumnName(columnIndex)+"\t");
            }
            System.out.println();
            System.out.println("--------------------------------------------");
            while(rs.next()){
                for(int columnInd=1;columnInd<=columnCount;columnInd++){
                    System.out.print(rs.getString(columnInd)+"\t");
                }
                System.out.println();
            }

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                if(con!=null) con.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
