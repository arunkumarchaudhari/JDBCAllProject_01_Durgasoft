package com.kc.project4.callableStatement;

import java.sql.*;
import java.util.Scanner;

/**
 * @author arun.kc
 * @version 1.0
 * @description
 * Steps to use CallableStatement in Jdbc applications:
 * -----------------------------------------------------
 * 1. Prepare stored procedure or function  at database side.
 * 2. Create CallableStatement object with the procedure / function call.
 * 3. If we have any IN Type Parameter in CallableStatement object then
 *    set data to In type parameter.
 * 4. If we have any OUT type paramater in CallableStatement object then
 *    register OUT Type parameter with a particular data type.
 * 5. Execute Procedure / Function
 * 6. Get data from OUT Type Parameter.
 *
 * @programOjbective :  Get data from below stored procedure
 * DROP PROCEDURE IF EXISTS getSal;
 *
 * DELIMITER $$
 *
 * CREATE PROCEDURE getSal(
 *     IN no INT,
 *     OUT sal FLOAT
 * )
 * BEGIN
 *     SELECT esal INTO sal
 *     FROM employee
 *     WHERE eid = no;
 * END $$
 *
 * DELIMITER ;
 */

public class Application1 {
    public static void main(String[] args) {
        try(
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
                Scanner sc = new Scanner(System.in);
                ){
            CallableStatement cst = con.prepareCall("{call getSal(?,?)}");
            System.out.print("Enter EID: ");
            int eid = sc.nextInt();
            cst.setInt(1,eid);
            cst.registerOutParameter(2,Types.FLOAT);
            cst.execute();
            float salary=cst.getFloat(2);
            if(salary==0.0){
                System.out.println("EID: "+eid+" doesnot exist in employee table");
            } else{
                System.out.println("Employee EID: "+eid+" Salary is::: "+salary);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
