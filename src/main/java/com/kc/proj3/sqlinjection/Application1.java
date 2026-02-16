package com.kc.proj3.sqlinjection;

import javax.swing.plaf.nimbus.State;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author arun.kc
 * @version 1.0
 * Description Demo of SQL injection with Simple statement
 *      Objective: check if uname and pass is valid or not from user_info table
 *
 *      In command prompts:
 *      if userName is given as <userName>'--
 *          In sql, '-- is comment, so we are commenting rest part of the sql query which will comment password validation as
 *          password part is commented
 *          Enter userName:
 *          arun.kc' #
 *          Enter password:
 *          Dummy password
 *          -> # used to comment in mysql, so final query becomes
 *          select * From user_info where uname='arun.kc' # and pass='kc';
 *          -> As After #, this part is commented so we are getting valid as output, since password is never verified
 *
 *      Issue 2 with simple statement:
 *      if userName is temp'#, we won't be able to fetch data even if we provide valid password, as sql syntax become wrong
 *
 */

public class Application1 {
    public static void main(String[] args) {
        try(
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                ){
            Statement st = con.createStatement();
            System.out.println("Enter userName:: ");
            String uName=br.readLine();
            System.out.println("Enter password:: ");
            String password = br.readLine();
            String query="select * From user_info where uname='" +uName+ "' and password=" +password+ "' ";
            System.out.println("Final executing query::: "+query);
            ResultSet rs = st.executeQuery(query);
            if(rs.next()){
                System.out.println("Valid credentials");
            } else{
                System.out.println("Invalid Credentials");
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
