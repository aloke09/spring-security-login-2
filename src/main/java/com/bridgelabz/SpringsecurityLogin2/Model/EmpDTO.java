package com.bridgelabz.SpringsecurityLogin2.Model;

public class EmpDTO
{

    private int empid;
    private String empusername;
    private String role;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpusername() {
        return empusername;
    }

    public void setEmpusername(String empusername) {
        this.empusername = empusername;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
