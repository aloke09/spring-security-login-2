package com.bridgelabz.SpringsecurityLogin2.repo;

import com.bridgelabz.SpringsecurityLogin2.Model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<Emp,Integer>
{
    Emp findByEmpusername(String empusername);
}
