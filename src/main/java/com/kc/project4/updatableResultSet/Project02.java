package com.kc.project4.updatableResultSet;

import java.sql.*;

/**
 * @author arun.kc
 * @version 1.0
 * @date 2024/6/17 17:11
 * @description Deleting row using updatable result set
 *          STEP 1: go to respective row: rs.absolute(2); // eg: to go to 2nd row
 *          STEP 2: delete the row: rs.deleteRow();
 *
 *          Program: Delete those employee whose salary is greater than 70K
 */

public class Project02 {
    public static void main(String[] args) {

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root")){
            Statement st= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from employee");
            while(rs.next()){
                int eno = rs.getInt(1);
                float esal = rs.getFloat(3);
                if(esal>70000){
                    System.out.println("EID:  "+ eno+" salary is greater than 70k, deleting the records");
                    rs.deleteRow();
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
