package com.kc.project4.rowSet;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JoinRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author arunkc
 * @version 1.0
 * @description JoinRowSet: to join tow rowset objects content into single rowset object.
 *              STEPS:
 *                  1. Create 2 tables with a join columns
 *                  2. Create CachedRowSet obj w.r.t both the tables
 *                  3. Create joinRowSet object
 *                  4. add two rowset obj to JoinRowSet
 *                  5. Read data from JoinRowSet
 *
 */

public class Application11 {
    public static void main(String[] args) {
        CachedRowSet crs1= null;
        CachedRowSet crs2=null;
        JoinRowSet jrs = null;
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
            crs1 = RowSetProvider.newFactory().createCachedRowSet();
            crs1.setCommand("select * from emp");
            crs1.execute(con);
            crs2 = RowSetProvider.newFactory().createCachedRowSet();
            crs2.setCommand("select * from dept");
            crs2.execute(con);

            jrs = RowSetProvider.newFactory().createJoinRowSet();
            jrs.addRowSet(crs1,"eid");
            jrs.addRowSet(crs2,"eid");

            System.out.println("EID\tENAME\tESAL\t\tEADDR\t\tDEPTID\t\tDEPTNAME");
            System.out.println("---------------------------------------------------------------------");
            while(jrs.next()){
                System.out.print(jrs.getString("EID")+"\t");
                System.out.print(jrs.getString("ENAME")+"\t");
                System.out.print(jrs.getString("ESAL")+"\t");
                System.out.print(jrs.getString("EADDR")+"\t\t\t");
                System.out.print(jrs.getString("DEPTID")+"\t\t");
                System.out.print(jrs.getString("DEPTNAME")+"\n");

            }

        }catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                if(crs1!=null) crs1.close();
                if(crs2!=null) crs2.close();
                if(jrs!=null) jrs.close();
                if(con!=null) con.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
