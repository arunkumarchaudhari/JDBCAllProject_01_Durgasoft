package com.kc.project4.rowSet;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author arunkc
 * @version 1.0
 * @Objective Delete data into db thrugh CachedRowSet
 *      STEPS:
 *          1. Establish connection b/w java and db
 *          2. remove autoCommit mode from connection
 *          3. Create CachedRowSet object
 *          4. set select sql query to CachedRowSet and execute the query
 *          5. Move cursor to record position where we want to perform delete
 *          6. delete records
 *          7. Move cursor to currentRow and accept the changes
 *  
 *
 */

public class Application8 {
    public static void main(String[] args) {
        CachedRowSet crs = null;
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
            con.setAutoCommit(false);
            crs = RowSetProvider.newFactory().createCachedRowSet();
            crs.setCommand("select * from employee");
            crs.execute(con);

            while(crs.next()){
                float sal = crs.getFloat("ESAL");
                if(sal>5000){
                    System.out.println("EID: "+crs.getInt("EID")+" salary is greater than 5k, deleting record");
                    crs.deleteRow();
                    crs.acceptChanges();
                }
            }

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                if(crs!=null) crs.close();
                if(con!=null) con.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
