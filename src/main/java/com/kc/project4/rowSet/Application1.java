package com.kc.project4.rowSet;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

/**
 * @author arunkc
 * @version 1.0
 * @description JdbcRowSet Demo to read data from rowSet and read data in both forward and backward direction.
 */

public class Application1 {
    public static void main(String[] args) {
        JdbcRowSet jdbcRowSet= null;

        try{
            jdbcRowSet= RowSetProvider.newFactory().createJdbcRowSet();
            jdbcRowSet.setUrl("jdbc:mysql://localhost:3306/jdbc1");
            jdbcRowSet.setUsername("root");
            jdbcRowSet.setPassword("root");
            jdbcRowSet.setCommand("select * from employee");
            jdbcRowSet.execute();
            System.out.println("Emloyee details in forward direction");
            System.out.println("EID\tENAME\tESAL\tEADDR");
            System.out.println("-------------------------------------");
            while(jdbcRowSet.next()){
                System.out.print(jdbcRowSet.getInt("EID")+"\t");
                System.out.print(jdbcRowSet.getString("ENAME")+"\t");
                System.out.print(jdbcRowSet.getFloat("ESAL")+"\t\t");
                System.out.print(jdbcRowSet.getString("EADDR")+"\n");
            }
            System.out.println();
            System.out.println("Employee details in backward direction");
            System.out.println("EID\tENAME\tESAL\tEADDR");
            System.out.println("-------------------------------------");
            while(jdbcRowSet.previous()){
                System.out.print(jdbcRowSet.getInt("EID")+"\t");
                System.out.print(jdbcRowSet.getString("ENAME")+"\t");
                System.out.print(jdbcRowSet.getFloat("ESAL")+"\t\t");
                System.out.print(jdbcRowSet.getString("EADDR")+"\n");
            }

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                jdbcRowSet.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
