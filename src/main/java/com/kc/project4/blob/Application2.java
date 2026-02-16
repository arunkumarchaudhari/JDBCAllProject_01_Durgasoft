package com.kc.project4.blob;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * @author arun.kc
 * @version 1.0
 * @description To read an img from db table and store it into target: /home/arunkc/Desktop/Switch_new.png
 *              Steps:
 *                  1. get resultset obj
 *                  2. get data from the columns
 *                  3. To get blob type data:
 *                      Read total data in form of binary streams
 *                      Prepare the target file
 *                      Read bit by bit from input streams and write bit by bit into target file.
 *
 *
 *               CLOB: Character Large Object, CLOB is a data type in databases, it able to manage large volumes of the character data like documents like xml documents,...
 *
 * CLOB type operations or conventions are almost all same as BLOB type conventions only but the following replacements.
 *
 *
 * BLOB           --------------->   CLOB
 * InputStream    --------------->   Reader
 * OutputStream   --------------->   Writer
 * FileInputStream -------------->   FileReader
 * FileOutputStream ------------->   FileWriter
 * setBinaryStream() ------------>   setCharacterStream()
 * getBinaryStream() ------------>   getCharacterStream()
 * -----                                -----
 * -----                                -----
 */

public class Application2 {
    public static void main(String[] args) {

        try(
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
                Scanner sc = new Scanner(System.in);
                ){
            PreparedStatement ps = con.prepareStatement("select * From emp1 where ENO=?");
            System.out.print("Enter EID::: ");
            int eId= sc.nextInt();
            ps.setInt(1,eId);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                System.out.println("EID: "+rs.getInt(1));
                System.out.println("ENAME: " + rs.getString(2));
                InputStream is = rs.getBinaryStream(3);
                FileOutputStream targetFile = new FileOutputStream("/home/arunkc/Desktop/Switch_new.png");
                int val = is.read();
                while(val !=-1){
                    targetFile.write(val);
                    val=is.read();
                }
                System.out.println("EIMG: /home/arunkc/Desktop/Switch_new.png");
                System.out.println("Data fetch successfully....");
            } else{
                System.out.println("No emp found with EID: "+eId);
            }


        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
