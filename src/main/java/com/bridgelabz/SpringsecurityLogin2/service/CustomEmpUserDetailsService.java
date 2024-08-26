package com.bridgelabz.SpringsecurityLogin2.service;

import com.bridgelabz.SpringsecurityLogin2.Model.Emp;
import com.bridgelabz.SpringsecurityLogin2.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.bridgelabz.SpringsecurityLogin2.service.CustomEmpUserDetails;

@Service
public class CustomEmpUserDetailsService implements UserDetailsService
{
    @Autowired
    private final EmpRepo repo;

    public CustomEmpUserDetailsService(EmpRepo repo) {
        this.repo = repo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        Emp byEmpusername = repo.findByEmpusername(username);
        if(byEmpusername==null)
        {
            System.err.println("emp not found");
            throw new UsernameNotFoundException("emp user name not found");
        }

        return new CustomEmpUserDetails(byEmpusername);
    }
}
