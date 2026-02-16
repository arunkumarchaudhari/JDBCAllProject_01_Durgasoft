package com.kc.project4.rowSet;

import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author arunkc
 * @version 1.0
 * @Objective Insert,update and delete operations by using WebRowSet
 *
 *      STEPS:
 *          1. Provide manipulations in the xml file
 *              a. provide a new reocrds into xml [Insert] <insertRow>...data....</insertRow>
 *              b. provide new data to upate [Update] <updateRow>...data....</updateRow>
 *              c. specify data to delete [Delete] <deleteRow>...data....</deleteRow>
 *          2. Establish connection
 *          3. Remove auto-commit mode from connection
 *          4. Create RowSet obj
 *          5. set jdbc params to rowSet
 *          6. set select sql query to RowSet.
 *          7. execute select sql query
 *          8. Create FileReader to get data from xml file
 *          9. Read data from fileReader and stored data into rowset obj.
 *          10. Move cursor to current row and accept the changes
 *
 * Modified xml[only data parts]
 * <data>
 *     <deleteRow> -> to delete this row
 *       <columnValue>111</columnValue>
 *       <columnValue>AAA</columnValue>
 *       <columnValue>5000.00</columnValue>
 *       <columnValue>Hyd</columnValue>
 *     </deleteRow>
 *     <currentRow>
 *       <columnValue>333</columnValue>
 *       <columnValue>CCC</columnValue>
 *       <columnValue>7000.00</columnValue>
 * 	  <updateRow>7500</updateRow> -> to udpate
 *       <columnValue>Hyd</columnValue>
 *     </currentRow>
 * 	<insertRow> -> insert this records
 *       <columnValue>444</columnValue>
 *       <columnValue>DDD</columnValue>
 *       <columnValue>9000.00</columnValue>
 *       <columnValue>Hyd</columnValue>
 *     </insertRow>
 *   </data>
 */

public class Application10 {
    public static void main(String[] args) {
        WebRowSet wrs = null;
        FileReader fr = null;
        Connection con = null;
        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
            con.setAutoCommit(false);
            wrs = RowSetProvider.newFactory().createWebRowSet();
            wrs.setCommand("select * from employee");
            wrs.execute(con);
            fr = new FileReader("/home/arunkc/Desktop/Courses/Adv Java/WebRowSet_EmployeeDetails.xml");
            wrs.readXml(fr);
            wrs.moveToCurrentRow();
            wrs.acceptChanges();
            System.out.println("Insert,update and delete operation are success....");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                if(fr!=null) fr.close();
                if(con!=null) con.close();
                if(wrs!=null) wrs.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
