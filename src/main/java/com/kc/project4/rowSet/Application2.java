package com.kc.project4.rowSet;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;

/**
 * @author arunkc
 * @version 1.0
 * @description insert records through rowset into db
 */

public class Application2 {
    public static void main(String[] args) {
        JdbcRowSet jdbcRowSet= null;
        BufferedReader br = null;
        try{
            jdbcRowSet= RowSetProvider.newFactory().createJdbcRowSet();
            jdbcRowSet.setUrl("jdbc:mysql://localhost:3306/jdbc1");
            jdbcRowSet.setUsername("root");
            jdbcRowSet.setPassword("root");
            jdbcRowSet.setCommand("select * from employee");
            jdbcRowSet.execute();

            br= new BufferedReader(new InputStreamReader(System.in));
            while(true){
                System.out.println("Employee ID: ");
                int eno=Integer.parseInt(br.readLine());
                System.out.println("Employee Name: ");
                String ename = br.readLine();
                System.out.println("Employee Salary: ");
                float sal = Float.parseFloat(br.readLine());
                System.out.println("Employee address: ");
                String eAddress = br.readLine();

                jdbcRowSet.moveToInsertRow();
                jdbcRowSet.updateInt(1,eno);
                jdbcRowSet.updateString(2,ename);
                jdbcRowSet.updateFloat(3,sal);
                jdbcRowSet.updateString(4,eAddress);
                jdbcRowSet.insertRow();//to insert records into db table
                System.out.println("Employee records inserted successfully....");
                System.out.println("Want to insert more reocrds[Yes/No]: ");
                String option = br.readLine();
                if(option.equalsIgnoreCase("no")){
                    break;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                if(br!=null) br.close();
                if(jdbcRowSet!=null) jdbcRowSet.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
