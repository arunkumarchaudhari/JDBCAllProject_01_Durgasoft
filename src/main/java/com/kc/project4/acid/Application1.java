package com.kc.project4.acid;

import java.sql.*;
import java.util.Scanner;

/**
 * @author arunkc
 * @version 1.0
 * @description Atomicity property : If anything goes wrong, we should be able to rollback the transation
 *          => Here we will try to insert data into db, if given data is correct then we will insert else we won't insert into db
 *
 */

public class Application1 {
    public static void main(String[] args) {
        Connection con = null;
        Scanner sc = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
            sc = new Scanner(System.in);
            con.setAutoCommit(false);
            PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?)");
            while(true){
                System.out.print("Enter EID       :");
                int eid= sc.nextInt();
                System.out.print("Enter ename   :");
                String ename=sc.next();
                System.out.print("Enter esal    :");
                float esal = sc.nextFloat();
                System.out.print("Enter eaddr   :");
                String eaddr= sc.next();
                ps.setInt(1,eid);
                ps.setString(2,ename);
                ps.setFloat(3,esal);
                ps.setString(4,eaddr);
                int rowCount = ps.executeUpdate();
                if(rowCount>0){
                    System.out.println("Records for EID: "+eid+" inserted successfully.");
                } else{
                    System.out.println("Failed to insert records into db");
                }
                System.out.print("Do you want to insert more[yes/no]?   :");
                String option = sc.next();
                if(option.equalsIgnoreCase("no")){
                    break;
                }
            }
            System.out.println("As all the transation was success, we are performing commit to insert records permanently");
            con.commit();
        } catch (Exception e){
            try {
                System.out.println("error while insertint into employee, rolling back");
                if(con!=null) con.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                if(sc!=null) sc.close();
                if(con!=null) con.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
