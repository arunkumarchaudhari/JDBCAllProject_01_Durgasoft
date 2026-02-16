package com.kc.project4.rowSet;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author arunkc
 * @version 1.0
 * @Objective Insert data into db thrugh CachedRowSet-> it is disconnected rowSet,see the code carefully
 *      STEPS:
 *          1. Establish connection b/w java and db
 *          2. remove autoCommit mode from connection
 *          3. Create CachedRowSet object
 *          4. set select sql query to CachedRowSet and execute the query
 *          5. Move cursor to end of rowSet
 *          6. set data to CachedRowSet.
 *          7. insert row into db
 *          8. Move cursor to currentRow and accept the changes
 *
 *
 */

public class Application6 {
    public static void main(String[] args) {
        CachedRowSet crs = null;
        Scanner sc = new Scanner(System.in);
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
            con.setAutoCommit(false);
            crs = RowSetProvider.newFactory().createCachedRowSet();
            crs.setCommand("select * from employee");
            crs.execute(con);

            while(true){
                System.out.println("Employee ID: ");
                int eno=sc.nextInt();
                System.out.println("Employee Name: ");
                String ename = sc.next();
                System.out.println("Employee Salary: ");
                float sal = sc.nextFloat();
                System.out.println("Employee address: ");
                String eAddress = sc.next();

                crs.moveToInsertRow();
                crs.updateInt(1,eno);
                crs.updateString(2,ename);
                crs.updateFloat(3,sal);
                crs.updateString(4,eAddress);
                crs.insertRow();//to insert records into db table

                crs.moveToCurrentRow(); //As it is disconnect rowSet
                crs.acceptChanges();
                System.out.println("Employee records inserted successfully....");
                System.out.println("Want to insert more reocrds[Yes/No]: ");
                String option = sc.next();
                if(option.equalsIgnoreCase("no")){
                    break;
                }
            }

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                if(sc!=null) sc.close();
                if(con!=null) con.close();
                if(crs!=null) crs.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
