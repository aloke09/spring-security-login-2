package com.bridgelabz.SpringsecurityLogin2.service;

import com.bridgelabz.SpringsecurityLogin2.Model.Emp;
import com.bridgelabz.SpringsecurityLogin2.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EmpReg
{
    @Autowired
    private EmpRepo repo;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public Emp insert(Emp emp)
    {
        return repo.save(emp);
    }
}
