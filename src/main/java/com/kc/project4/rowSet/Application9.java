package com.kc.project4.rowSet;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

/**
 * @author arunkc
 * @version 1.0
 * @Objective Read data from db to an xml file by using WebRowSet
 *              The main intention of WebRowSet is
 *                  1. get data from db table and manage that data into form of an xml file
 *                  2. to perform the operation like insert, update and delete from an xml file to db table
 *      STEPS:
 *          1. Create WebRowSet
 *          2. Set jdbc prams to WebRowSet
 *          3. Set select sql query to WebRowSet
 *          4. Execute query and get data into WebRowSet
 *          5. Prepare target xml file
 *          6. write rowset data to target xml file
 *          7. Close all the connection and open resources
 *
 *     NOTE:
 *      => after executing this program, we will get output having 3 tags
 *          1. <properties> tag: manage all the properties of the rowset object like command, url,uname, password,tableName and etc..
 *          2. <metadata> tag : is able to manage metadata of the rowset which includes no of columns, colName, databaseName, colDataType etc..
 *          3.<data> tag : the actual records data in form of currentRow tag.
 *
 *
 */

public class Application9 {
    public static void main(String[] args) {
        WebRowSet wrs = null;
        FileOutputStream fos = null;
        try{
            wrs = RowSetProvider.newFactory().createWebRowSet();
            wrs.setUrl("jdbc:mysql://localhost:3306/jdbc1");
            wrs.setUsername("root");
            wrs.setPassword("root");
            wrs.setCommand("select * from employee");
            wrs.execute();
            fos = new FileOutputStream("/home/arunkc/Desktop/Courses/Adv Java/WebRowSet_EmployeeDetails.xml");

            wrs.writeXml(fos);
            System.out.println("Data send to :: /home/arunkc/Desktop/Courses/Adv Java/WebRowSet_EmployeeDetails.xml");

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                if(fos!=null) fos.close();
                if(wrs!=null) wrs.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
