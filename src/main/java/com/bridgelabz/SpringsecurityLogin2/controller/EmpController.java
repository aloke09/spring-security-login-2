package com.bridgelabz.SpringsecurityLogin2.controller;

import com.bridgelabz.SpringsecurityLogin2.Model.Emp;
import com.bridgelabz.SpringsecurityLogin2.Model.EmpDTO;
import com.bridgelabz.SpringsecurityLogin2.service.EmpReg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController
{
    @Autowired
    private EmpReg reg;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @GetMapping("/home")
    public String getAllEmpDetails()
    {
        return "all emp details";
    }
    @PostMapping("/reg")
    public EmpDTO insertEmp(@RequestBody Emp emp)
    {
        emp.setPassword(passwordEncoder.encode(emp.getPassword()));
        Emp insert = reg.insert(emp);

        EmpDTO dto=new EmpDTO();
        dto.setEmpid(insert.getEmpid());
        dto.setEmpusername(insert.getEmpusername());
        dto.setRole(insert.getRole());
        return dto;
    }
}
