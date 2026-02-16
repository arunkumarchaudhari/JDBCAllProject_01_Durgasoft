package com.kc.project4.rowSet;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

/**
 * @author arunkc
 * @version 1.0
 * @Objective Read data in both direction from Db table through CachedRowSet
 * @description
 *          => CachedRowSet is disconnected rowSet, it doesn't required connection through, only required while
 *          performing db operation, once it is done, db connection is closed.
 *
 *          => The main intention of CachedRowSet is to manage the results in cache memory for the future reusability.
 *          => The main advantage of CachedRowSet is to reduce no of interactions with the db.
 *
 *          NOTE: In order to achevie this,we need 3rd party additional library, but
 *                We can perform simple CRUD operation without 3rd party library.
 */

public class Application5 {
    public static void main(String[] args) {
        CachedRowSet crs = null;
        try{
            crs = RowSetProvider.newFactory().createCachedRowSet();
            crs.setUrl("jdbc:mysql://localhost:3306/jdbc1");
            crs.setUsername("root");
            crs.setPassword("root");
            crs.setCommand("select * from employee");
            crs.execute();

            System.out.println("Emloyee details in forward direction");
            System.out.println("EID\tENAME\tESAL\tEADDR");
            System.out.println("-------------------------------------");
            while(crs.next()){
                System.out.print(crs.getInt("EID")+"\t");
                System.out.print(crs.getString("ENAME")+"\t");
                System.out.print(crs.getFloat("ESAL")+"\t\t");
                System.out.print(crs.getString("EADDR")+"\n");
            }
            System.out.println();

            System.out.println("Emloyee details in backward direction");
            System.out.println("EID\tENAME\tESAL\tEADDR");
            System.out.println("-------------------------------------");
            while(crs.previous()){
                System.out.print(crs.getInt("EID")+"\t");
                System.out.print(crs.getString("ENAME")+"\t");
                System.out.print(crs.getFloat("ESAL")+"\t\t");
                System.out.print(crs.getString("EADDR")+"\n");
            }

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                if(crs!=null) crs.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
