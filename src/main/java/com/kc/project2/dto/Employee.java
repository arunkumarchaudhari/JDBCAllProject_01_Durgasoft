package com.kc.project2.dto;

public class Employee {
    private String eid;
    private String ename;
    private String esal;
    private String eaddr;

    //Generate Getters and Setters for all the fields
    public String getEid(){
        return eid;
    }
    public void setEid(String eid){
        this.eid = eid;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public String getEaddr() {
        return eaddr;
    }
    public void setEaddr(String eaddr) {
        this.eaddr = eaddr;
    }
    public String getEsal() {
        return esal;
    }
    public void setEsal(String esal) {
        this.esal = esal;
    }

}
