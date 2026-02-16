package com.kc.project4.datasourceConnectionPooling;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author arun.kc
 * @version 1.0
 * @description 3rd party provided connection pooling mechanism(Best approach, as it is managed beautifully by vendor)
 * In general, we will use the following third party vendor provided connection pooling mechanisms in Jdbc applications.
 *
 * 1. DBCP
 * 2. C3P0
 * 3. Proxool
 * 4. Hikari
 *
 *          Application Objective:
 *              => lets implement DBCP
 *                  -> we need below 3 jar files
 *                      1. commons-pool-version.jar
 *                      2. commons-dbcp-version.jar
 *                      3. commons-logging-version.jar
 *                  -> Either add dependency in pom file or download jar file and add to project
 *
 *      NOTE: Similarly we can use other 3rd party connection pooling mechanism
 */

public class Application2 {
    public static void main(String[] args) {
        BasicDataSource ds = null;
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try{
            ds = new BasicDataSource();
            ds.setUrl("jdbc:mysql://localhost:3306/jdbc1");
            ds.setUsername("root");
            ds.setPassword("root");
            ds.setInitialSize(5); //Initially we are creating pool with 5 connection, although we will use only 1 in this program
            ds.setMaxTotal(10); //setting max connection for this program
            con = ds.getConnection();
            st= con.createStatement();
            rs = st.executeQuery("select * From employee");
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
                if(ds!=null) ds.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
