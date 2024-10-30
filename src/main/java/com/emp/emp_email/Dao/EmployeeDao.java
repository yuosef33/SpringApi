package com.emp.emp_email.Dao;

import com.emp.emp_email.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {
    List<Employee> findByName(String name);


}
