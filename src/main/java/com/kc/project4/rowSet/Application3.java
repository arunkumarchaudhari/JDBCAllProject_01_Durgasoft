package com.kc.project4.rowSet;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

/**
 * @author arunkc
 * @version 1.0
 * @description update records through rowset into db
 */

public class Application3 {
    public static void main(String[] args) {
        JdbcRowSet jdbcRowSet= null;
        try{
            jdbcRowSet= RowSetProvider.newFactory().createJdbcRowSet();
            jdbcRowSet.setUrl("jdbc:mysql://localhost:3306/jdbc1");
            jdbcRowSet.setUsername("root");
            jdbcRowSet.setPassword("root");
            jdbcRowSet.setCommand("select * from employee");
            jdbcRowSet.execute();
            while(jdbcRowSet.next()){
                float sal = jdbcRowSet.getFloat("ESAL");
                if(sal<10000){
                    float newSal = sal+500;
                    jdbcRowSet.updateFloat(3,newSal);
                    jdbcRowSet.updateRow();
                    System.out.println("Salary updated for EID: "+jdbcRowSet.getInt("EID"));
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                if(jdbcRowSet!=null) jdbcRowSet.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
