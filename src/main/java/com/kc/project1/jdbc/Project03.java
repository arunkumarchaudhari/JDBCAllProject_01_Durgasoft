package com.kc.project1.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author: arun.kc
 * @version: 1.0
 * @description: When we execute nonselect sql query with execute method, it returns false
 *              When we use execute method
 *              -> when we take query dymanically from user.
 *              -> as user can input any query, it may be select or non-select, if we are confirm it is select then we can go for executeQuery or if non-select then we can go for executeUpdate, but here we don't know what query user will enter.
 *              -> in this scanerio, we can go for execute method
 */
public class Project03 {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
            st=con.createStatement();
            boolean execute=st.execute("update emp set ename='AAA' where ename='ABC'");
            System.out.println("execute method return value: "+execute); //false
            int totalRowUpdate=st.getUpdateCount();
            System.out.println("Total row update: "+totalRowUpdate);

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                if(con!=null) con.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
