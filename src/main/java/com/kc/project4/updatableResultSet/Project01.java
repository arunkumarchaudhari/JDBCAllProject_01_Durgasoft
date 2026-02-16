package com.kc.project4.updatableResultSet;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

/**
 * @author: arun.kc
 * @date 2024/6/17 17:44
 * description: performing update operations into a database using updatable result sets
 */

public class Project01 {
    public static void main(String[] args) {
        Statement st = null;
        ResultSet rs = null;
        try(Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root")){
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery("select * from employee");
            while(rs.next()){
                float sal = rs.getFloat("esal");
                if(sal<10000){
                    System.out.println("Salary of EID: "+rs.getInt("eid") + " is less than 10k, adding 5k in it");
                    sal = sal+5000;
                    rs.updateFloat(3, sal);
                    rs.updateRow();
                }
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
