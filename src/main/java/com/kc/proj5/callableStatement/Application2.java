package com.kc.proj5.callableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
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
 * @programOjbective :  Get data from below stored function
 * DELIMITER $$
 *
 * CREATE FUNCTION avg_salary(empId1 INT, empId2 INT)
 * RETURNS DECIMAL(10,2)
 * DETERMINISTIC
 * BEGIN
 *     DECLARE sal1 DECIMAL(10,2);
 *     DECLARE sal2 DECIMAL(10,2);
 *     DECLARE avgSal DECIMAL(10,2);
 *
 *     -- Get salaries
 *     SELECT esal INTO sal1 FROM employee WHERE eid = empId1;
 *     SELECT esal INTO sal2 FROM employee WHERE eid = empId2;
 *
 *     -- Calculate average
 *     SET avgSal = (sal1 + sal2) / 2;
 *
 *     RETURN avgSal;
 * END$$
 *
 * DELIMITER ;
 */

public class Application2 {
    public static void main(String[] args) {
        try(
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
                Scanner sc = new Scanner(System.in);
                ){
            CallableStatement cst = con.prepareCall("{? = call avg_salary(?,?)}");
            System.out.print("Enter First EID    :");
            int eid1 = sc.nextInt();
            System.out.print("Enter Second EID   :");
            int eid2= sc.nextInt();
            cst.setInt(2,eid1);
            cst.setInt(3,eid2);
            cst.registerOutParameter(1,Types.FLOAT);
            cst.execute();
            float avgSalary=cst.getFloat(1);
            System.out.println("Avg salary:: "+avgSalary);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
