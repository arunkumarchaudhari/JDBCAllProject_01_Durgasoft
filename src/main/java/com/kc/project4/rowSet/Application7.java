package com.kc.project4.rowSet;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

/**
 * @author arunkc
 * @version 1.0
 * @Objective Update data into db thrugh CachedRowSet
 *      STEPS:
 *          1. Establish connection b/w java and db
 *          2. remove autoCommit mode from connection
 *          3. Create CachedRowSet object
 *          4. set select sql query to CachedRowSet and execute the query
 *          5. Move cursor to rowlocation where we want to perform update
 *          6. update the data in rowset
 *          7. update data into db table
 *          8. Move cursor to currentRow and accept the changes
 *  
 *
 */

public class Application7 {
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
                if(sal<10000){
                    System.out.println("EID: "+crs.getInt("EID")+" salary is less than 10k, adding 500");
                    float newSal = sal+500;
                    crs.updateFloat(3,newSal);
                    crs.updateRow();
                    crs.moveToCurrentRow();
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
