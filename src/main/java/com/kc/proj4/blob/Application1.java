package com.kc.proj4.blob;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author arun.kc
 * @version 1.0
 * @descriptoin  Inserting blob data into db through PreparedStatement.
 *                  -> Simple statement doesn't support BLOB
 *
 *
 *                  NOTE: In real life project, no one insert image directly into db table, insted they upload img into cloud and store path of that cloud img.
 *
 *                  CLOB: Character Large Object, CLOB is a data type in databases, it able to manage large volumes of the character data like documents like xml documents,...
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

public class Application1 {
    public static void main(String[] args) {

        try(
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
                ){
            PreparedStatement ps = con.prepareStatement("insert into emp1 values(?,?,?)");
            ps.setInt(1,111);
            ps.setString(2,"AAA");
            File file = new File("/home/arunkc/Desktop/Switch.png");
            FileInputStream fis = new FileInputStream(file); //get data into binary streams.
            ps.setBlob(3,fis, file.length()); //index, binary file, file length
            int rowCount = ps.executeUpdate();
            if(rowCount>0){
                System.out.println("Data inserted successfully...");
            } else{
                System.out.println("Failed to insert data into emp1.....");
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
