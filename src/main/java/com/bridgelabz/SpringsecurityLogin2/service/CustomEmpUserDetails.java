package com.bridgelabz.SpringsecurityLogin2.service;

import com.bridgelabz.SpringsecurityLogin2.Model.Emp;
import com.bridgelabz.SpringsecurityLogin2.repo.EmpRepo;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;


public class CustomEmpUserDetails implements UserDetails
{
    private final Emp emp;

    public CustomEmpUserDetails(Emp emp) {
        super();
        this.emp = emp;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        System.out.println("inside UserDetails impl class");
        return Collections.singleton(new SimpleGrantedAuthority(emp.getRole()));
    }

    @Override
    public String getPassword() {
        return emp.getPassword();
    }

    @Override
    public String getUsername() {
        return emp.getEmpusername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
