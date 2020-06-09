package com.nanshenycd.kaoqin.pojo;

import java.util.Date;

public class Attence {
    private int id;//id
    private String empname;//员工姓名
    private String dept;//部门
    private Date chkdata;//登记日期
    private String status;//考勤类型


    @Override
    public String toString() {
        return "Attence{" +
                "id=" + id +
                ", empname='" + empname + '\'' +
                ", dept='" + dept + '\'' +
                ", chkdata=" + chkdata +
                ", status='" + status + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Date getChkdata() {
        return chkdata;
    }

    public void setChkdata(Date chkdata) {
        this.chkdata = chkdata;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
