package com.kc.project4.datasourceConnectionPooling;


import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author arun.kc
 * @version 1.0
 * @description Using pre-defined connection pooling mechanism provided by db vendors
 *              => Here we are using MysqlDataSource to get connection(provided by oracle)
 */

public class Application1 {

    public static void main(String[] args) {
        Connection con = null;
        try{
            MysqlDataSource mysqlDataSource = new MysqlDataSource();
            mysqlDataSource.setUrl("jdbc:mysql://localhost:3306/jdbc1");
            mysqlDataSource.setUser("root");
            mysqlDataSource.setPassword("root");
            con = mysqlDataSource.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * From employee");
            System.out.println("EID\tENAME\tESAL\tEADDR");
            System.out.println("------------------------------------------");
            while(rs.next()){
                System.out.print(rs.getInt("eid") +"\t");
                System.out.print(rs.getString("ename") +"\t\t");
                System.out.print(rs.getFloat("esal") +"\t\t");
                System.out.print(rs.getString("eaddr") +"\n");
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                if(con!=null) con.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
