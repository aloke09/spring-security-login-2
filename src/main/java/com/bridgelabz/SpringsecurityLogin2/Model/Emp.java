package com.bridgelabz.SpringsecurityLogin2.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Entity
@Table(name = "emplogin")
public class Emp
{
    @Id
    private int empid;
    private String empusername;
//    @JsonIgnore
    private String password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empid=" + empid +
                ", empusername='" + empusername + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
